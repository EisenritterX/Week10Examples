package PriorityQueue;
import java.util.*;
public class PriQueueQuiz {
    public static void main(String[] args) {
        // Creating empty priority queue
        PriorityQueue<String> pQueue = new PriorityQueue<String>();

        PriorityQueue<String> pQueue2 = new PriorityQueue<String>();

        // Populating Items
        pQueue.add("COMP 212");
        pQueue.add("COMP 254");
        pQueue.add("MATH 201");
        pQueue.add("COMP 311");
        pQueue.add("ENGL 210");

        // Populating Items
        pQueue2.add("Football");
        pQueue2.add("Basketball");
        pQueue2.add("Soccer");
        pQueue2.add("Badminton");
        pQueue2.add("Skate");

        // Printing all element
        System.out.println("The queue elements:");
        Iterator itr = pQueue.iterator();
        while (itr.hasNext())
            System.out.println(itr.next());

        pQueue.remove("COMP 254");
        System.out.println("After removing an element with COMP 254 function:");
        Iterator<String> itr2 = pQueue.iterator();
        while (itr2.hasNext())
            System.out.println(itr2.next());

        // Printing all element
        System.out.println("The queue elements:");
        Iterator itr3 = pQueue.iterator();
        while (itr3.hasNext())
            System.out.println(itr3.next());

        System.out.println();

        pQueue.poll();
        System.out.println("After removing an element with poll function:");
        Iterator<String> itr4 = pQueue.iterator();
        while (itr4.hasNext())
            System.out.println(itr4.next());

        // Printing all element
        System.out.println("The queue elements:");
        Iterator itr5 = pQueue.iterator();
        while (itr5.hasNext())
            System.out.println(itr5.next());

        System.out.println();

        // Printing all element
        System.out.println("The queue elements:");
        Iterator itr6 = pQueue2.iterator();
        while (itr6.hasNext())
            System.out.println(itr6.next());

        System.out.println();

        pQueue2.poll();
        System.out.println("After removing an element with poll function:");
        Iterator<String> itr9 = pQueue2.iterator();
        while (itr9.hasNext())
            System.out.println(itr9.next());

        // Printing all element
        System.out.println("The queue elements:");
        Iterator itr10 = pQueue2.iterator();
        while (itr10.hasNext())
            System.out.println(itr10.next());

        System.out.println();

        pQueue2.remove("Football");
        System.out.println("After removing an element with Football function:");
        Iterator<String> itr7 = pQueue2.iterator();
        while (itr7.hasNext())
            System.out.println(itr7.next());

        // Printing all element
        System.out.println("The queue elements:");
        Iterator itr8 = pQueue2.iterator();
        while (itr8.hasNext())
            System.out.println(itr8.next());

        Object[] arr = pQueue.toArray();
        System.out.println("Value in array: ");
        for(int i=0;i<arr.length;i++) System.out.println("Value: "+arr[i].toString());
    }
}
