package TreeNode;

import java.util.LinkedList;
import java.util.List;

public class Tree<E> {
    
    private E value;
    private TreeNode<E> root;

    public Tree(E value) {
        this.value = value;
        this.root = new TreeNode<>(value);
    }

    public void add(E parent, E child) {
        root.addChild(new TreeNode<>(child));
        
    }

    public List<E> getChildren(E value) {
        TreeNode<E> node = root.findNode(value);
        List<TreeNode<E>> children = node.getChildren();

        // return a list of E values of the childs values
        List<E> valueList = new LinkedList<>();
        for(TreeNode<E> child : children) {
            valueList.add(child.getValue());
        }
        return valueList;
    }

    public boolean search(E target) {
        if (root.findNode(target) != null)  {
            return true;
        }
        return false;
    }

    public String prefixTraversal() {
        String result = "";
        result += this.root.getValue() + " ";

        // if (this.root.getChildren() != null) {
        //     result += this.root.getChildren();
        // }

        return result;
    }

    public static void main(String[] args) {
        Tree<String> tree = new Tree<>("P");

        tree.add("P", "Q");

        tree.add("Q", "A");
        tree.add("Q", "B");

        tree.add("B", "E");
        tree.add("B", "F");
        tree.add("B", "G");

        tree.add("A", "D");

        tree.add("D", "L");
        tree.add("D", "M");

        tree.add("P", "R");

        tree.add("R", "C");

        tree.add("C", "H");
        tree.add("C", "I");
        tree.add("C", "J");
        tree.add("C", "K");

        System.out.println(tree.prefixTraversal());
    }
}
