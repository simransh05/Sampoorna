package Session7;

public class Split_Linked_List {
	public class ListNode {
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

	public ListNode[] splitListToParts(ListNode head, int k) {
		ListNode[] ans = new ListNode[k];
		int n = findLen(head); // Get the total length of the linked list
		int lenEach = n / k; // Minimum size of each part
		int remaining = n % k; // Extra nodes to distribute

		ListNode curr = head;
		for (int j = 0; j < k; j++) {
			ans[j] = curr; // Store the head of the current part
			int partSize = lenEach + (remaining > 0 ? 1 : 0); // Adjust size if extra node remains

			// Move `partSize - 1` steps to get to the last node of this part
			for (int i = 0; i < partSize - 1 && curr != null; i++) {
				curr = curr.next;
			}

			if (curr != null) {
				ListNode temp = curr.next; // Save the next part's starting node
				curr.next = null; // Disconnect the current part
				curr = temp; // Move to the next part
			}

			remaining--; // Reduce extra nodes
		}
		return ans;
	}

	public int findLen(ListNode temp) {
		int count = 0;
		while (temp != null) {
			count++;
			temp = temp.next;
		}
		return count;
	}

	public static void main(String[] args) {

	}

}
