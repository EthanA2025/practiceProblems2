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

    public static int lengthRec(Node<Integer> node) {

        if (node.getValue() == null) {
            return 0;
        }
        if (node.getNext() != null) {
            return lengthRec(node.getNext()) + 1; // if its not null then recursively call
        }
        return 1;
    }

    public static void main(String[] args) {
        // Node<String> node = new Node<>("String");

        // System.out.println("Length of a single node (1): " + NodeUtils.length(node));

        // Node<String> emptyNode = new Node<>("");
        
        // System.out.println("Length of an empty sequence (0): " + NodeUtils.length(emptyNode));
        // Node<String> node2 = new Node<>("String2");

        // node.setNext(node2);
        // System.out.println("Length of a sequence of 2 nodes (2): " + NodeUtils.length(node));

        // recursive 

        Node<Integer> nodeInt = new Node<>(1);
        Node<Integer> nodeNo2 = new Node<>(2);
        Node<Integer> nodeNo3 = new Node<>(3);
        Node<Integer> nodeEmpty = new Node<>(null);

        System.out.println("Length of a single node (1): " + NodeUtils.lengthRec(nodeInt));
        System.out.println("Length of an empty sequence (0): " + NodeUtils.lengthRec(nodeEmpty));

        nodeInt.setNext(nodeNo2);
        nodeNo2.setNext(nodeNo3);
        System.out.println("Length of a sequence of 3 nodes (3): " + NodeUtils.lengthRec(nodeInt));
    }
}
