class Main {
    // Node class
    class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    // BinaryTree class
    class BinaryTree {
        // lets store the index value
        
        public Node buildTree(int nodes[]) {
            int idx = -1;
            idx++;
            // if value is -1 return null, no newnode is created
            if (nodes[idx] == -1) {
                return null;
            }

            // if not -1 then we need to create a new node
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }
    }

    public static void main(String[] args) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
 
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        System.out.println(root.data);

    }
}