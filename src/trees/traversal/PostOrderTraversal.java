package trees.traversal;

public class PostOrderTraversal {
    static class Node{
        public int data;
        public Node left;
        public Node right;

        public Node(int data) {
            this.data = data;
        }
    }

    private Node root;

    public void postOrder(Node node){
        if(node == null){
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.data + " ");
    }

    public static void main(String[] args) {
        PostOrderTraversal tree = new PostOrderTraversal();

        tree.root = new Node(11);
        tree.root.left = new Node(20);
        tree.root.right = new Node(12);
        tree.root.left.left = new Node(15);
        tree.root.left.right = new Node(13);

        System.out.print("\nPostorder Traversal: ");
        tree.postOrder(tree.root);
    }
}
