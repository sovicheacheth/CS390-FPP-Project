package ListPractice;
/*
 * @Author: Roshan
 * @Info: Prog 8-2
 * */
public class MyStringLinkedList {
	Node head;
	MyStringLinkedList(){
		head = new Node(null,null,null);
	}
	private void addLeft(String s) {
		// TODO Auto-generated method stub
		if(head.data == null){
			head = new Node(null,s,null);
		}
		else{
			Node temp = new Node(null,s,head);
			head.prev = temp;
			head = temp;
		}
	}
	boolean remove(){
		if(head.next == null)
			head = null;
		else{
			Node temp = head.next;
			head = temp;
			head.prev = null;
		}
		return true;
	}
	private void insert(String data, int pos){
		int size = size();
		if(pos > 0 && pos <= size){
			if(pos == 1)
				addLeft(data);
			else{
				int c = 0;
				Node temp = head;
				Node temp2 = head;
				while(c < pos-1){
					temp2 = temp2.next;
					c++;
				}
				Node nw = new Node(null,data,null);
				nw.next = temp2;
				temp2.prev = nw;
				nw.prev = temp;
				temp.next = nw;
			}
		}
	}
	private int size(){
		int c = 0;
		Node temp = head;
		while(temp != null){
			c++;
			temp = temp.next;
		}
		return c;
	}
	public String toString(){
		String output = "";
		Node temp = head;
		while(temp != null){
			output += temp.data + ", ";
			temp = temp.next;
		}
		return output;
	}
	public void minSort(){
		if(head.next == null){
			return;
		}
		else{
			Node temp1 = head;
			Node temp2 = head.next;
			while(temp2 != null){
				if(temp1.data.compareTo(temp2.data) > 0){
					head.data = temp2.data;
					head.next.data = temp1.data;
				}
				temp1 = temp1.next;
				temp2 = temp2.next;
			}
		}
	}
	
	public boolean Search(String s){
		boolean reply=false;
		
		if(head.next == null){
			if(head.data.equals(s))
				reply = true;
		}
		else{
			Node temp = head;
			while(temp != null){
				if(temp.data.equals(s)){
					reply = true;
					break;
				}
				temp = temp.next;
			}
		}
		return reply;
	}

	//------------LinkedList----------------
	class Node{
		Node prev;
		String data;
		Node next;
		
		Node(Node prev, String data, Node next){
			this.prev = prev;
			this.data = data;
			this.next = next;
		}
		public String toString(){
			return data;
		}
	}//----------Node------------
	
	public static void main(String args[]){
		System.out.println("System Started");
		MyStringLinkedList ll = new MyStringLinkedList();
		ll.addLeft("apple");
		ll.addLeft("ball");
		System.out.println(ll);
		ll.insert("cat", 2);
		System.out.println(ll);
		ll.insert("mat", 2);
		System.out.println(ll);
		ll.addLeft("temp");
		System.out.println(ll);
		System.out.println(ll.remove());
		System.out.println(ll);		
		System.out.println(ll.Search("apple"));	
		ll.minSort();
		System.out.println(ll);
	}
}
