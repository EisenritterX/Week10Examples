package PriorityQueue;
import java.util.*;
public class PriQueueTest {
    public static void main(String[] args) {
        // Creating empty priority queue
        PriorityQueue<String> pQueue = new PriorityQueue<String>();

        // Populating Items
        pQueue.add("C");
        pQueue.add("C++");
        pQueue.add("Java");
        pQueue.add("Python");

        // Printing the most priority element
        System.out.println("Head value using peek function:" + pQueue.peek());

        // Printing all element
        System.out.println("The queue elements:");
        Iterator itr = pQueue.iterator();
        while (itr.hasNext())
            System.out.println(itr.next());

        pQueue.poll();
        System.out.println("After removing an element with poll function:");
        Iterator<String> itr2 = pQueue.iterator();
        while (itr2.hasNext())
            System.out.println(itr2.next());

        pQueue.remove("Java");
        System.out.println("After removing an element with poll function:");
        Iterator<String> itr3 = pQueue.iterator();
        while (itr3.hasNext())
            System.out.println(itr3.next());

        boolean b = pQueue.contains("C");
        System.out.println("Priority queue contains C or not?: "+b );

        Object[] arr = pQueue.toArray();
        System.out.println("Value in array: ");
        for(int i=0;i<arr.length;i++) System.out.println("Value: "+arr[i].toString());
    }
}
