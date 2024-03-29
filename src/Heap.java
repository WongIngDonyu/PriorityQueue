public interface Heap<E extends Comparable<E>> {
        int size();
        void add(E element);
        E peek();
        E poll();
        void printHeap();
        E remove(int index);
        }
