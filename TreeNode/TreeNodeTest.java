package TreeNode;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
import org.junit.platform.commons.annotation.Testable;

@Testable
public class TreeNodeTest {
    @Test
    public void treeNodePrintTest() {
        //setup 
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

        // invoke
        String expected = "TreeNode{value=P, children=[TreeNode{value=Q,"
            + " children=[TreeNode{value=A, children=[TreeNode{value=D,"
            + " children=[TreeNode{value=L}, TreeNode{value=M}]}]},"
            + " TreeNode{value=B, children=[TreeNode{value=E},"
            + " TreeNode{value=F}, TreeNode{value=G}]}]}, TreeNode{value=R,"
            + " children=[TreeNode{value=C, children=[TreeNode{value=H},"
            + " TreeNode{value=I}, TreeNode{value=J}, TreeNode{value=K}]}]}]}";

        String actual = P.toString();

        //analyze
        assertEquals(expected, actual);
    }
}
