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
    List<Integer> arr; 
    Random random ; 

    public Solution(ListNode head) {
        ListNode temp = head;

        arr = new ArrayList<>();
        random = new Random();

        while (temp != null) {
            arr.add(temp.val);
            temp = temp.next;
        }
    }

    public int getRandom() {
        int n = arr.size();

        int random_Node = random.nextInt(n);

        return arr.get(random_Node);
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(head);
 * int param_1 = obj.getRandom();
 */