package queue;

import linkedlist.Node;

/**
 * ��ʽ����
 * @author FPM0322
 *
 */
public class LinkedListQueue<T> {
	private Node<T> head;//ͷ���
	private Node<T> tail;//β���
	
	public LinkedListQueue(Node<T> head){
		this.head = head;
		tail = head;
	}
	
	/**
	 * ���
	 * @param node
	 * @return
	 */
	public boolean enqueue(Node<T> node){
		tail.next = node;
		tail = tail.next;
		return true;
	}
	
	/**
	 * ����
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
