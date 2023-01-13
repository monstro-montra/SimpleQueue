public class ArrQueue {
    String[] queue;
    int head;
    int tail;
    int size;

    public ArrQueue(int size){ //constructor
        queue = new String[size];
        head = -1;
        tail = -1;
        this.size = size;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public String enqueue(String element){
        if(tail != queue.length - 1) {
            tail++;
            queue[tail] = element;
            size++;
            return element;
        } else {
            return null;
        }

    }

    public String peek(){
        String elementToPeek = null;
        if(!isEmpty()){
            elementToPeek = queue[head + 1];
        }
        return elementToPeek;
    }

    public String dequeue(){
        String elementToDeque = null;
        if (size != 0){
            head++;
            elementToDeque = queue[head];
            size--;
        }
        return elementToDeque;
    }


}
