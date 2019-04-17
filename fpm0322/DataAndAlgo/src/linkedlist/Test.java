package linkedlist;

import stack.LinkedListStack;

public class Test {

	public static void main(String[] args) {
//		BothWayNode<Integer> node1 = new BothWayNode<Integer>(1);
//		BothWayNode<Integer> node2 = new BothWayNode<Integer>(2);
//		BothWayNode<Integer> node3 = new BothWayNode<Integer>(3);
//		BothWayNode<Integer> node4 = new BothWayNode<Integer>(4);
//		BothWayNode<Integer> node5 = new BothWayNode<Integer>(5);
//		BothWayLinkedList<Integer> bothLink = new BothWayLinkedList<Integer>();
//		bothLink.add(node1, node2);
//		bothLink.add(node2, node3);
//		bothLink.add(node3, node4);
//		bothLink.printAll(node1);
//		System.out.println("-----------------分界线--------------------------");
//		BothWayNode<Integer> newNode = bothLink.addAt(node1,node5,4);
//		bothLink.printAll(newNode);
		
		
//		MyLinkedList<Integer> myLink = new MyLinkedList<Integer>();
//		myLink.add(node1, node2);
//		myLink.add(node1, node3);
//		myLink.add(node1, node4);
//		Node<Integer> newNode = myLink.addAt(node1, new Node<Integer>(5),1);
//		myLink.printAll(newNode);
//		System.out.println("-----------------分界线--------------------------");
//		Node<Integer> deleteNode = myLink.deleteAt(newNode, 6);
//		myLink.printAll(deleteNode);
//		System.out.println("中间节点-----------------分界线--------------------------");
//		Node<Integer> mid = myLink.getMidNode(deleteNode);
//		myLink.printAll(mid);
//		System.out.println("删除倒数第K个节点-----------------分界线--------------------------");
//		Node<Integer> afterDelete = myLink.deleteLastKth(newNode, 5);
//		myLink.printAll(afterDelete);
		
//		ArrayStack arrayStack = new ArrayStack(10);
//		for (int i = 1; i < 11; i++) {
//			arrayStack.push(i+"");
//		}
//		arrayStack.printAll();
//		System.out.println("-----------------分界线--------------------------");
//		arrayStack.push("11");
//		System.out.println("count:"+arrayStack.count);
//		int count = arrayStack.count;
//		for (int i = 0; i < count; i++) {
//			String item = arrayStack.pop();
//			System.out.println(item);
//		}
//		String item = arrayStack.pop();
//		System.out.println(item);
//		System.out.println("-----------------分界线--------------------------");
		Node<String> head = new Node<String>("1test");
		LinkedListStack linkedStack = new LinkedListStack(head);
		for (int i = 2; i < 11; i++) {
			linkedStack.push(i+"test");
		}
		linkedStack.printAll();
		int count = linkedStack.count;
		for (int i = 0; i < count; i++) {
			String item = linkedStack.pop();
			System.out.println(item);
		}
		String item = linkedStack.pop();
		System.out.println(item);
		System.out.println("-----------------分界线--------------------------");
	}
	
}
