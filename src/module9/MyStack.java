package module9;

import java.util.EmptyStackException;

public class MyStack {
    int length = 0;
    Node head = null;

    public MyStack() {
    }

    // inserting an element at the end of the list
    public void push(Object data) {
        Node newNode = new Node(data);
        if(this.head == null){
            head = newNode;
        }else {
            Node temp = head;
            while(temp.getNextNode() != null){
                temp = temp.getNextNode();
            }
            temp.setNextNode(newNode);
        }
        length++;
    }

    // returns data at the top of the stack but not removed from the list.
    public Object peek() {
        if (head == null) {
            throw new EmptyStackException();
        }
        System.out.println("First element of the list is - "+head.getData());
        return head.getData();
    }

    // Removes and returns the element at the front of the list.
    public Object pop() throws Exception {
        if (head == null) {
            throw new Exception("Empty queue");
        }
        Object result = head.getData();
        head = head.getNextNode();
        length--;
        if (head == null) {
            head = null;
        }
        System.out.println("Removing first element " + result);
        return result;
    }

    //function to delete an element at the given index
    public void remove(int index) {
        if (index > length) {
            throw new ArrayIndexOutOfBoundsException();
        } else {
            Node node = head;
            for (int i = 0; i < index - 1; i++) {
                node = node.getNextNode();
            }
            node.setNextNode(node.getNextNode().getNextNode());
        }
        System.out.println("Removing element in index "+index);
        length--;
    }

    public int size() {
        System.out.println("Size is " + length);
        return length;
    }

    public void clear() {
        head = null;
        length = 0;
        System.out.println("List is cleared!");
    }

    public void show() {
        Node newNode = head;
        if (newNode == null) {
            System.out.println("Linked list is empty");
        } else {
            while (newNode != null) {
                System.out.print(newNode.getData() + " ");
                newNode = newNode.getNextNode();
            }
            System.out.println("");
        }
    }
}
class MyStackTest {
    public static void main(String[] args) throws Exception {
        MyStack my = new MyStack();
        my.push("One");
        my.push("Two");
        my.push("Three");
        my.push("Four");
        my.push("Five");
        my.show(); // prints the list
        my.peek(); // shows first element
        my.size(); //shows size of the list
        my.pop(); // shows and removes first element
        my.size();
        my.show();
        my.remove(2); //removes the element by index
        my.show();
        my.size();
        my.peek();
        my.clear(); // clears the list
        my.size();
    }
}
