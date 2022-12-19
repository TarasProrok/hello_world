package module9;

public class Node {

    private Object data; //Data in the current node
    private Node nextNode; //Reference for the next node
    private Node previousNode; // Reference for the previous node

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Node getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }

    public Node getPreviousNode() {
        return previousNode;
    }

    public void setPreviousNode(Node previousNode) {
        this.previousNode = previousNode;
    }

    Node(Object data) {
        this.data = data;
        nextNode = null;
        previousNode = null;
    }
}
