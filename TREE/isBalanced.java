package TREE;
import java.util.*;

public class isBalanced {
    public static  boolean isBalanced(Treenode root) {
        if (root == null) {
            return true;
        }
        else if (root.left==null && root.right==null) {
            return true;

        }

        return checkheight(root)!=-1;
    }
    //helper function to check height
    public  static int checkheight(Treenode root) {
        if (root == null) {
            return 0;
        }
        //check for left subtree
        int left = checkheight((root.left));
        if (left == -1) {
            return -1; // early stoping
        }
        int right = checkheight((root.right));
        if (right == -1) {
            return -1;  //early stoping
        }

        if(Math.abs(left-right)>1) {
            return -1;
        }
return Math.max(left,right)+1;
    }

    public static void main(String[] args) {

        Treenode root = new Treenode(1);
         root.left=new Treenode(2);
         root.left.left=new Treenode(3);
         root.left.right=new Treenode(4);
         root.left.left=new Treenode(5);
         root.left.right.left=new Treenode(6);
        System.out.println(isBalanced(root));
    }

}
