package trees.bst;

public class BST {
    class Node{
        private int data;
        private Node left;
        private Node right;
        private int height;

        public Node(int data){
            this.data = data;
        }

        public int getData(){
            return data;
        }
    }

    private Node root;

    // Constructor
    public BST(){

    }

    public int height(Node node){
        if(node == null){
            return -1;
        }
        return node.height;
    }

    // Is the Tree empty or not?
    public boolean isEmpty(){
        return root == null;
    }

    public void display(){
        display(root, "Root Node: ");
    }

    private void display(Node node, String details){
        if(node == null){
            return;
        }
        System.out.println(details + node.getData());

        display(node.left, "Left child of " + node.getData() + " : ");
        display(node.right, "Right child of " + node.getData() + " : ");
    }

    public void insert(int data){
        root = insert(data, root);
    }

    private Node insert(int data, Node node){
        if(node == null){
            node = new Node(data);
            return node;
        }

        if(data < node.data){
            node.left = insert(data, node.left);
        }

        if(data > node.data){
            node.right = insert(data, node.right);
        }

        node.height = Math.max(height(node.left), height(node.right)) + 1;

        return node;
    }

    // Insert Multiple Items
    public void populate(int[] nums){
        for (int i = 0; i < nums.length; i++) {
            this.insert(nums[i]);
        }
    }

    // If Array is given sorted
    public void populatedSorted(int[] nums){
        populatedSorted(nums, 0, nums.length);
    }

    private void populatedSorted(int[] nums, int start, int end){
        if(start >= end){
            return;
        }

        int mid = (start + end)/2;

        this.insert(nums[mid]);
        populatedSorted(nums, start, mid);
        populatedSorted(nums, mid+1, end);
    }

    public boolean balanced(){
        return balanced(root);
    }

    private boolean balanced(Node node){
        if(node == null){
            return true;
        }
        return Math.abs(height(node.left) - height(node.right)) <= 1 && balanced(node.left) && balanced(node.right);
    }

}

class Main{
    public static void main(String[] args) {
        BST tree = new BST();
        //int[] nums = {5,2,7,1,4,6,9,8,3,10};
        //tree.populate(nums);
        //tree.display();

        // For Sorted Array
        int[] nums = {1,2,3,4,5,6,7,8,9,10};
        tree.populatedSorted(nums);
        tree.display();
    }
}