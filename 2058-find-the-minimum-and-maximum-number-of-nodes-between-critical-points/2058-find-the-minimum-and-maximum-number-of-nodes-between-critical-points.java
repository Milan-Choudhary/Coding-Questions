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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        
        int[] ans = new int[2];

        int c = 1;
        ArrayList<Integer> list = new ArrayList<>();

        ListNode temp = head;

        while(temp.next.next != null){

            if(temp.next.val > temp.val && temp.next.next.val < temp.next.val){
                list.add(c + 1);
            }
            else if(temp.next.val < temp.val && temp.next.next.val > temp.next.val){
                list.add(c + 1);
            }

            c += 1;

            temp = temp.next;

        }

        if(list.size() <= 1){
            ans[0] = -1;
            ans[1] = -1;
            return ans;
        }

        int min_distance = Integer.MAX_VALUE;

        for(int i = 0; i<list.size() - 1; i++){
            min_distance = Math.min(min_distance,list.get(i+1) - list.get(i));
        }

        int max_distance = list.get(list.size() - 1) - list.get(0);

        ans[0] = min_distance;
        ans[1] = max_distance;

        return ans;


    }
}