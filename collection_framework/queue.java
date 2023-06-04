package collection_framework;

import java.util.LinkedList;
import java.util.Queue;
import java.util.PriorityQueue;
import java.util.ArrayDeque;
import java.util.Comparator;

public class queue {

  public static void main(String[] args) {

    // LinkedList implementation of Queue
    Queue<String> qu1 = new LinkedList<>();

    // Array implementation of Queue
    Queue<String> qu2 = new ArrayDeque<>();

    // Priority Queue implementation of Queue
    Queue<String> qu3 = new PriorityQueue<>();

    Queue<Integer> qu = new LinkedList<>();
    qu.offer(12); // add the element in queue;
    qu.offer(24);
    qu.offer(36);
    qu.offer(48);
    qu.offer(60);
    System.out.println(qu);
    System.out.println(qu.poll());// used to remove element from the front
    System.out.println(qu);
    System.out.println(qu.peek());

    /*
     * add() - Inserts the specified element into the queue. If the task is successful, add() returns true, if not it throws an exception.
     * offer() - Inserts the specified element into the queue. If the task is successful, offer() returns true, if not it returns false.
     */

    /*
     * remove() - Returns and removes the head of the queue. Throws an exception if the queue is empty.
     * poll() - Returns and removes the head of the queue. Returns null if the queue is empty.
     */


    //top element kuch order me hoga (increasing or decreasing) aur top(peek()) ke piche koii bhi random order me elemnt store hoga
    PriorityQueue<Integer> pq = new PriorityQueue<>();
    //PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder()); // this will change the priority from high to low
    pq.offer(900);
    pq.offer(1200);
    pq.offer(360);
    pq.offer(480);
    //priority is changed thats why this is priorityQueue
    System.out.println(pq);//[360, 480, 900, 1200]
    pq.poll();
    System.out.println("after deleting front element"+pq);



    
    //ArrayDeq
    ArrayDeque<Integer> arr = new ArrayDeque<>();
    arr.offer(10);
    arr.offer(20);
    arr.offer(30);
    arr.offer(40);
    arr.offer(50);
    System.out.println(arr);
    arr.offerFirst(60);// head me add kr dega
    arr.offerLast(90);
    // same aise peekFirst(), peekLast(), pollFirst(), pollLast()
    System.out.println(arr);

  }
}
