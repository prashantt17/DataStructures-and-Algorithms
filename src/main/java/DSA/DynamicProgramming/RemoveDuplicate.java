package DSA.DynamicProgramming;

import DSA.DynamicProgramming.MyLinkedList.Node;

class MyLinkedList {
	Node head;

	static class Node {

		int data;
		Node next;

		Node(int data) {
			this.data = data;
			next = null;
		}
	}

	public void printList(Node node) {

		while (node != null) {
			System.out.print(node.data + " -->");
			node = node.next;
		}
	}

	public void removeDuplicates(Node node) {

		Node left = null;
		Node right = null;

		left = node;

		while (left != null && left.next != null) {
			right = left;

			while (right.next != null) {

				if (left.data == right.next.data) {
					right.next = right.next.next;
				} else {
					right = right.next;
				}
			}
			left = left.next;
		}

	}

}

public class RemoveDuplicate {

	public static void main(String[] args) {

		MyLinkedList obj = new MyLinkedList();

		obj.head = new Node(10);
		obj.head.next = new Node(4);
		obj.head.next.next = new Node(10);
		obj.head.next.next.next = new Node(18);

		obj.printList(obj.head);

		obj.removeDuplicates(obj.head);

		System.out.print("\nAfter Removing duplicates : ");
		obj.printList(obj.head);
	}

}
