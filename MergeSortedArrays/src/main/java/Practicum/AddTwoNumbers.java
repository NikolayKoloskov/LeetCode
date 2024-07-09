package Practicum;

public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode nodeToReturn = new ListNode(0);
        while ((l1.next != null || l2.next != null) && ((l1.val != 0) || (l2.val!= 0))){
            nodeToReturn.val = l1.val + l2.val;
            if (nodeToReturn.val > 9){
                nodeToReturn.val = nodeToReturn.val - 10;
                nodeToReturn.next = new ListNode(1);
            }
            nodeToReturn.next = nodeToReturn.next == null? l1.next : l2.next;
            l1 = l1.next == null? l1.next : l1.next.next;
            l2 = l2.next == null? l2.next : l2.next.next;
        }
        if (l1.next == null && l2.next == null){
            nodeToReturn.next = null;
            nodeToReturn.val = l1.val+ l2.val;
        }
        return nodeToReturn;
    }

    public static void main(String[] args) {
        AddTwoNumbers addTwoNumbers = new AddTwoNumbers();
        ListNode l1 = new ListNode();
        ListNode l2 = new ListNode();
        addTwoNumbers.addTwoNumbers(l1, l2);
        System.out.println(addTwoNumbers.addTwoNumbers(l1, l2).val);
    }
}
