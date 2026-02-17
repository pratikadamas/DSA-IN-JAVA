package TREE;

import org.w3c.dom.Node;

public class Diameter {
   static int diameter(Treenode root){
       if(root==null){
           return 0;
       }

       int diameter[]=new int[1];
       height(root,diameter);
       return diameter[0];
   }

   private static int height(Treenode root,int[] diameter){
       if(root==null){
           return 0;
       }
       int lh=height(root.left,diameter);
       int rh=height(root.right,diameter);
       diameter[0]=Math.max(diameter[0],lh+rh);


return 1 + Math.max(lh,rh);
//       return 1;
   }


    public static void main(String[] args) {
        Treenode root = new Treenode(1);
        root.left = new Treenode(2);
        root.right = new Treenode(3);
        root.left.left = new Treenode(4);

        root.left.left.left = new Treenode(14);


        System.out.println(diameter(root));
    }

}

