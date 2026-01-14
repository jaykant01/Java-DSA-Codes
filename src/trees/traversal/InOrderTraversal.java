package trees.traversal;

public class InOrderTraversal {
    static class Node{
        public int data;
        public Node left;
        public Node right;

        public Node(int data) {
            this.data = data;
        }
    }

    private Node root;

    public void inOrder(Node node){
        if(node == null){
            return;
        }
        inOrder(node.left);
        System.out.print(node.data + " ");
        inOrder(node.right);
    }

    public static void main(String[] args) {
        InOrderTraversal tree = new InOrderTraversal();

        tree.root = new Node(10);
        tree.root.left = new Node(5);
        tree.root.right = new Node(20);
        tree.root.left.left = new Node(3);
        tree.root.left.right = new Node(8);
        tree.root.left.left.left = new Node(2);

        System.out.print("\nInorder Traversal: ");
        tree.inOrder(tree.root);
    }
}
