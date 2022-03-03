package TreeNode;

import java.util.LinkedList;
import java.util.List;

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

    public List<TreeNode<E>> getChildren() {
        return this.children;
    }
    @Override
    public String toString() {
        if (this.children.size() != 0) {
            return "TreeNode{value=" + this.value 
            + ", children=" + this.children
            + "}";
        } else {
            return "TreeNode{value=" + this.value + "}";
        }
    }

    public TreeNode<E> findNode(E target) {
        if (this.getValue().equals(target)) {
            // checks if this nodes value is the target
            return this;
        }
        else{
            for (TreeNode<E> child : this.children) { // iterate through all the children of each node
                TreeNode<E> result = child.findNode(target); // get the resulting node from calling find node on the child node
                if (result != null) { // if the value exists
                    return result; // return it if its not null
                } 
            }
        }
        return null;
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

        // String result = P.toString();
        // System.out.println(result);

        System.out.println(P.findNode("F"));
        System.out.println(P.findNode("C"));

        System.out.println(P.findNode("X"));
        System.out.println(P.findNode("Y"));

    }   
}