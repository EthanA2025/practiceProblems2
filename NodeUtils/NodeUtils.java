package NodeUtils;

public class NodeUtils {
    
    public static int length(Node<String> node) {
        int length = 0;
        NodeIterator<String> iterNodes = new NodeIterator<>(node);
        if (node.getValue() == "") {
            return length;
        } else {
            while(iterNodes.hasNext()) {
                length++;
                iterNodes.next();
            }
        }
        return length;
    }

    public static void main(String[] args) {
        Node<String> node = new Node<>("String");
        System.out.println("Length of a single node (1): " + NodeUtils.length(node));

        Node<String> emptyNode = new Node<>(null);
        System.out.println("\nLength of an empty sequence (0): " + NodeUtils.length(emptyNode));

        Node<String> node2 = new Node<>("String");
        node.setNext(node2);

        System.out.println("\n of a sequence of 2 nodes (2): " + NodeUtils.length(node));
    }
}
