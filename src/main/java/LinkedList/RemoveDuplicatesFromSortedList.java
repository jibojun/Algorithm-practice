package LinkedList;

/**
 * @Author: Bojun Ji
 * @Description:
 * @Date: 2018/10/1_11:55 PM
 */
public class RemoveDuplicatesFromSortedList {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode resHead = head;
        while (head.next != null) {
            if (head.next.val == head.val) {
                if (head.next.next == null) {
                    head.next = null;
                } else {
                    head.next = head.next.next;
                }
            } else {
                head = head.next;
            }
        }
        return resHead;
    }
}
