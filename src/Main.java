public class Main {
    public static void main(String[] args) {
        MaxHeap<Integer> maxHeap = new MaxHeap<>();

        maxHeap.add(20);
        maxHeap.add(10);
        maxHeap.add(15);
        maxHeap.add(5);
        maxHeap.add(12);
        maxHeap.add(13);
        maxHeap.printBeautifulTree();

        System.out.println("Наивысший элемент: " + maxHeap.peek());
        System.out.println("Размер кучи: " + maxHeap.size());

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        priorityQueue.add(20);
        priorityQueue.add(10);
        priorityQueue.add(15);
        priorityQueue.add(5);
        priorityQueue.add(12);
        priorityQueue.add(13);
        priorityQueue.printBeautifulQueue();

        System.out.println("Максимальный элемент: " + priorityQueue.peek());
        priorityQueue.remove(2);
        System.out.println("Размер очереди: " + priorityQueue.size());
        priorityQueue.printBeautifulQueue();
        System.out.println("----");
        priorityQueue.remove(1);
        priorityQueue.printBeautifulQueue();
    }
}