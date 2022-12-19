package module9;
import java.util.Arrays;

public class MyArrayList {
    private Object[] myStore;
    private int actSize = 0;

    public MyArrayList() {
        myStore = new Object[10];
    }

    //function to add an element to the list
    public void add(Object obj) {
        if (myStore.length - actSize < 5) {
            increaseSize();
        } else {
            myStore[actSize++] = obj;
        }
    }

    private void increaseSize() {
        myStore = Arrays.copyOf(myStore, myStore.length * 2);
    }

    //function to show the data by index
    public Object get(int index) {
        if (index < actSize) {
            System.out.println("Data in index " + index + " is " + myStore[index]);
            return myStore[index];
        } else {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public void show() {
        if (actSize == 0) {
            System.out.print("Array list is empty");
        } else {
            for (int i = 0; i < myStore.length; i++) {
                if (myStore[i] != null) {
                    System.out.print(myStore[i] + " ");
                }
            }
            System.out.println("");
        }
    }

    //function to show the size of list
    public int size() {
        System.out.println("Size is " + actSize);
        return actSize;
    }

    //function to delete an element at the given index
    public void remove(int index) {
        if (index > actSize) {
            throw new ArrayIndexOutOfBoundsException();
        } else {
            System.out.println("Element to remove " + myStore[index]);
            myStore = Arrays.copyOf(myStore, myStore.length - 1);
            for (int i = index; i < actSize; i++) {
                myStore[i] = myStore[i + 1];
            }
            actSize--;
        }
    }

    //function to clear the list
    public void clear() {
        myStore = Arrays.copyOf(myStore, 0);
        actSize = 0;
        System.out.println("List is cleared!");
    }
}
class MyArrayListTest {
    public static void main(String[] args) {
        MyArrayList my = new MyArrayList();

        my.add(10);
        my.add(20);
        my.add(30);
        my.add(40);
        my.add(50);
        my.show(); // shows the list
        my.size(); // size of the list
        my.remove(4); // removes the element by index
        my.show();
        my.size();
        my.get(3); //shows the element by index
        my.clear(); //clears the list
    }
}
