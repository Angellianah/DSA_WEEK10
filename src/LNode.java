//Reigna Jules Garcia

import javax.swing.JOptionPane;
import java.lang.*;

/** LinkedList is an algorithm that stores data dynamically as it uses memory address.
 * Storing may happen at the beginning, in the middle and at the last. Same goes to
 * deletion. It does NOT store the data in a sequential manner, instead it uses the
 * Node(data,address) that link between them to forming a chain or link list.
 * @author Reigna Jules Garcia
 */
public class LNode<Object>{
    private Object data;
    private LNode next;
    private LNode head;

    public void error_message(String msg) {
        JOptionPane.showMessageDialog(null, msg,
        "Error", JOptionPane.ERROR_MESSAGE);
    }

    public LNode(){
        next=head=null;
    }

    public boolean isEmpty(){
        return head == null;
    }

    public void addAtFirst (Object value) {
        LNode newNode = new LNode () ;
        if (isEmpty () ) {
            newNode.data = value;
            newNode.next = null;
            head = newNode;
        } else {
            newNode.data = value;
            newNode.next = head;
            head = newNode;
        }
    }

    public String traverse () {
        if (isEmpty () ) {
            return "List is empty";
        } else {
            String hold = "";
            LNode link = head;
            while (link != null) {
                hold+="|"+link.data+"|" +link.next+"|\n";
                link = link.next;
            }
            return "head Node|"+head+"\n"+hold;
        }
    }

    public void addAtLast(Object value){
        if(isEmpty()){
            addAtFirst(value);
        } else {
            LNode link = head;
            while(link.next != null) {
                link = link.next;
            }
            LNode newNode = new LNode();
            newNode.data = value;
            newNode.next = null;
            link.next = newNode;
        }
    }
    public int currentSize() {
        int counter = 1;
        if(isEmpty()) {
            error_message("List is empty");
        } else {
            LNode link = head;
            while(link.next!=null) {
                link = link.next;
                counter++;
            }
        }
        return counter;
    }

    //Task 1
    public void addAtPosition(Object value, int position) {
        if(isEmpty()){
            error_message("List is EMPTY. Node is added at the Beginning");
            addAtFirst(value);
        } else if(position==0) {
            error_message("Node is added at the beginning");
            addAtFirst(value);
        } else if (position < 1 || position > currentSize()) {
            error_message(position+" is NOT valid");
        } else {
            LNode visit, link;
            visit = link = head;
            int ctr = 1;
            while(ctr!=position){
                link = visit;
                visit = visit.next;
                ctr++;
            }
            while(link.next!=visit){
                link = link.next;
            }
            LNode newNode = new LNode();
            newNode.data = value;
            newNode.next = visit;
            link.next=newNode;
        }
    }

    public void deleteAtFirst(){
        if(isEmpty()) {
            error_message("Deleting Not Allowed. Linked List is empty.");
        } else {
            LNode link = head;
            head = link.next;
            System.out.println("Deleting is Successful !");
        }
    }

    //Task 2
    public void deleteAtLast() {
        if(isEmpty())
        error_message("Deleting Not Allowed. Linked List is empty.");
        else {
            LNode visit,link;
            visit = link = head;
            while(visit.next != null) {
                visit = visit.next;
            }
            while(link.next != visit) {
                link = link.next;
            }
            link.next = null;
            System.out.println("Deleting is Successful!");
        }
    }
    
    //Task 3
    public void deleteAtPosition(int position) {
        if(isEmpty()){
            error_message("The list is empty. Try to add value");
        } else if(position==0) {
            deleteAtFirst();
        } else if(position<0 || position>=currentSize()) {
            error_message("Position is NOT valid");
        } else {
            LNode visit,link,pointer;
            visit = link = pointer = head;
            int ctr = 0;
            while(ctr!=position) {
                visit= visit.next;
                ctr++;
            }
            while(link.next!=visit) {
                link = link.next;
            }
            link.next = pointer;
            while(ctr!=position+1) {
                pointer = pointer.next;
                ctr++;
            }
            visit.next = pointer;
        }
    }

    //Task 4
    public Object getFirst() {
        Object value = null;
        if (isEmpty()) {
            error_message("The list is empty. Try to add a value");
        } else {
            LNode link = head;
            value = (Object) link.data;
        }

        return value;
    }

    //Task 5
    public Object getLast() {
        Object value = null;

        if (isEmpty()) {
            error_message("The list is empty. Try to add a value");
        } else {
            LNode link = head;
            while (link.next != null) {
                link = link.next;
            }
            value = (Object) link.data;
        }

        return value;
    }
    // Add a node in the middle (half the Node size)
    public void addInMiddle(Object value) {
        int size = currentSize();
        int position = size / 2;
        addAtPosition(value, position);
    }

    // Delete a node in the middle
    public void deleteInMiddle() {
        int size = currentSize();
        int position = size / 2;
        deleteAtPosition(position);
    }

    // Delete a value that exists in a linked list
    public void deleteValue(Object value) {
        if (isEmpty()) {
            error_message("The list is empty. Try to add a value");
            return;
        }

        if (head.data.equals(value)) {
            deleteAtFirst();
            return;
        }

        LNode<Object> current = head;
        LNode<Object> previous = null;

        while (current != null && !current.data.equals(value)) {
            previous = current;
            current = current.next;
        }

        if (current != null) {
            previous.next = current.next;
        } else {
            error_message("Value not found in the list.");
        }
    }

    // Return the Position of a value
    public int indexAt(Object value) {
        int index = 0;
        LNode<Object> current = head;

        while (current != null && !current.data.equals(value)) {
            current = current.next;
            index++;
        }

        if (current != null) {
            return index;
        } else {
            return -1; // Value not found in the list
        }
    }

    // Returns a value based on a specific position or index
    public Object get(int position) {
        if (isEmpty() || position < 0) {
            error_message("The list is empty or the position is invalid.");
            return null;
        }

        if (position == 0) {
            return (Object) head.data;
        }

        LNode<Object> current = head;
        int index = 0;

        while (current != null && index < position) {
            current = current.next;
            index++;
        }

        if (current != null) {
            return current.data;
        } else {
            error_message("Position not found in the list.");
            return null;
        }
    }
}
