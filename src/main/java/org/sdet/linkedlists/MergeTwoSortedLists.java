package org.sdet.linkedlists;

public class MergeTwoSortedLists {

    private static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
    private static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode prevHead = new ListNode(-1);
        ListNode prev = prevHead;
        while(list1 !=null && list2 !=null){
            if(list1.val >= list2.val){
                prev.next = list2;
                list2 = list2.next;
            } else {
                prev.next = list1;
                list1 = list1.next;
            }
            prev = prev.next;
        }
        prev.next =  list1 == null? list2: list1;
        return prevHead.next;
    }

    private static void printList(ListNode n){
        ListNode tmp = n;
        while(tmp != null){
            System.out.print(tmp.val+"->");
            tmp = tmp.next;
        }
        System.out.print("null");
        System.out.println();
    }

    public static void main(String[] args){
        ListNode node1 = new ListNode(2,null);
        ListNode head1 = new ListNode(1,node1);
        printList(head1); //prints 1->2->null

        ListNode node4 = new ListNode(6, null);
        ListNode node3 = new ListNode(5, node4);
        ListNode node2 = new ListNode(4,node3);
        ListNode head2 = new ListNode(3,node2);
        printList(head2); // prints 3->4->5->6-null
       ListNode merged = mergeTwoLists(head1, head2);
        printList(merged); // prints 1->2->3->4-null
    }
}
