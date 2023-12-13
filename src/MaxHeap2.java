import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MaxHeap2<E extends Comparable<E>> implements Heap2<E>{

    private LinkedList<E> heap;

    public MaxHeap2() {
        this.heap = new LinkedList<>();
    }
    @Override
    public void add(E element) {
        heap.add(element);
        heapifyUp();
    }
    @Override
    public E peek() {
        if (isEmpty()) {
            return null;
        }
        E max = heap.getFirst();
        int lastIdx = heap.size() - 1;
        heap.set(0, heap.get(lastIdx));
        heap.remove(lastIdx);
        heapifyDown();
        return max;
    }

    @Override
    public void printBeaty() {
        print("", 0, false);
    }

    private void print(String prefix, int index, boolean isRight) {
        if (index < heap.size()) {
            print(prefix + ("    "), 2 * index + 2, true);
            System.out.println(prefix + ("    ") + heap.get(index));
            print(prefix + ("    "), 2 * index + 1, false);
        }
    }

    public boolean isEmpty() {
        return heap.isEmpty();
    }

    public int size() {
        return heap.size();
    }

    private void heapifyUp() {
        int index = size() - 1;

        while (hasParent(index) && getParent(index).compareTo(heap.get(index)) < 0) {
            swap(getParentIndex(index), index);
            index = getParentIndex(index);
        }
    }

    private void heapifyDown() {
        int index = 0;

        while (hasLeftChild(index)) {
            int largerChildIndex = getLeftChildIndex(index);

            if (hasRightChild(index) && getRightChild(index).compareTo(getLeftChild(index)) > 0) {
                largerChildIndex = getRightChildIndex(index);
            }

            if (heap.get(index).compareTo(heap.get(largerChildIndex)) < 0) {
                swap(index, largerChildIndex);
            } else {
                break;
            }

            index = largerChildIndex;
        }
    }

    private int getParentIndex(int i) {
        return (i - 1) / 2;
    }

    private int getLeftChildIndex(int i) {
        return 2 * i + 1;
    }

    private int getRightChildIndex(int i) {
        return 2 * i + 2;
    }

    private boolean hasParent(int i) {
        return getParentIndex(i) >= 0;
    }

    private boolean hasLeftChild(int i) {
        return getLeftChildIndex(i) < size();
    }

    private boolean hasRightChild(int i) {
        return getRightChildIndex(i) < size();
    }

    private E getParent(int i) {
        return heap.get(getParentIndex(i));
    }

    private E getLeftChild(int i) {
        return heap.get(getLeftChildIndex(i));
    }

    private E getRightChild(int i) {
        return heap.get(getRightChildIndex(i));
    }

    private void swap(int i, int j) {
        E temp = heap.get(i);
        heap.set(i, heap.get(j));
        heap.set(j, temp);
    }
}
