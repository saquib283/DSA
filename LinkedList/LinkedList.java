import java.util.Scanner;

public class LinkedList {
    Node head = null;
    Node tail = null;
    int size = 0;

    // Node Class containing the data and address of the list
    // -----------------------------------------------------------------------
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }
    // -----------------------------------------------------------------------

    // Insert Value at End of the Linked List
    // ------------------------------------------------------------------------
    void insertAtTail(int data) {
        Node temp = new Node(data);
        if (head == null) {
            head = temp;
        } else {
            tail.next = temp;

        }

        tail = temp;
        size++;
    }
    // ------------------------------------------------------------------------

    // Insert Value at the start of the LinkedList;
    // ------------------------------------------------------------------------
    void insertAtHead(int data) {
        Node temp = new Node(data);
        if (head == null) {
            head = tail = temp;
        } else {
            temp.next = head;
            head = temp;
        }
        size++;
    }

    // ------------------------------------------------------------------------

    // Insert At given Index
    // ---------------------------------------------------------------------------------
    void insertAtIndex(int index, int data) {
        Node t = new Node(data);
        Node temp = head;
        if (index < 0 || index > getLength()) {
            System.out.println("!!! ERROR -->wrong index");
            return;
        }
        if (index == 0) {
            insertAtHead(data);
            return;
        }
        if (index == getLength()) {
            insertAtTail(data);
            return;
        }
        for (int i = 1; i <= index - 1; i++) {
            temp = temp.next;
        }
        t.next = temp.next;
        temp.next = t;
        size++;
    }
    // -------------------------------------------------------

    // Delete Element at Given Index
    void deleteAtIndex(int index) {
        Node temp = head;
        if (index == 0) {
            head = head.next;
            size--;
            return;
        }
        if (index < 0 || index > getLength()) {
            System.out.println("No Element Found At Given Index");
            return;
        }
        for (int i = 1; i <= index; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
        tail = temp;
        size--;

    }

    // get Element at given index
    int getElementAt(int index) {
        Node temp = head;
        if (index < 0 || index > getLength()) {
            System.out.println("!!! ERROR -->wrong index");
            return -1;
        }
        for (int i = 1; i <= index; i++) {
            temp = temp.next;
        }
        return temp.data;
    }

    // Print the size of the Linked List

    void printLength() {
        Node temp = head;
        int count = 0;
        while (tail != null) {
            count += 1;
            if (temp.next == null) {
                break;
            }
            temp = temp.next;
        }
        System.out.println("The Length of the List is : " + count);
    }

    // return the size of the Linked List

    int getLength() {

        return size;
    }

    // Display Linked List
    void displayLinkedList() {
        Node temp = head;
        while (head != null) {
            System.out.print(temp.data + " ");
            if (temp.next == null) {
                break;
            }
            temp = temp.next;

        }
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();

        ll.insertAtHead(2);
        ll.insertAtTail(4);
        ll.insertAtTail(2);
        ll.insertAtTail(5);
        ll.insertAtIndex(2, 30);
        ll.deleteAtIndex(0);
        ll.displayLinkedList();
        System.out.println("");
        System.out.println(ll.head.data);
        System.out.println(ll.tail.data);

    }

}



// public class LinkedList {
//     Node head = null;
//     Node tail = null;
//     protected int size = 0;

//     class Node {
//         int data;
//         Node next;

//         private Node(int data) {
//             this.data = data;
//         }
//     }

//     void insertAtEnd(int data) {
//         Node temp = new Node(data);

//         if (head == null) {
//             head = temp;
//         } else {
//             tail.next = temp;
//         }
//         tail = temp;
//         size++;

//     }

//     void insertAtHead(int data) {
//         Node temp = new Node(data);
//         if (head == null) {
//             head = temp;
//             tail = temp;
//         } else {
//             temp.next = head;
//             head = temp;
//         }
//         size++;
//     }

//     void display() {
//         Node temp = head;
//         while (temp != null) {
//             System.out.print(temp.data + " ");
//             temp = temp.next;
//         }
//     }

//     int getSize() {
//         return size;
//     }

//     void insertAtIndex(int index, int data) {
//         Node temp = head;
//         Node t = new Node(data);

//         if (index > getSize() || index < 0) {
//             System.out.println("Invalid Index");
//             return;
//         }
//         if (index == 0) {
//             insertAtHead(data);
//             return;
//         }
//         if (index == getSize()) {
//             insertAtEnd(data);
//             return;
//         }

//         for (int i = 1; i <= index - 1; i++) {
//             temp = temp.next;
//         }
//         t.next = temp.next;
//         temp.next = t;
//         size++;

//     }

//     int getAtIndex(int index) {
//         Node temp = head;

//         for (int i = 1; i <= index; i++) {
//             temp = temp.next;
//         }
//         return temp.data;
//     }

//     void deleteHead() {
//         if (head == null) {
//             System.out.println("List is empty");
//             return;
//         }
//         head = head.next;
//     }

//     void deleteTail() {
//         if (head == null) {
//             System.out.println("List is empty");
//             return;
//         } else {
//             // Checks whether the list contains only one element
//             if (head != tail) {
//                 Node current = head;
//                 // Loop through the list till the second last element such that current.next is
//                 // pointing to tail
//                 while (current.next != tail) {
//                     current = current.next;
//                 }
//                 // Second last element will become new tail of the list
//                 tail = current;
//                 tail.next = null;
//             }
//             // If the list contains only one element
//             // Then it will remove it and both head and tail will point to null
//             else {
//                 head = tail = null;
//             }
//         }
//     }

//     void deleteAtIndex(int index) {
//         Node temp = head;
//         if (index == 0) {
//             deleteHead();
//             return;
//         }
//         if (index == getSize()) {
//             deleteTail();
//             return;
//         }
//         if (index > getSize() || index < 0) {
//             System.out.println("Invalid Index");
//             return;
//         }
//         for (int i = 1; i <= index - 1; i++) {
//             temp = temp.next;
//         }
//         temp.next = temp.next.next;
//     }

//     public static void main(String[] args) {
//         LinkedList LL = new LinkedList();
//         LL.insertAtEnd(0);
//         LL.insertAtEnd(2);
//         LL.insertAtEnd(3);
//         LL.insertAtEnd(4);
//         LL.insertAtIndex(0, 0);
//         LL.insertAtIndex(1, 1);
//         LL.insertAtIndex(2, 2);
//         LL.insertAtIndex(3, 3);

//         LL.display();
//         System.out.println();
//         System.out.println("Head : " + LL.head.data);
//         System.out.println("Tail : " + LL.tail.data);

//         System.out.println(LL.getAtIndex(0));
//         System.out.println(LL.getAtIndex(1));
//         System.out.println(LL.getAtIndex(2));

//     }
// }
