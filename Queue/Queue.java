public class Queue {

	private int size;
    private int[] queueArr;
    private int front = -1;
    private int rear = -1;
    private int totalItems;
 
    public Queue(int s) {
        size = s;
        queueArr = new int[s];
    }
 
    public void enqueue(int i) {
        rear++;
        System.out.println("Inserting "+i);
        queueArr[rear] = i;
        totalItems++;
    }
 
    public int dequeue() {
        front++;
        totalItems--;
        System.out.println("Removing "+queueArr[front]);
        return queueArr[front];
    }
 
    public boolean isFull() {
        return (totalItems == size);
    }
 
    public boolean isEmpty() {
        return (totalItems == 0);
    }

    public int getFront() {
    	return queueArr[this.front+1];
    }
    public int getRear() {
    	return queueArr[this.rear];
    }
    
}
