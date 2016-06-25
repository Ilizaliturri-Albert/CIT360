# Threads, Executors, Runnables, Handlers


####Threads

- Java allows multi-threading. This means it can have multiple processes that can run concurrently.
- Threads are lightweight compared to processing.
- Threads share the same address space making it so it can share data and code.

There are two was to create a thread.

* Implement the Runnable interface (java.lang.Runnable)
* Extend the Thread class (java.lang.Thread)

```sh
$ import java.lang.*;
$ public class Counter extends Thread 
$ {                      
$        public void run()                       
$        {              
$        ....            
$        }
$ }
```

#### Executors

- This is the newest way to be able to multithread in Java. 
- It allows groups to thread as a ThreadPool to save CPU usage. 
- This prevents lots of threads.

#### Runnables

- This allows more modular development.

#### Handlers

- 
