package TREE;

public class Treenode {

    int data;              // accessible inside same package
    Treenode left, right;  // accessible inside same package

    public Treenode(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}
