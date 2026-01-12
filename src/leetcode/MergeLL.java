package leetcode;

import kunalkushwaha.linkedlist.LinkedList;

public class MergeLL {
    ListNode head;

    static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public void insertLast(int val){
        ListNode node = new ListNode(val);
        if(head == null){
            head = node;
            return;
        }
        ListNode temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = node;
    }

    public void display() {
        ListNode node = head;
        while (node != null){
            System.out.print(node.val + " -> ");
            node = node.next;
        }
        System.out.println("End");
    }

    public static MergeLL merge(MergeLL first, MergeLL second){
        ListNode f = first.head;
        ListNode s = second.head;

        MergeLL ans = new MergeLL();

        while(f != null && s != null){
            if(f.val < s.val){
                ans.insertLast(f.val);
                f = f.next;
            }else{
                ans.insertLast(s.val);
                s = s.next;
            }
        }

        while (f != null){
            ans.insertLast(f.val);
            f = f.next;
        }

        while (s != null){
            ans.insertLast(s.val);
            s = s.next;
        }
        return ans;
    }

}

class Main{
    public static void main(String[] args) {

        MergeLL first = new MergeLL();
        MergeLL second = new MergeLL();
        first.insertLast(1);
        first.insertLast(3);
        first.insertLast(5);
        
        second.insertLast(4);
        second.insertLast(5);
        second.insertLast(6);
        second.insertLast(6);
        first.display();
        second.display();

        MergeLL ans = MergeLL.merge(first, second);
        ans.display();
    }
}
