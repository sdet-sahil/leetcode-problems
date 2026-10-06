package org.sdet.linkedlists;

public class ReverseLinkedList {
    private static class Node {
        int val;
        Node  next;

        Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }

    private static void printList(Node node){
        Node tmp = node;
        while(tmp != null){
            System.out.print(tmp.val+"->");
            tmp = tmp.next;
        }
        System.out.print("null");
        System.out.println();
    }

    private static Node reverse(Node node){
        Node current = node;
        Node prev = null;
        while(current !=null){
            Node next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }

    private static Node reverseKGroups(Node head, int k){
        Node temp = head;
// Check if at least k nodes exist
        for (int i = 0; i < k; i++) {
            if (temp == null) {
                return head;
            }
            temp = temp.next;
        }
        Node current = head;
        Node prev = null;
        Node next = null;
        int count = 0;
        while (current != null && count < k) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
            count++;
        }
        assert head != null;
        head.next = reverseKGroups(current, k);
        return prev;
    }

    public static void main(String[] args){
        Node six = new Node(6, null);
        Node five = new Node(5, six);
        Node four = new Node(4, five);
        Node three = new Node(3, four);
        Node two = new Node(2, three);
        Node one = new Node(1, two);
        printList(one);
       // Node reversed = reverse(one);
       // printList(reversed);
        Node reverseInGroups = reverseKGroups(one, 7);
        printList(reverseInGroups);

    }
}
