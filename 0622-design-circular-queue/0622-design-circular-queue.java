class MyCircularQueue {
    private int a[];
    private int rear;
    private int front;
    private int size;
    private int cap;

    public MyCircularQueue(int k) {
        this.cap=k;
        a=new int[cap];
        this.size=0;
        this.rear=-1;
        this.front=0;
    }
    
    public boolean enQueue(int value) {
        if(isFull()){
            return false;
        }
        rear=(rear+1)%cap;
        a[rear]=value;
        size++;
        return true;
    }
    
    public boolean deQueue() {
        if(isEmpty()){
            return false;
        }
        front=(front+1)%cap;
        size--;
        return true;
    }
    
    public int Front() {
        if(isEmpty()){
            return -1;
        }
        return a[front];
    }
    
    public int Rear() {
        if(isEmpty()){
            return -1;
        }
        return a[rear];
    }
    
    public boolean isEmpty() {
        return size==0;
    }
    
    public boolean isFull() {
        return size==cap;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */