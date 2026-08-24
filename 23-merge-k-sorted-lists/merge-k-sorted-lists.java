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

    private ListNode merge(ListNode l1 , ListNode l2){
        if(l1 == null) 
        return l2;

        if(l2 == null)
        return l1;

        if(l1.val <= l2.val){
            l1.next = merge(l1.next,l2);
            return l1;
        }else{
            l2.next = merge(l1,l2.next);
            return l2;
        }
    }

    private ListNode partitionAndMerge(int start , int end , ListNode[] list){
        if(start > end){
            return null;
        }

        if(start == end)
        return list[start];

        int mid = start + (end - start)/2;

        ListNode l1 = partitionAndMerge(start , mid , list );
        ListNode l2 = partitionAndMerge(mid+1 , end , list );

        return merge(l1,l2);
    }

    public ListNode mergeKLists(ListNode[] lists) {
        int m = lists.length;

        if(m == 0)
        return null;

        return partitionAndMerge(0,m-1,lists);
    }
}