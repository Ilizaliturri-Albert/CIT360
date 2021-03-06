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
