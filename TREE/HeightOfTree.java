package TREE;
import TREE.Treenode;

import javax.swing.tree.TreeNode;


public class HeightOfTree {

    public static int maxHeight(Treenode root   )
    {
        if(root==null)
            return 0;

        int lh=maxHeight(root.left);
        int rh=maxHeight(root.right);

        return Math.max(lh,rh)+1;

    }

    public static void main(String[] args) {
        Treenode root = new Treenode(1);
        root.left = new Treenode(2);
        root.right = new Treenode(3);
        root.left.left = new Treenode(4);
        root.left.right = new Treenode(5);
        root.right.left = new Treenode(6);
        root.right.left = new Treenode(7);
       root.right.left = new Treenode(8);

        System.out.println("Height of tree is "+maxHeight(root));


    }
}
