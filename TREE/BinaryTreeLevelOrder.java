import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeLevelOrder {

    // Define a simple TreeNode class
    public static class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;

        TreeNode(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    // Method to perform level order traversal
    public static void levelOrderTraversal(TreeNode root) {
        if (root == null) {
            return; // Handle empty tree
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root); // Add the root to start the traversal

        while (!queue.isEmpty()) {
            TreeNode currentNode = queue.poll(); // Get the front node
            System.out.print(currentNode.data + " "); // Process the current node

            // Add left child if it exists
            if (currentNode.left != null) {
                queue.add(currentNode.left);
            }

            // Add right child if it exists
            if (currentNode.right != null) {
                queue.add(currentNode.right);
            }
        }
    }

    public static void main(String[] args) {
        // Create a sample binary tree
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        System.out.println("Level Order Traversal:");
        levelOrderTraversal(root); // Perform and print the traversal
    }
}