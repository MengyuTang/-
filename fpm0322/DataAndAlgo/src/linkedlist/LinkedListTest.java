package linkedlist;

public class LinkedListTest {

	public static void main(String[] args) {
		Node<Integer> node1 = new Node<Integer>(1);
		Node<Integer> node2 = new Node<Integer>(2);
		Node<Integer> node3 = new Node<Integer>(3);
		Node<Integer> node4 = new Node<Integer>(4);
		MyLinkedList<Integer> myLink = new MyLinkedList<Integer>();
		myLink.add(node1, node2);
		myLink.add(node1, node3);
		myLink.add(node1, node4);
		Node<Integer> newNode = myLink.addAt(node1, new Node<Integer>(5),1);
		myLink.printAll(newNode);
		System.out.println("-----------------·Ö½çÏß--------------------------");
		Node<Integer> deleteNode = myLink.deleteAt(newNode, 6);
		myLink.printAll(deleteNode);
	}
	
}
