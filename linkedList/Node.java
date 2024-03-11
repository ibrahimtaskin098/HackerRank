
package linkedList;


public class Node {
    //properties
    Node next;
    int data;
    
    // constructors
    
    public Node(int newData){
        this.data = newData;
        this.next = null;
    }
    
    public Node(int newData, Node newNext){
        this.data = newData;
        this.next = newNext;
    }
    
    //getters and setters
    public int getData(){
        return data;
    }
    public Node getNext(){
        return next;
    }
    public void setData( int newData){
        this.data = newData;
        
    }
    public void setNext(Node newNext){
        this.next = newNext;
    }
            
    
}
