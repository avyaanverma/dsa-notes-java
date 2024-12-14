import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class reverseLL {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();

        Node head = null;
        Node current = null;

        while (number > 0) {
            int digit = number % 10;
            number /= 10;

            Node newNode = new Node(digit);
            if (head == null) {
                head = newNode;
                current = head;
            } else {
                current.next = newNode;
                current = current.next;
            }
        }

        printLinkedList(head);

        // reverse LL 
        Node reverseHead = new Node(head.data);
        Node ptr = head.next;
        while(ptr!=null){
            Node temp = new Node(ptr.data);
            temp.next = reverseHead;
            reverseHead = temp;

            ptr = ptr.next;
        }

        printLinkedList(reverseHead);

    }

    public static void printLinkedList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.err.println();
    }
}