/* 
 * SillyHibernateUseExample.java source code
 * The purpose of this class is to show how some of the abilities of Hibernate
 * are used.  Covered in this example application are; adding records to tables,
 * modifying records in tables, removing records from tables, and
 * using a Many-To-Many relationship between tables.
 */
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.Query;
public class SillyHibernateUseExample {
    private List<User> users;
    
    public SillyHibernateUseExample() {
        // TODO Auto-generated constructor stub
    }
    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        SillyHibernateUseExample aSillyHibernateUseExample = new SillyHibernateUseExample();
        aSillyHibernateUseExample.addNewUsers();
        aSillyHibernateUseExample.showAllUsers();
        aSillyHibernateUseExample.modifyUser();
        aSillyHibernateUseExample.addSharedPhoneNumber();
/*        aSillyHibernateUseExample.deleteAddedUsers(); */
    }
    /*
     * show how to add records to the database
     */
    private void addNewUsers() {
        Session session = HibernateUtilSingleton.getSessionFactory().getCurrentSession();
        /*
         * all database interactions in Hibernate are required to be inside a transaction.
         */
        Transaction transaction = session.beginTransaction();
        /*
         * create some User instances.
         */
        User MalloryUser = new User();
        MalloryUser.setUname("Mallory");
        MalloryUser.setPword("Ilizal");
       
        User JuanUser = new User();
        JuanUser.setUname("Juan");
        JuanUser.setPword("Juan");
        
        PhoneNumber JuanPhone = new PhoneNumber();
        JuanPhone.setPhone("323 206 2190");
        
        User ilizalUser = new User();
        ilizalUser.setUname("Albert");
        ilizalUser.setPword("Ilizal");
        
        /*
         * save each instance as a record in the database
         */
        session.save(MalloryUser);
        session.save(JuanUser);
        session.save(JuanPhone);
        session.save(ilizalUser);
        transaction.commit();
        /*
         * prove that the User instances were added to the database and that
         * the instances were each updated with a database generated id.
         */
      System.out.println("aUser generated ID is: " + MalloryUser.getId());
        System.out.println("anotherUser generated ID is: " + ilizalUser.getId());
    } 
    
    /*
     * show how to get a collection of type List containing all of the records in the app_user table
     */
    private void showAllUsers() {
        Session session = HibernateUtilSingleton.getSessionFactory().getCurrentSession();
        Transaction transaction = session.beginTransaction();
        /*
         * execute a HQL query against the database.  HQL is NOT SQL.  It is object based.
         */
        Query allUsersQuery = session.createQuery("select u from User as u order by u.id");
        /*
         * get a list of User instances based on what was found in the database tables.
         */
        users = allUsersQuery.list();
        System.out.println("num users: "+users.size());
        /*
         * iterate over each User instance returned by the query and found in the list.
         */
        Iterator<User> iter = users.iterator();;
        while(iter.hasNext()) {
            User element = iter.next();
            System.out.println(element.toString());
            System.out.println("num of phone numbers: "+element.getPhoneNumbers().size());
        }
        transaction.commit();
    }
    
    /*
     * show how to modify a database record
     */
    private void modifyUser() {
        
        Session session = HibernateUtilSingleton.getSessionFactory().getCurrentSession();
        Transaction transaction = session.beginTransaction();
        /*
         * get a single User instance from the database.
         */
        Query singleUserQuery = session.createQuery("select u from User as u where u.uname='Albert'");
        User AlbertUser = (User)singleUserQuery.uniqueResult();
        /*
         * change the user name for the Java instance
         */
        AlbertUser.setUname("A.J.");
        /*
         * call the session merge method for the User instance in question.  This tells the database that the instance is ready to be permanently stored.
         */
        session.merge(AlbertUser);
        
        /*
         * call the transaction commit method.  This tells the database that the changes are ready to be permanently stored.
         */
        transaction.commit();
        /*
         * permanently store the changes into the database tables.
         */
        showAllUsers();
    }
    
    private void addSharedPhoneNumber() {
        Session session = HibernateUtilSingleton.getSessionFactory().getCurrentSession();
        Transaction transaction = session.beginTransaction();
        /*
         * get two User instances from the database using HQL.  This is NOT SQL.  It is object based.
         */
        Query AlbertQuery = session.createQuery("select u from User as u where u.uname='Albert'");
        User AlbertUser = (User)AlbertQuery.uniqueResult();
        
        Query JuanQuery = session.createQuery("select u from User as u where u.uname='Juan'");
        User JuanUser = (User)JuanQuery.uniqueResult();
        
        /*
         * create a PhoneNumber instance
         */
        PhoneNumber sharedPhoneNumber = new PhoneNumber();
        sharedPhoneNumber.setPhone("(666)777-8888");
                                   
       /*
        * add the shared phone number to the AlbertUser 
        */
       
       Set<PhoneNumber> AlbertPhoneNumbers = AlbertUser.getPhoneNumbers(); 
       AlbertPhoneNumbers.add(sharedPhoneNumber);
       /*
        * set the single phone number to be used by more than one User
        */
       Set<PhoneNumber> aNamePhoneNumbers = JuanUser.getPhoneNumbers();
       aNamePhoneNumbers.add(sharedPhoneNumber);
       /*
        * inform the database that the phone number should be ready for permanent storage.
        */
       session.save(sharedPhoneNumber);
       /*
        * inform the database that the modified User instances should be ready for permanent storage.
        */
       session.merge(AlbertUser);
       session.merge(JuanUser);
       /*
        * permanently store the changes into the database tables.
        */
       transaction.commit();
       /*
        * show that the database was updated by printing out all of the User instances created by a HQL query
        */
       showAllUsers();
    }
 private void deleteAddedUsers() {
            // TODO Auto-generated method stub
            Session session = HibernateUtilSingleton.getSessionFactory().getCurrentSession();
            Transaction transaction = session.beginTransaction();
            
            int numUsers = users.size();
            System.out.println("user count: "+numUsers);
            for(int i = 0; i < numUsers; i++){
                System.out.println("deleting user "+users.get(i).getUname());
                session.delete(users.get(i));
            }
            transaction.commit();
            /*
             * at this point the records have been removed from the database but still exist in our class list attribute.
             * Do not store lists retrieved from the database since they will be out of synch with the database table from which they come.
             * This example shows that you should not store retrieved lists.
             */
           System.out.println(users);
            users.clear();
            /*
             * now the Java instances are also gone and the database is back to its original state so the example application can be run again.
             */
           System.out.println(users); 
        } 
                                   
                                   }
