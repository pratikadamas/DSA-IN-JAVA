package Tree;
import java.util.*;

public class ZigZagTraversal {

    public static List<List<Integer>> zigzag(Treenode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) {
            return new ArrayList<>(); // ✅ Return empty list, not null
        }

        Deque<Treenode> deque = new LinkedList<>();
        deque.offerFirst(root);
        boolean flag = true; // true = leftToRight

        while (!deque.isEmpty()) {
            List<Integer> level = new ArrayList<>();
            int size = deque.size();

            for (int i = 0; i < size; i++) {
                Treenode node;

                if (flag) {
                    // ➡️ Left to Right: Remove from Front, Add to Back
                    node = deque.pollFirst();
                    level.add(node.data);

                    if (node.left != null) deque.offerLast(node.left);
                    if (node.right != null) deque.offerLast(node.right);

                } else {
                    // ⬅️ Right to Left: Remove from Back, Add to Front
                    node = deque.pollLast();
                    level.add(node.data);

                    // 🔑 CRITICAL: Add RIGHT first, then LEFT
                    if (node.right != null) deque.offerFirst(node.right);
                    if (node.left != null) deque.offerFirst(node.left);
                }
            }

            flag = !flag; // Toggle direction
            res.add(level);
        }

        return res;
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

        System.out.println(zigzag(root));
        // Expected Output: [[1], [3, 2], [4, 5, 6]]
    }
}