package stack;

import linkedlist.MyLinkedList;
import linkedlist.Node;

/**
 * ����ʵ�� ��ʽջ
 * @author FPM0322
 *
 */
public class LinkedListStack {
	public int count;//ջ��Ԫ�ظ���
	
	public MyLinkedList<String> linkedList;
	
	public Node<String> head;//����ͷ�ڵ�
	
	public LinkedListStack(Node<String> head){
		this.head = head;
		this.count = 1;
		this.linkedList = new MyLinkedList<String>();
	}
	
	/**
	 * ��ջ����
	 * @param item
	 * @return
	 */
	public void push(String item){
		Node<String> node = new Node<String>(item);
		linkedList.add(head, node);
		count++;
	}
	
	/**
	 * ��ջ����
	 */
	public String pop(){
		String item = "";
		if(count == 0){
			item = "ջ���Ѿ�û��Ԫ���ˣ�";
		}
		if(count == 1){
			item = head.getData();
			linkedList.delete(head,head);
			count --;
		}
		if(count == 2){
			item = head.next.getData();
			linkedList.delete(head,head.next);
			count --;
		}
		int counter = 2;
		Node<String> cur = head.next;
		while(cur != null){
			if(counter == count){
				item = cur.getData();
				linkedList.deleteAt(head, count);
				count --;
				return item;
			}
			cur = cur.next;
			counter++;
		}
		return item;
	}
	
	public void printAll(){
		linkedList.printAll(head);
	}
}
