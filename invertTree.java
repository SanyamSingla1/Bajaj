public class invertTree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        
        invertTree(root);
        
        printTree(root);
    }
    
    public static TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        
        // Swap left and right children
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        
        // Recursively invert left and right subtrees
        invertTree(root.left);
        invertTree(root.right);
        
        return root;
    }
    
    public static void printTree(TreeNode node) {
        if (node != null) {
            System.out.print(node.val + " ");
            printTree(node.left);
            printTree(node.right);
        }
    }
}
