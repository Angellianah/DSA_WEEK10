public class TestLNode {
    public static void mai(String[] ards) {
        LNode<Object> node=new LNode<>();

        node.addAtFirst(12);
        node.addAtFirst(45);
        node.addAtFirst(7);    

        System.out.println(node.traverse());
    }
}
