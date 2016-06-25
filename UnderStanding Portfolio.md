# Application Controller Pattern

- Application Control pattern is used to help the flow of the MVC. 
- It enables flow between pages, it manages and maintains user interaction. 

The following example is one I found online that makes more sense to me. I made adjustments to make sense to me. 
- My Example of Application Controller:

##### Application Controller Example (Run this file) (https://github.com/Ilizaliturri-Albert/CIT360/blob/master/Application-Controller/ApplicationControllerExample.java)

##### Application Controller (https://github.com/Ilizaliturri-Albert/CIT360/blob/master/Application-Controller/ApplicationController.java)

##### Dispatcher file (https://github.com/Ilizaliturri-Albert/CIT360/blob/master/Application-Controller/Dispatcher.java)

##### Albert bio file (https://github.com/Ilizaliturri-Albert/CIT360/blob/master/Application-Controller/Albert.java)
##### Mallory bio file (https://github.com/Ilizaliturri-Albert/CIT360/blob/master/Application-Controller/Mallory.java)
##### Justin bio file (https://github.com/Ilizaliturri-Albert/CIT360/blob/master/Application-Controller/Justin.java)

_________________________________________________________________________________________



# Client and Server Sockets

- Client and server is a program relationship in which one program requests a service or resource from another program. 
- Client and server model can be used by programs within a single computer. 
- The client establishes a connection to a server over the internet. 
- Once the server has fulfilled the clients request, the connection is terminated. 
- Client programs and server programs are often part of a larger program or app.
- The reason is because MULTIPLE client programs share the services of the same server. 

The server side blocks the designated port and waits for the client to connect. When the client finally connects the server and the client can exchange information. Once the client and the server close their connection then the port will be free for others to use.
Servers can be on any port between 0 and 65535. There are excpetions because some are reserved for other use, just be sure to check the port you want to use. 

### Sockets

- A sockets is one endpoint of a two way connection. 


My Examples for Client and Server Sockets:

