public class ThreadRunnableExample implements Runnable{
 
        public void run(){
               
                for(int i=0; i < 5; i++){
                        System.out.println("Child Thread : " + i);
                       
                        try{
                                Thread.sleep(50);
                        }
                        catch(InterruptedException ie){
                                System.out.println("Child thread interrupted! " + ie);
                        }
                }
               
                System.out.println("Child thread finished!");
        }
       
        public static void main(String[] args) {
               
                //To create new thread, use Thread(Runnable thread, String threadName)
               
                Thread t = new Thread(new ThreadRunnableExample(), "My Thread");
               
                //To start a particular thread, use void start() method of Thread class. 
                //After creation of a thread it will not start running until we call start method.
                 
                t.start();
               
                for(int i=0; i < 5; i++){
                       
                        System.out.println("Main Thread : " + i);
                       
                        try{
                                Thread.sleep(100);
                        }
                        catch(InterruptedException ie){
                                System.out.println("Child thread interrupted! " + ie);
                        }
                }
                System.out.println("Main thread finished!");
        }
}
