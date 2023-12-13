public class Main {
    public static void main(String[] args) {
        MaxHeap2<Integer> maxHeap = new MaxHeap2<>();

        maxHeap.add(15);
        maxHeap.add(5);
        maxHeap.add(10);
        maxHeap.add(30);
        maxHeap.add(25);
        maxHeap.add(40);
        maxHeap.printBeaty();

        System.out.println("Наивысший элемент: " + maxHeap.peek());
        System.out.println("Размер кучи: " + maxHeap.size());

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        priorityQueue.add(15);
        priorityQueue.add(5);
        priorityQueue.add(10);
        priorityQueue.add(30);
        priorityQueue.add(25);
        priorityQueue.add(40);
        priorityQueue.printBeautifulQueue();

        System.out.println("Максимальный элемент: " + priorityQueue.peek());
        priorityQueue.remove(2);
        System.out.println("Размер очереди: " + priorityQueue.size());
        priorityQueue.printBeautifulQueue();
        System.out.println("--------------------");
        priorityQueue.remove(1);
        priorityQueue.printBeautifulQueue();
    }
}