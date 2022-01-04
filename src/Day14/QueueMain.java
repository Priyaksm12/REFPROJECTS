package Day14;

public class QueueMain
{
    public static void main(String[] args) {
        Queue q = new Queue();

        q.enqueue(56);
        q.enqueue(30);
        q.enqueue(70);
        q.displayQueue();

        q.dequeue();
        q.displayQueue();
    }
}