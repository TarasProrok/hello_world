package module9;

public class MyQueue {
    private int length;
    private Node head;
    private Node tail;

    public MyQueue() {
        length = 0;
        head = null;
        tail = null;
    }

    // function Inserts an element at the end of the Queue.
    public void add(Object data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            tail.setNextNode(newNode);
        }
        tail = newNode;
        length++;
    }

    // Removes and returns the element at the front of the Queue.
    public Object poll() throws Exception {
        if (head == null) {
            throw new Exception("Queue is empty");
        }
        Object result = head.getData();
        head = head.getNextNode();
        length--;
        if (head == null) {
            tail = null;
        }
        System.out.println("First element to remove - " + result);
        return result;
    }

    // Returns the element at front without removing it.
    public Object peek() throws Exception {
        if (head == null) {
            throw new Exception("Queue is empty");
        }
        System.out.println("First element - " + head.getData());
        return head.getData();
    }

    // Returns the number of elements stored in the queue.
    public int size() {
        System.out.println("Size of list is - " + length);
        return length;
    }

    public void clear() {
        Node currentNode = head;
        for (; currentNode != null; ) {
            Node next = currentNode.getNextNode();
            currentNode.setData(null);
            currentNode.setNextNode(null);
            currentNode = next;
        }
        head = tail = null;
        length = 0;
        System.out.println("List is cleared!");
    }
    public void show() {
        Node newNode = head;
        if (newNode == null) {
            System.out.println("list is empty");
        } else {
            while (newNode != null) {
                System.out.print(newNode.getData() + " ");
                newNode = newNode.getNextNode();
            }
            System.out.println("");
        }
    }
}
class MyQueueTest {
    public static void main(String[] args) throws Exception {
        MyQueue my = new MyQueue();
        my.add(1);
        my.add(2);
        my.add(3);
        my.add(4);
        my.add(5);
        my.add(6);
        my.show(); //prints the list
        my.peek(); //shows first element
        my.size(); //size of the list
        my.poll(); // shows and removes first element
        my.show(); // prints the list
        my.size(); // size of the list
        my.clear(); // clears the list
        my.size();
    }
}