##### Server side file. 
(https://github.com/Ilizaliturri-Albert/CIT360/blob/master/Client-and-Server-Sockets/Server.java)
##### Client side file. 
(https://github.com/Ilizaliturri-Albert/CIT360/blob/master/Client-and-Server-Sockets/Client.java)
##### Server side file of a simple messenger program.
(https://github.com/Ilizaliturri-Albert/CIT360/blob/master/Client-and-Server-Sockets/MessengerServer.java)
##### Client side file of a simple messenger program.
(https://github.com/Ilizaliturri-Albert/CIT360/blob/master/Client-and-Server-Sockets/MessengerClient.java)


_________________________________________________________________________________________



# HTTP URLConnection

- Each HttpUrlConnection is used to create a single request to a network connection to an HTTP server. 
- My Example for HTTP URLConnection:
- The example uses my personal website to connect to.


##### HTTP URLConnection(https://github.com/Ilizaliturri-Albert/CIT360/blob/master/HTTP-URLConnection/HttpUrlConnection.java)


_________________________________________________________________________________________



# Hibernate

- Hibernate is an object-relational mapping framework for Java. 
- It is a framework for mapping an object-oriented model to a database. 
- Hibernate is a free software. 
- Hibernate mapes Java classes to Database tables, as well to map Java data types to SQL data types.
- Hibernate is how we connect our java programing to a database for items that need to be stored for the application. 


- My Example of Hibernate: this code I received from Brother Barneys text book. Here I connected it to my website database and I can store user information.


SillyHibernateUseExample (https://github.com/Ilizaliturri-Albert/CIT360/blob/master/Hibernate/SillyHibernateUseExample.java)

HibernateUtilSingleton (https://github.com/Ilizaliturri-Albert/CIT360/blob/master/Hibernate/HibernateUtilSingleton.java)



_________________________________________________________________________________________


# JSON Serialization

Serialization means that is converts an object to a string. 
- We use serialization inorder to store and transfer complex objects to and from a file. 
- For more control over how an object is serialized, the JsonSerializer can be used. 
- The JsonSerializer is able to read and write JSON text directly to a using JsonTextReader and JsonTextWriter.

#### JSON (JavaScript Object Notation)

It allows several different types of elements. The mosted used are arrays and objects. 
- Arrays in JSON are  within Square Bracktes.
- The elements in the array are sepreated with a comma. 

Java
> {1, 2, 3, 4}

JSON
>"[1, 2, 3, 4]"

- My Example of JSON Serialization:

JSON Serialization example (https://github.com/Ilizaliturri-Albert/CIT360/blob/master/JSON-Serialization/JsonExample.java)


_________________________________________________________________________________________


# JUnit Tests

- JUnit test is a framework that allows us to write repeatable tests.
- This allows us to write a test for our code and update our code depending on if our code passes the test or not. 
- If you are not getting the expected results from the test then you can fix your actual program.


- My Example for JUnit Tests:

##### Loan Example (https://github.com/Ilizaliturri-Albert/CIT360/blob/master/JUnit-Tests/Loan.java)
##### JUnit Test for Loan File (https://github.com/Ilizaliturri-Albert/CIT360/blob/master/JUnit-Tests/LoanTest.java)

###Video Presentation:

I begin at 34:32 and I end at 41:00

(https://youtu.be/aa8QjEWA4VQ?t=34m32s)


_________________________________________________________________________________________


# Java Collections Addition, Removal, using Iterators (Map, List, Set, Tree)

Java collections is another framework that provides architecture to store and manipulate a group of objects. 

### Type of Operations

- Searching
- Sorting
- Insertion
- Manipulation 
- Deletion

### HashMap Class

- HashMap is used for storing Key & value pairs. 
- You can never know for sure how the map will be sorted.
- A hashmap contains values based in the key. It implements the map interface and extends AbstractMap.
- My Example of HashMap:

(https://github.com/Ilizaliturri-Albert/CIT360/blob/master/Java-Collections/HashMapExample.java)


### TreeMap Class

- TreeMap is similar to HashMap but the main difference is that TreeMap is sorted in ascending order. 
- TreeMap is unsynchronized collection class that means it does not work with thread-safe operations.
- My Example of TreeMap:

(https://github.com/Ilizaliturri-Albert/CIT360/blob/master/Java-Collections/TreeMapExample.java)

### ArrayList Class

- ArrayList is a class that implements a list interface. It is used for functionality and flexiblity it offers. 
- ArrayLists can grow and shrink depending on the need. 
- It enables the use of methods. 

- My Example of ArrayList Class:

(https://github.com/Ilizaliturri-Albert/CIT360/blob/master/Java-Collections/ListExample.java)

#### Methods in ArrayList
- The following method adds an object to an array list. 
```sh
obj.add("hello");
```

- The following method adds and object to an array list at the given index.
```sh
obj.add(2, "bye");
```

- The following method removes an object from an ArrayList.
```sh
obj.remove("Albert");
```

- The follwoing method removes an element from a given index.
```sh
obj.remove(3);
```

- The following method removes all elements of an array list. 
```sh
obj.clear();
```

### HashSet Class
Java Platform 7 on the Oracle website says that the following about HashSet:
>This class offers constant time performance for the basic operations (add, remove, contains and size), assuming the hash function >disperses the elements properly 

- My Example of HashSet:

(https://github.com/Ilizaliturri-Albert/CIT360/blob/master/Java-Collections/SetExample.java)

### TreeSet Class

- TreeSet is very similiar to HashSet with the exception that TreeSet sorts the elements in ascending order. 
- TreeSet allows null elements.
- My Example of TreeSet:

(https://github.com/Ilizaliturri-Albert/CIT360/blob/master/Java-Collections/TreeExample.java)

### Iterator

- Iterator is used for looping various collection classes such as HashMap, ArrayList and TreeMap. So it is similar to loops like for-loop, while loop, do-while, and for each loop.

(https://github.com/Ilizaliturri-Albert/CIT360/blob/master/Java-Collections/IteratorExample.java)


_________________________________________________________________________________________


# Model View Controller Pattern

- The MVC is a design pattern that assigns objects in an app to one of three roles. 
- This pattern is used to seperate application concerns.


- Model: this represents data and the rules that direct access as well as updates the data. 
- View: this show the content of what is in the Model. 
- Controller: this translates the user interaction with the view. 


- My Example of MVC:

##### Model (https://github.com/Ilizaliturri-Albert/CIT360/blob/master/Model-View-Controller/CarModel.java)
##### View (https://github.com/Ilizaliturri-Albert/CIT360/blob/master/Model-View-Controller/CarView.java)
##### Controller (https://github.com/Ilizaliturri-Albert/CIT360/blob/master/Model-View-Controller/CarController.java)
##### Example (https://github.com/Ilizaliturri-Albert/CIT360/blob/master/Model-View-Controller/CarMVCExample.java)
##### Car File (https://github.com/Ilizaliturri-Albert/CIT360/blob/master/Model-View-Controller/Car.java)


_________________________________________________________________________________________


# Threads, Executors, Runnables, Handlers


####Threads

- Java allows multi-threading. This means it can have multiple processes that can run concurrently.
- Threads are lightweight compared to processing.
- Threads share the same address space making it so it can share data and code.
- Use up a lot of memory.

There are two was to create a thread.

* Implement the Runnable interface (java.lang.Runnable)
* Extend the Thread class (java.lang.Thread)

```sh
 import java.lang.*;
 public class Counter extends Thread 
 {                      
        public void run()                       
        {              
        ....            
        }
 }
```

#### Executors

- This is the newest way to be able to multithread in Java. 
- It allows groups to thread as a ThreadPool to save CPU usage. 
- This prevents lots of threads.
- Is used with Runnable objects without creating new threads and recycles already created threads and uses them. 

#### Runnables

- This allows more modular development.
- Serparates code to run at different times.
- This is a type of class that is used in Threads. 

#### Handlers

- Handlers make it possible to send messages between two threads in a secure manner. 
- The message will be sent to the destination queue and wait there until the message is proccesed. 
- Handler class usually us LogManager.


- My Example of using Threads, Runnable, Executor, and handlers.

#####ThreadRunnableExample (https://github.com/Ilizaliturri-Albert/CIT360/blob/master/Threads-Executors-Runnables-Handlers/ThreadRunnableExample.java)
