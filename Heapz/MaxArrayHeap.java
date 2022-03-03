package Heapz;

import java.util.Arrays;

public class MaxArrayHeap implements Heap {

    private int[] array;
    private int size;

    public MaxArrayHeap() {
        this.size = 0;
        this.array = new int[3];
    }

    private void swap(int source, int dest) {
        if (source != dest) {
            int temp = array[dest];
            array[dest] = array[source];
            array[source] = temp;
        }
    }

    @Override
    public String toString() {
        return Arrays.toString(array) + ", " + this.size;
    }

    @Override
    public void add(int value) {
        if (this.size == this.array.length) {
            int[] bigger = Arrays.copyOf(array, size*2);
            this.array = bigger;
        }
        array[size] = value;

        int child = this.size;
        int parent = (child - 1) / 2;
        while (this.array[parent] > this.array[child]) {
            int temp = array[parent];
            array[parent] = array[child];
            array[child] = temp;
            child = parent;
            parent = (child - 1) / 2;
        }
        this.size++;
    }

    @Override
    public int remove() {
        int value = array[0];
        this.size--;

        array[0] = array[this.size];
        array[this.size] = 0; // null

        //sift down
        int parent = 0;
        // As long as parent is less than the size
        while (parent < this.size) { 
            int left = parent * 2 + 1;
            int right = parent * 2 + 2;

            int dest = parent;

            if (left < size) {
                dest = left;
            }

            if (right < size && array[right] < array[left]) {
                dest = right;
            }

            if (array[dest] < array[parent]) {
                swap(dest, parent);
                parent = dest;
            } else {
                break;
            }
        }
        return value;
    }

    @Override
    public int size() {
        return this.size;
    }   

    public static void main(String[] args) {
        Heap heap = new ArrayHeap();

        heap.add(5);
        heap.add(4);
        heap.add(3);
        heap.add(2);
        heap.add(1);

        System.out.println(heap);
        while (heap.size() > 0) {
            System.out.println(heap.remove());
            System.out.println(heap);
        }
    }
}
