package TreeNode;

import java.util.LinkedList;

public class TreeNode<E> {
    
    private E value;
    private LinkedList<TreeNode<E>> children = new LinkedList<>();

    public TreeNode(E value) {
        this.value = value;
    }

    public E getValue() {
        return this.value;
    }

    public void addChild(TreeNode<E> child) { 
        children.add(child);
    }

    public LinkedList<TreeNode<E>> getChildren() {
        return this.children;
    }

    public String toString() {
        if (this.children.size() != 0) {
            return "TreeNode{value=" + this.value 
            + ", children=" + this.children
            + "}";
        } else {
            return "TreeNode{value=" + this.value + "}";
        }
    }

    public static void main(String[] args) {
        TreeNode<String> P = new TreeNode<>("P");

        TreeNode<String> Q = new TreeNode<>("Q");

        TreeNode<String> A = new TreeNode<>("A");
        TreeNode<String> D = new TreeNode<>("D");
        TreeNode<String> L = new TreeNode<>("L");
        TreeNode<String> M = new TreeNode<>("M");


        TreeNode<String> B = new TreeNode<>("B");
        TreeNode<String> E = new TreeNode<>("E");
        TreeNode<String> F = new TreeNode<>("F");
        TreeNode<String> G = new TreeNode<>("G");

        TreeNode<String> R = new TreeNode<>("R");

        TreeNode<String> C = new TreeNode<>("C");

        TreeNode<String> H = new TreeNode<>("H");
        TreeNode<String> I = new TreeNode<>("I");
        TreeNode<String> J = new TreeNode<>("J");
        TreeNode<String> K =  new TreeNode<>("K");

        P.addChild(Q);

        Q.addChild(A);
        Q.addChild(B);

        A.addChild(D);

        D.addChild(L);
        D.addChild(M);

        B.addChild(E);
        B.addChild(F);
        B.addChild(G);

        P.addChild(R);

        R.addChild(C);
        C.addChild(H);
        C.addChild(I);
        C.addChild(J);
        C.addChild(K);

        String result = P.toString();
        System.out.println(result);
    }   
}