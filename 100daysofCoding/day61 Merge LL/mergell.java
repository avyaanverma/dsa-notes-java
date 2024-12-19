public class mergell {
    Node head;
    
    static class Node{
        int data;
        Node next; 
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String args[]){
        Node list1 = new Node(1);
        Node list2 = new Node(15);

        Node ptr1 = list1;
        int i = 10;
        while(i>0){
            Node next = new Node(i);
            ptr1.next = next;
            ptr1 = ptr1.next;
            i--;
        }
        i = 5;
        // while(i<10){
        //     Node next = new Node(i);
        //     list2.next = next;
        //     list2 = next;
        //     i--;
        // }
        ptr1 = list1;
        while(ptr1!=null){
            System.out.println(ptr1.data);
            ptr1 = ptr1.next;
        }




    }
}
