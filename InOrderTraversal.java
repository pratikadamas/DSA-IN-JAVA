
class treenode{
    int data;
    treenode left ,right;

    treenode(int data){
        this.data=data;
        left=right=null;
    }

}

class  InOrderTraversal{
    public static  void inordertraversal(treenode node){
        if(node==null){
            return;
        }

        inordertraversal(node.left);
        System.out.print(node.data+"  ");
        inordertraversal(node.right);

    }
    public static void main(String[] args) {

      treenode root = new treenode(1);
        root.left = new treenode(2);
        root.right = new treenode(3);
        root.left.left = new treenode(4);
        root.left.right = new treenode(5);
        root.right.right = new treenode(6);

        inordertraversal(root);


    }
}