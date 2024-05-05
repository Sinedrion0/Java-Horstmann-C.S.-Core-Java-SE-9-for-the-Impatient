package lessonsTwo.com;


public class Seventenn {
static class Queue {
		
		class Iterator {
			private Iterator() {
			}

			public boolean hasNext() {
				if (head != null) {
					return true;
				}
				return false;
			}
			
			public String next() {
				var tempNode = head;
				head = head.next;
				return tempNode.getData();
			}
		}
		
		private class Node {
			private final String data;
			Node next;

			public Node(String data) {
				this.data = data;
			}

			public String getData() {
				return data;
			}
		}

		private Node head;

		private Node tail;

		public void add(String s) {
			var n = new Node(s);
			if (this.head == null) {
				this.head = n;
				this.tail = n;
			} else {
				this.tail.next = n;
				this.tail = n;
			}
		}

		public Queue.Iterator iterator() {
			return new Iterator();
		}

		public String remove() {
			if (this.head == null) {
				return null;
			} else {
				var n = this.head;
				this.head = this.head.next;
				return n.getData();
			}
		}

	}

	public static void main(String[] args) {
		Queue queue = new Queue();
		queue.add("0");
		queue.add("1");
		queue.add("2");
		System.out.println(queue.head.getData());
		System.out.println(queue.tail.getData());
		queue.remove();
		System.out.println(queue.head.getData());
		System.out.println(queue.tail.getData());
		System.out.println(" ");
		Queue.Iterator q = queue.iterator();
		while(q.hasNext() == true) {
			System.out.println(q.next());
		}
}
}
