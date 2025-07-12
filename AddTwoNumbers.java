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
public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int extra = 0;
        ListNode l3 = null;
        while(l1!=null || l2 !=null){
            int x = 0; 
            int y = 0;
            int t = 0;
            if(l1!=null){
                x = l1.val;
                l1 = l1.next;
            }
            if(l2!=null){
                y = l2.val;
                l2 = l2.next;
            }
            int z = x + y + extra;
            if(z>9){
                extra = 1;
                t = z - 10;
            }else {
                extra = 0;
                t = z;
            }

            if(l3 == null){
                l3 = new ListNode(t, null);
            }else {
                ListNode temp = l3;
                while(temp.next != null){
                    temp = temp.next;
                }
                temp.next = new ListNode(t);
            }
        }
        if(extra > 0){
            ListNode temp = l3;
                while(temp.next != null){
                    temp = temp.next;
                }
                temp.next = new ListNode(extra);
        }
        
        return l3;
    }

    
}