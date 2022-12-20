package module9;

import java.util.LinkedList;

public class MyLinkedList {
    private int length;
    private Node head;
    private Node tail;

    public MyLinkedList() {
        length = 0;
        head = null;
        tail = null;
    }

    //function to add an element to the list at the end if there are element already and at the start if no elements are there
    public void add(Object data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.setNextNode(newNode);
            newNode.setPreviousNode(tail);
            this.tail = newNode;
        }
        length++;
    }

    //function to delete an element at the given index
    public void remove(int index) {
        if (index > 0 && index <= length) {
            Node temp = head;
            for (int i = 0; i < index; i++) {
                temp = temp.getNextNode();
            }
            temp.getPreviousNode().setNextNode(temp.getNextNode());
            temp.getNextNode().setPreviousNode(temp.getPreviousNode());
            length--;
        } else {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    //function to show the list
    public void show() {
        Node currentNode = head;
        if (currentNode == null) {
            System.out.println("Linked list is empty");
        } else {
            while (currentNode != null) {
                System.out.print(currentNode.getData() + " ");
                currentNode = currentNode.getNextNode();
            }
            System.out.println("");
        }
    }

    //function to show the size of list
    public int size() {
            System.out.println("Size of list is - " + length);
            return length;
        }

    //function to show the data by index
    public Object get(int index) {
        Node temp = head;
        while (index > 0 && index < length) {
            index--;
            temp = temp.getNextNode();
            if (temp == null) {
                return null;
            }
        }
        System.out.println("Data is - " + temp.getData());
        return temp.getData();
    }

    //function to clear the list
    public void clear() {
        Node currentNode = head;
        for ( ; currentNode != null; ) {
            Node next = currentNode.getNextNode();
            currentNode.setData(null);
            currentNode.setNextNode(null);
            currentNode.setPreviousNode(null);
            currentNode = next;
        }
        head = tail = null;
        length = 0;
    }
}

class MyLinkedListTest {
    public static void main(String[] args) {
        MyLinkedList my = new MyLinkedList();
        my.add(12);
        my.add(43);
        my.add(2020);
        my.add(192);
        my.add(28);
        my.show(); // prints the list
        my.size(); // size of the list
        my.remove(3); // removes element by index
        my.show();
        my.size();
        my.get(2); // shows element by index
        my.clear(); // clears the list
        my.show();
    }
}