package linkedlist;

/**
 * 双向链表
 * @author FPM0322
 *
 */
public class BothWayLinkedList<T> {
	
	/**
	 * 增加节点
	 * @param head
	 * @param node
	 * @return
	 */
	public BothWayNode<T> add(BothWayNode<T> head,BothWayNode<T> node){
		if(head == null){
			head = node;
			head.pre = null;
			head.next = null;
		}
		BothWayNode<T> cur = head;
		while(cur != null && cur.next != null){
			cur = cur.next;
		}
		cur.next = node;
		node.pre = cur;
		node.next = null;
		return head;
	}
	
	/**
	 * 增加节点
	 * @param head
	 * @param node
	 * @return
	 */
	public BothWayNode<T> addAt(BothWayNode<T> head,BothWayNode<T> node,int index){
		if(head == null){
			head = node;
			head.pre = null;
			head.next = null;
		}
		if(index<0){
			System.out.println("非法插入位置");
			return head;
		}
		if(index == 1){
			head.pre = node;
			node.next = head;
			node.pre = null;
			return node;
		}
		int counter = 1;
		BothWayNode<T> cur = head;
		while(cur.next != null && counter<index){
			counter++;
			if(counter == index){
				BothWayNode<T> nextNode = cur.next;
				cur.next = node;
				node.pre = cur;
				node.next = nextNode;
				nextNode.pre = node;
			}
			cur = cur.next;
		}
		if(counter<index){
			cur.next = node;
			node.pre = cur;
			node.next = null;
		}
		return head;
	}
	
	/**
	 * 打印所有节点的data
	 * @param head 首节点
	 */
	public void printAll(BothWayNode<T> head){
		if(head != null){
			System.out.println("head:"+head.data);
			while(head.next != null){
				System.out.println("head.next:"+head.next.data);
				head = head.next;
			}
		}
	}
}
