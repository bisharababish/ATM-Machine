package src;

public class LinkedList {

	Node head;
	Node tail;

	public void Insert(String name) {
		Node n = new Node();
		n.name = name;

		if (head == null) {
			head = n;
		} else {
			Node n2 = head;
			while (n2.next != null) {
				n2 = n2.next;
			}
			n2.next = n;
		}
	}

	public String getName(int i) {
		Node n = head;
		for (int j = 0; j < i; j++) {
			n = n.next;
		}
		return n.name;
	}

	public int getSize() {
		Node n = head;
		int size = 0;
		while (n.next != null) {
			size = size + 1;
			n = n.next;
		}
		return size;
	}

	public void Show() {
		Node n = head;
		while (n.next != null) {
			System.out.println(n.name);
			n = n.next;
		}
		System.out.println(n.name);
	}
}
