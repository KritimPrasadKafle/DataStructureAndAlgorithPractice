package LinkedList;

public class LinkedListCycle {


//      Definition for singly-linked list.
      class ListNode {
          int val;
          ListNode next;
          ListNode(int x) {
              val = x;
              next = null;
          }
      }

        public boolean hasCycle(ListNode head) {
            // ListNode curr = head;
            // Set<Integer> set = new HashSet<>();
            // while(curr!=null){
            //     if(set.contains(curr.val)){
            //         return true;
            //     }
            //     set.add(curr.val);
            //     curr = curr.next;

            // }
            // return false;

            ListNode slow = head;
            ListNode fast = head;
            while(fast != null && fast.next != null){
                slow = slow.next;
                fast = fast.next.next;
                if(slow == fast){
                    return true;
                }
            }
            return false;




        }



}
