public class ArrQueue {
    int[] queue;
    int head;
    int tail;
    int size;

    public ArrQueue(int size){ //constructor
        head = -1;
        tail = -1;
        this.size = size;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public boolean enqueue(int element){
        if(tail != queue.length - 1){
            tail++;
            queue[tail] = element;
            size++;
            return true;
        } else {
            return false;
        }
    }

    public int peek(){
        int elementToPeek = 0;
        if(!isEmpty()){
            elementToPeek = queue[head];
        }
        return elementToPeek;
    }

    public int dequeue(){
        int elementToDeque = 0;
        if (!isEmpty()){
            head++;
            elementToDeque = queue[head];
            size--;
        }
        return elementToDeque;
    }
}
