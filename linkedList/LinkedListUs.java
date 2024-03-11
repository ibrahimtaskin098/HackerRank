
package linkedList;

import java.util.LinkedList;


public class LinkedListUs {
    
     // properties
        Node head;
        int count;
        // Constructor\
        public LinkedListUs(Node newHead){
            this.head = newHead;
            count = 1;
            
        }
        
        // add
        public void add(int newData){
            Node temp = new Node(newData);
             Node current = head;
             while(current.getNext() != null){
                 current =current.getNext();
             }
             current.setNext(temp);
            count++;
        }
    //get
         public int get(int index){
             if(index<=0){
                 return -1;
             }
             Node current = head;
             for( int i=1 ; i<index ; i++ ){
                 current = current.getNext();
             }
             
             return current.getData();
         }
       
         //size
         public int size(){
             return count;
         }
         
         //isEmpty
         public boolean isEmpty(){
             return head == null;
         }
    
    // remove 
         public void remove(){
             Node current = head;
             while(current.getNext().getNext()!= null){
                 current = current.getNext();
             }
             current.setNext(null);
             count--;
         }
    
    
    public static void main(String[] args) {
       LinkedList<String> lists = new LinkedList();
       lists.add("bablu");
       lists.add("kamal");
       for(String list : lists){
           System.out.println(list);
       }
       
    }
}
