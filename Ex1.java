public class Ex1 {
    public static void main(String[] args) {
        IntegerNode head =null;
        System.out.println("head = "+head);
        IntegerNode lst1 = new IntegerNode(0);
        head = lst1;
        IntegerNode lst2 = new IntegerNode(1);
        lst1.setNext(lst2);
        IntegerNode lst9 = new IntegerNode(9);
        lst2.setNext(lst9);
       
        head.getNext();

        System.out.println("lst1 = "+lst1);
        System.out.println("lst2 = "+lst2);
        System.out.println("lst9 = "+lst9);
        System.out.println("head = "+head);}
}
