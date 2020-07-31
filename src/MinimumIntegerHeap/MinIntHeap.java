package MinimumIntegerHeap;

import java.util.Arrays;

public class MinIntHeap {
    // Set capacity and size of the array
    private int capacity = 10;
    private int size = 0;

    // Initialize the array
    int[] items = new int[capacity];

    // Functions to get index of the respective nodes
    private int getLeftChildIndex(int parentIndex){return 2* parentIndex+1;}
    private int getRightChildIndex(int parentIndex){return 2* parentIndex+2;}
    private int getParentIndex(int childIndex){return (childIndex-1)/2;}

    // Function to check whether respective nodes exists
    private boolean hasLeftChild(int index){return getLeftChildIndex(index) <size;};
    private boolean hasRightChild(int index){return getRightChildIndex(index) <size;};
    private boolean hasParent(int index){return  getParentIndex(index) >=0;}

    // Functions to get the respective node elements
    private int leftChild(int index) {return items[getLeftChildIndex(index)];}
    private int rightChild(int index) {return items[getRightChildIndex(index)];}
    private int parent(int index) {return  items[getParentIndex(index)];}

    // Function to swap two nodes based on its index
    private void swap(int indexOne, int indexTwo){
        int temp = items[indexOne];
        items[indexOne] = items[indexTwo];
        items[indexTwo] = temp;
    }

    // Function to extend the capacity of the array, iff its capacity is filled (size = capacity)
    private void ensureExtraCapacity(){
        if(size == capacity){
            items = Arrays.copyOf(items,capacity*2);
            capacity *=2;
        }
    }

    // Take a look at the top of the heap
    public int peek(){
        if(size==0) throw new IllegalStateException();
        int item = items[0];
        items[0] = items[size-1];
        size--;
        heapifyDown();
        return item;
    }

    // Add an element to the heap
    public void add(int item){
        ensureExtraCapacity();
        items[size] = item;
        size++;
        heapifyUp();
    }

    // Function to swap the parent node with child node if the parent is larger than its child
    public void heapifyUp(){
        int index = size-1;
        while (hasParent(index)&&parent(index)>items[index]){
            swap(getParentIndex(index),index);
            index = getParentIndex(index);
        }
    }


    public void heapifyDown(){
        int index = 0;
        // Do this only if the node contains 1 or more childs
        while ((hasLeftChild(index))){
            int smallerChildIndex = getLeftChildIndex(index);
            // Find the smaller child if right child exist
            if(hasRightChild(index)&& rightChild(index)<leftChild(index)){
                smallerChildIndex = getRightChildIndex(index);
            }
            // If the node is already smaller than the smaller child, leave it as it is, or else swap it
            if(items[index]<items[smallerChildIndex]){
                break;
            }else {
                swap(index,smallerChildIndex);
            }
            index=smallerChildIndex;
        }
    }
}
