interface QueueImpl {
    void insert(int value) throws Exception;
    int delete() throws Exception;
    void display();
}

class QueueDemo implements QueueImpl {
    private int[] queue = new int[10];
    private int front = -1;
    private int rear = -1;

    @Override
    public void insert(int value) throws Exception {
        if (rear == queue.length - 1) {
            throw new Exception("Queue Overflow: Cannot insert, the queue is full.");
        }
        if (front == -1) front = 0;
        queue[++rear] = value;
    }

    @Override
    public int delete() throws Exception {
        if (front == -1 || front > rear) {
            throw new Exception("Queue Underflow: Cannot delete, the queue is empty.");
        }
        return queue[front++];
    }

    @Override
    public void display() {
        if (front == -1 || front > rear) {
            System.out.println("Queue is empty.");
            return;
        }
        System.out.print("Queue: ");
        for (int i = front; i <= rear; i++) {
            System.out.print(queue[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        QueueDemo queue = new QueueDemo();
        try {
            queue.insert(10);
            queue.insert(20);
            queue.insert(30);
            queue.display();
            System.out.println("Deleted: " + queue.delete());
            queue.display();
            queue.delete();
            queue.delete();
            queue.delete(); // Underflow
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
