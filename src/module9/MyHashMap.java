package module9;
public class MyHashMap {
        private int capacity = 16; //Initial default capacity

        private Entry [] table; //Array of Entry object
        private int length;

        public MyHashMap(){
            this.capacity = capacity;
            table = new Entry[capacity];
            length = 0;
        }

        public void put(Object key, Object value){
            length++;
            int index = index(key);
            Entry newEntry = new Entry(key, value, null);
            if(table[index] == null){
                table[index] = newEntry;
            }else {
                Entry previousNode = null;
                Entry currentNode = table[index];
                while(currentNode != null){
                    if(currentNode.getKey().equals(key)){
                        currentNode.setValue(value);
                        length--;
                        break;
                    }
                    previousNode = currentNode;
                    currentNode = currentNode.getNext();
                }
                if(previousNode != null)
                    previousNode.setNext(newEntry);
            }
        }

        public Object get(Object key){
            Object value = null;
            int index = index(key);
            Entry entry = table[index];
            while (entry != null){
                if(entry.getKey().equals(key)) {
                    value = entry.getValue();
                    break;
                }
                entry = entry.getNext();
            }
            return value;
        }

        public void remove(Object key){
            length--;
            int index = index(key);
            Entry previous = null;
            Entry entry = table[index];
            while (entry != null){
                if(entry.getKey().equals(key)){
                    if(previous == null){
                        entry = entry.getNext();
                        table[index] = entry;
                        return;
                    }else {
                        previous.setNext(entry.getNext());
                        return;
                    }
                }
                previous = entry;
                entry = entry.getNext();
            }
        }

        public void display(){
            for(int i = 0; i < capacity; i++){
                if(table[i] != null){
                    Entry currentNode = table[i];
                    while (currentNode != null){
                        System.out.println(String.format("Key is %s and value is %s", currentNode.getKey(), currentNode.getValue()));
                        currentNode = currentNode.getNext();
                    }
                }
            }
        }
        public int size() {
                return length;
                }

        private int index(Object key){
            if(key == null){
                return 0;
            }
            return Math.abs(key.hashCode() % capacity);
        }
    }

class Entry {

    private Object key;
    private Object value;
    private Entry next;

    public Entry(Object key, Object value, Entry next){
        this.key = key;
        this.value = value;
        this.next = next;
    }

    public Object getKey() {
        return key;
    }

    public void setKey(Object key) {
        this.key = key;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public Entry getNext() {
        return next;
    }

    public void setNext(Entry next) {
        this.next = next;
    }
}
class MyHashMapTest {
    public static void main(String[] args){
        MyHashMap myHashMap = new MyHashMap();
        System.out.println("Adding entries in my map");
        myHashMap.put(null, "Nothing");
        myHashMap.put(1, "Red");
        myHashMap.put(2, "Green");
        System.out.println("Size of my Map is "+myHashMap.size());
        System.out.println("Displaying all the entry in map");
        myHashMap.display();
        System.out.println("Removing the entry with key 2");
        myHashMap.remove(2);
        System.out.println("Size of my Map is "+myHashMap.size());
        myHashMap.display();
        System.out.println("Adding duplicate key 1 in map");
        myHashMap.put(1, "Blue");
//        myHashMap.put(2, "Yellow");
        System.out.println("Size of my Map is "+myHashMap.size());
        System.out.println("Displaying all the entry in map again");
        myHashMap.display();
        System.out.println("Adding entry with key 17 in map");
        myHashMap.put(17, "Purple");
        System.out.println("Size of my Map is "+myHashMap.size());
        myHashMap.display();
        System.out.println("Getting the entry by key 1");
        System.out.println("Key is 1 and entry is "+myHashMap.get(1));
        System.out.println("Displaying all the entry in map one more time");
        myHashMap.display();
        System.out.println("Size of my Map is "+myHashMap.size());
    }
}
