 class Solution {
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode curr = head;

        while (curr != null && curr.next != null) {
            int gcdValue = getGCD(curr.val, curr.next.val);
            
            ListNode gcdNode = new ListNode(gcdValue);
            gcdNode.next = curr.next;
            curr.next = gcdNode;
            
            curr = gcdNode.next;
        }

        return head;
    }

    private int getGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}