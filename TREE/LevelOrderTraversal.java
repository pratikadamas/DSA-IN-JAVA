package TREE;
import java.util.*;
public class LevelOrderTraversal {

    public static List<List<Integer>> levelOrder(Treenode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        Queue<Treenode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> level = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                Treenode node = queue.poll();
                level.add(node.data);
                if (node.left != null) queue.add(node.left);
                if (node.right != null) queue.add(node.right);
            }
            result.add(level);
        }

        return  result;
    }
    public static void main(String[] args) {
   /*
                1
               / \
              2   3
             / \  /
            4  5 6
        */
        Treenode root = new Treenode(1);
        root.left = new Treenode(2);
        root.right = new Treenode(3);
        root.left.left = new Treenode(4);
        root.left.right = new Treenode(5);
        root.right.left = new Treenode(6);
        root.right.right = new Treenode(7);
        root.right.left.left = new Treenode(8);
        System.out.println(levelOrder(root));

    }

}
