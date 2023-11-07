class BinaryTree{
    Node root;

    public BinaryTree(){
        this.root = null;
    }

    //insert
    public void insert(int value){
        this.root = insertRecur(this.root, value);
    }

    //recursive insertion
    private Node insertRecur(Node root, int value){
        if(root == null){
            root = new Node(value);
            return root;
        }
        if(value < root.value){
            root.left = insertRecur(root.left, value);
        }else if(value > root.value){
            root.right = insertRecur(root.right, value);
        }
        return root;
    }

    public void displayInOrder(Node root) {
        if (root != null) {
            displayInOrder(root.left);
            System.out.print(root.value + " ");
            displayInOrder(root.right);
        }
    }
}