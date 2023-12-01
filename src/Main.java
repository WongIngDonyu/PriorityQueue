public class Main {
    public static void main(String[] args) {
        MaxHeap<Integer> maxHeap = new MaxHeap<>();

        maxHeap.add(5);
        maxHeap.add(123);
        maxHeap.add(4213);
        maxHeap.add(5324);
        maxHeap.add(333);
        maxHeap.add(2287);
        maxHeap.printHeap();

        System.out.println("Наивысший элемент: " + maxHeap.peek());
        System.out.println("Размер кучи: " + maxHeap.size());

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        priorityQueue.add(5);
        priorityQueue.add(123);
        priorityQueue.add(4213);
        priorityQueue.add(5324);
        priorityQueue.add(333);
        priorityQueue.add(2287);
        priorityQueue.printQueue();

        System.out.println("Максимальный элемент: " + priorityQueue.peek());
        priorityQueue.remove(2);
        System.out.println("Размер очереди: " + priorityQueue.size());
        priorityQueue.printQueue();
        priorityQueue.remove(1);
        priorityQueue.printQueue();
    }
}