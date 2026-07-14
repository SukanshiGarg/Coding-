class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode prev = null;
        ListNode slow = head;
        ListNode fast = head;

        for(int i=0;i<n;i++){
            fast = fast.next;
        }

        if(fast == null) return head.next;

        while(fast!=null){
            prev = slow;
            slow = slow.next;
            fast = fast.next;
        }

        prev.next = slow.next;

        return head;
    }
}