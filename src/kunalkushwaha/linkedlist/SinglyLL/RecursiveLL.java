package kunalkushwaha.linkedlist.SinglyLL;

public class RecursiveLL {
    private Node head;
    public static int size;

    public void insertRec(int val, int index) {
        head = insertRec(val, index, head);
    }

    private Node insertRec(int val, int index, Node node){
        if( index == 0){
            Node temp = new Node(val, node);
            size++;
            return temp;
        }
        node.next = insertRec(val, index-1, node.next);
        return node;
    }

    public void display() {
        Node node = head;
        while(head != null){
            System.out.print(node.val + " -> ");
        }
        System.out.println();
    }


    static class Node {
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }
}
