package Session7;

public class Re_order_LinkedList {
	class ListNode {
		int val;
		ListNode next;

		ListNode() {
		}

		ListNode(int val) {
			this.val = val;
		}

		ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}
	}

	public void reorderList(ListNode h1) {
		ListNode mid = middle(h1);
		ListNode h2 = mid.next;
		mid.next = null;
		h2 = reverse(h2);
		while (h2 != null) {
			ListNode temp = h1.next;
			h1.next = h2;
			h1 = temp;
			temp = h2.next;
			h2.next = h1;
			h2 = temp;
		}
	}

	public ListNode middle(ListNode h1) {
		if (h1 == null || h1.next == null) {
			return h1;
		}
		ListNode slow = h1;
		ListNode fast = h1.next;
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;
	}

	public ListNode reverse(ListNode h2) {
		ListNode curr = h2;
		ListNode prev = null;
		while (curr != null) {
			ListNode temp = curr.next;
			curr.next = prev;
			prev = curr;
			curr = temp;
		}
		return prev;
	}

	public static void main(String[] args) {

	}

}
