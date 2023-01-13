public class Main {
    public static void main (String[] args){
        ArrQueue queue = new ArrQueue(5); //init arrqueue of size 5

        //populate queue
        queue.enqueue("Melinda");
        queue.enqueue("Remi");
        queue.enqueue("Jean");
        queue.enqueue("Esther");
        queue.enqueue("Lorenzo");

        System.out.println("Peeking first person in queue!");
        System.out.println(queue.peek()); //call peek function

        queue.dequeue(); //dequeue
        System.out.println("First person removed from queue! Peeking who is first now!");
        System.out.println(queue.peek());


    }

}
