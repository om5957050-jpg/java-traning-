public class treenode {
    static class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;

        TreeNode(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static void main(String[] args) {
        // Example usage:
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        System.out.println("Root: " + root.data);
        System.out.println("Left Child: " + root.left.data);
        System.out.println("Right Child: " + root.right.data);
        System.out.println("Left-Left Child: " + root.left.left.data);
        System.out.println("Left-Right Child: " + root.left.right.data);
    }
}
