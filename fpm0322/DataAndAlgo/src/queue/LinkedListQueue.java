package queue;

import linkedlist.Node;

/**
 * 链式队列
 * @author FPM0322
 *
 */
public class LinkedListQueue<T> {
	private Node<T> head;//头结点
	private Node<T> tail;//尾结点
	
	public LinkedListQueue(Node<T> head){
		this.head = head;
		tail = head;
	}
	
	/**
	 * 入队
	 * @param node
	 * @return
	 */
	public boolean enqueue(Node<T> node){
		tail.next = node;
		tail = tail.next;
		return true;
	}
	
	/**
	 * 出队
	 * @return
	 */
	public Node<T> dequeue(){
		Node<T> ret = null;
		if(head == tail){
			ret = head;
			head = null;
		}
		ret = head;
		head = head.next;
		return ret;
	}
}
