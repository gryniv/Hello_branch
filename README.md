
###  Calculator
In Math Calculator you need to implement realisation for input any line with math operations and get output with the correct answer.

To run this program you need to run

Here is an example of code work:

```
12:28:26 [main] INFO  org.training.calculator.MathRunner - Enter an expression:
2+6+6*8-5
12:28:39 [main] INFO  org.training.calculator.MathRunner - Result: 51
```

---

### Hash Calculator
In Hash Calculator you can encode any `md5` strings and decode low case `md5` stings.
Decode must be implemented with Threads. This code doesn't have a dump for any hash results, every time when you start decode string, the program brute force all possible combinations of low case English letters from `a` to infinity.

For encode your string you need to input:
```
encode titkos
```
For decode your string you need to input:
```
decode 4fd0101ea3d0f5abbe296ef97f47afec
```

Here is an example of decode work:
```
12:41:52 [main] INFO  org.training.calculator.HashRunner - Enter an expression: 
decode 4fd0101ea3d0f5abbe296ef97f47afec
12:41:55 [main] INFO  org.training.calculator.operations.hash.MD5HashOperations - [start=0, end=1]
12:57:22 [main] INFO  org.training.calculator.operations.hash.MD5HashOperations - [start=1, end=3]
...
12:41:55 [main] INFO  org.training.calculator.operations.hash.MD5HashOperations - [start=23, end=25]
12:42:03 [pool-2-thread-14] INFO  org.training.calculator.operations.hash.MD5HashOperations - Hash found for 8.22 sec
12:42:03 [main] INFO  org.training.calculator.HashRunner - Result: titkos
```

---

## Circular Buffer
This is my realisation for **Circular Buffer**. This buffer can contain any objects and have fixed-size buffer as if it were connected end-to-end. This structure lends itself easily to buffering data streams.

For create new Circular Buffer input (where `10` is length of buffer):
```java
 CircularBuffer<String> circularBuffer = new CircularBuffer<>(10);
```
---

## Linked List & ArrayList 
Create own realisation of LinkedList And ArrayList

d
