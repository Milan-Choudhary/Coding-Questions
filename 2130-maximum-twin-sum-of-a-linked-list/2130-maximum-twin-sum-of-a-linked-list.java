/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int pairSum(ListNode head) {

        int len = 0;

        ListNode temp = head;
        ListNode copy = head;
        ListNode point = head;

        while(head != null){
            len += 1;
            head = head.next;
        }

        ListNode prev = null;
        int index = 0;

        while(index < ((len/2) - 1)){
            index += 1;
            copy = copy.next;
            temp = temp.next;
        }

        temp = temp.next;
        copy.next = null;
        

        while(temp != null){
            ListNode next = temp.next;
            temp.next = prev;
            prev = temp;
            temp = next;
        }

        int sum = 0;
        int maxsum = 0;

        while(point != null){

            sum += point.val;
            sum += prev.val;
            maxsum = Math.max(maxsum,sum);
            point = point.next;
            prev = prev.next;

            sum = 0;

        }

        return maxsum;
        
    }
}