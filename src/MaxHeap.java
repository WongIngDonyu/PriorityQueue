import java.util.ArrayList;
import java.util.List;

public class MaxHeap <E extends Comparable<E>> implements Heap<E>{

    private List<E> heap;

    public MaxHeap() {
        this.heap = new ArrayList<>();
    }

    @Override
    public int size() {
        return heap.size();
    }

    @Override
    public void add(E element) {
        heap.add(element);
        heapifyUp(size() - 1);
    }

    private void heapifyUp(int index){
        while (index>0){
            int parentIndex=(index-1)/2;
            if(heap.get(index).compareTo(heap.get(parentIndex))>0){
                E temp = heap.get(index);
                heap.set(index, heap.get(parentIndex));
                heap.set(parentIndex, temp);
                index=parentIndex;
            }
            else {
                break;
            }
        }
    }

    @Override
    public E peek() {
        if(size()==0){
            throw new IllegalStateException("Heap is empty");
        }
        return heap.get(0);
    }

    @Override
    public E poll() {
        if(size()==0){
            throw new IllegalStateException("Heap is empty");
        }
        E maxElement = heap.get(0);
        heap.set(0, heap.get(size()-1));
        heap.remove(size()-1);
        heapifyDown(0);
        return maxElement;
    }
    private void heapifyDown(int index){

        int leftChildIndex;
        int rightChildIndex;
        int maxIndex;

        while (true) {
            leftChildIndex = 2 * index + 1;
            rightChildIndex = 2 * index + 2;
            maxIndex = index;
            if (leftChildIndex < size() && heap.get(leftChildIndex).compareTo(heap.get(maxIndex)) > 0) {
                maxIndex = leftChildIndex;
            }
            if (rightChildIndex < size() && heap.get(rightChildIndex).compareTo(heap.get(maxIndex)) > 0) {
                maxIndex = rightChildIndex;
            }
            if (maxIndex == index) {
                break;
            }
            E temp = heap.get(index);
            heap.set(index, heap.get(maxIndex));
            heap.set(maxIndex, temp);
            index = maxIndex;
        }
    }
    public void printHeap() {
        for (E element : heap) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
    public E remove(int index){
        if(index<0 || index>=size()){
            throw new IllegalStateException("Invalid index");
        }
        E removeElement = heap.get(index);
        int lastIndex=size()-1;
        if (index < lastIndex) {
            heap.set(index, heap.get(lastIndex));
            heapifyUp(index);
            heapifyDown(index);
        }
        heap.remove(lastIndex);
        return removeElement;
    }

}
