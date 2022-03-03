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
        if (root.findNode(parent) != null) {
            root.findNode(parent).addChild(new TreeNode<>(child));
        }
        // adds the child to the parent node if it exists
    }

    public List<E> getChildren(E value) {
        TreeNode<E> node = root.findNode(value);
        List<TreeNode<E>> children = node.getChildren();
        if (children.size() == 0) {
            return new LinkedList<>(); // return empty list if the parent does not exist
        }
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
        String result = this.root.prefixTraversal(); // add root val first
        return result;
    }

    public static void main(String[] args) {
        Tree<String> tree = new Tree<>("P");

        tree.add("P", "Q");

        tree.add("Q", "A");
        tree.add("Q", "B");
        tree.add("A", "D");


        tree.add("B", "E");
        tree.add("B", "F");
        tree.add("B", "G");

        tree.add("D", "L");
        tree.add("D", "M");

        tree.add("P", "R");

        tree.add("R", "C");

        tree.add("C", "H");
        tree.add("C", "I");
        tree.add("C", "J");
        tree.add("C", "K");

        System.out.println(tree.search("Z"));
        System.out.println(tree.search("C"));
        System.out.println(tree.prefixTraversal());
    }
}
