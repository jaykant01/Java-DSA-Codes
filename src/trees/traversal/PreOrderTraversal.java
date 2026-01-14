package trees.traversal;

public class PreOrderTraversal {
    static class Node{
        public int data;
        public Node left;
        public Node right;

        public Node(int data) {
            this.data = data;
        }
    }

    private Node root;

    public void preOrder(Node node){
        if(node == null){
            return;
        }

        System.out.print(node.data + " ");
        preOrder(node.left);
        preOrder(node.right);
    }

    public static void main(String[] args) {
        PreOrderTraversal tree = new PreOrderTraversal();

        tree.root = new Node(10);
        tree.root.left = new Node(20);
        tree.root.right = new Node(12);
        tree.root.left.left = new Node(15);
        tree.root.left.right = new Node(13);

        System.out.print("Preorder Traversal: ");
        tree.preOrder(tree.root);
    }
}
