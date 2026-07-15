package Tree;

public class HeightOfTree {

    public static int height(Treenode root) {

        if (root == null)
            return 0;   // base case

        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        return Math.max(leftHeight, rightHeight) + 1;
    }

    public static void main(String[] args) {

        Treenode root = new Treenode(1);
        root.left = new Treenode(2);
        root.right = new Treenode(3);
        root.left.left = new Treenode(4);

        System.out.println("Height = " + height(root));
    }
}
