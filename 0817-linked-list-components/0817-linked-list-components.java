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
    public int numComponents(ListNode head, int[] nums) {
        int x=0;
        Set<Integer> a=new HashSet<>();
        for(int i:nums){
            a.add(i);
        }
        while(head!=null){
            if(a.contains(head.val) && (head.next== null||!a.contains(head.next.val==null))){
                x++;
            }
            head=head.next;
        }
        return x;
    }
}