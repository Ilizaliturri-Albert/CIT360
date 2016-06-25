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
