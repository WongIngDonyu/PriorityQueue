public class PriorityQueue<E extends Comparable<E>> implements AbstractQueue<E> {
    private MaxHeap<E> maxHeap;

    public PriorityQueue() {
        this.maxHeap = new MaxHeap<>();
    }

    @Override
    public int size() {
        return maxHeap.size();
    }

    @Override
    public void add(E element) {
        maxHeap.add(element);
    }

    @Override
    public E peek() {
        if(size()==0){
            throw new IllegalStateException("Queue is empty");
        }
        return maxHeap.peek();
    }

    @Override
    public E poll() {
        if(size()==0){
            throw new IllegalStateException("Queue is empty");
        }
        return maxHeap.poll();
    }
    public void printQueue() {
        maxHeap.printHeap();
    }
    public void printBeautifulQueue() {
        maxHeap.printBeautifulTree();
    }


    @Override
    public E remove(int index) {
        if(index<0 || index>=size()){
            throw new IllegalStateException("Invalid index");
        }
        return maxHeap.remove(index);
    }

}
