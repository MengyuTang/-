package linkedlist;

import java.math.BigDecimal;

/**
 * 单链表
 * @author FPM0322
 *
 * @param <T>
 */
public class MyLinkedList<T> {

	/**
	 * 新增节点 
	 * @param head 首节点
	 * @param node 要新增的节点
	 */
	@SuppressWarnings("unchecked")
	public Node<T> add(Node<T> head,Node<T> node){
		Node<T> current = null;
		//直接在尾部加入
		if(head == null){
			head = node;
		}else if(head.next == null){
			head.next = node;
		}else{
			current = head.next;
			while(current.next != null){
				current = current.next;
			}
			current.next = node;
		}
		return head;
	}
	
	/**
	 * 在特定位置插入节点
	 * @param head  首节点
	 * @param node  要新增的节点
	 * @param index 插入节点的位置
	 */
	@SuppressWarnings("unchecked")
	public Node<T> addAt(Node<T> head,Node<T> node,int index){
		Node<T> current = null;
		int counter = 0;//记录遍历过的节点个数
		//直接在尾部加入
		if(head == null){
			head = node;
		}else if(head.next == null){
			head.next = node;
		}else{
			counter = 2;
			if(index<0){
				System.out.println("插入位置不合法！！！");
				return head;
			}
			if(index == 1){
				Node<T> newHead = head;
				node.next = newHead;
				head = node;
			}
			if(index == 2){
				Node<T> nextNode = head.next;
				head.next = node;
				node.next = nextNode;
			}
			current = head.next;
			while(current.next != null){
				if(index == counter + 1){
					Node<T> pre = current;
					node.next = current.next;
					pre.next = node;
					return head;
				}
				counter ++;
				current = current.next;
			}
		}
		return head;
	}
	
	/**
	 * 删除节点
	 * @param head  首节点
	 * @param node  要新增的节点
	 */
	@SuppressWarnings("unchecked")
	public Node<T> delete(Node<T> head,Node<T> node){
		if(head == null){
			System.out.println("删除失败");
			return head;
		}else if(head.next == null && head != node){
			System.out.println("删除失败");
			return head;
		}else{
			//遍历原链表，查找与node相等的节点
			Node<T> current = head.next;
			if(current != null){
				Node<T> preNode = null;
				Node<T> nextNode = null;
				while(current.next != null){
					if(current.next == node){
						preNode = current;
						nextNode = current.next;
						preNode.next = nextNode.next;
						current = null;
						return head;
					}
					current = current.next;
				}
			}
		}
		return head;
	}
	
	/**
	 * 
	 * @param head  首节点
	 * @param index 要删除的位置
	 */
	@SuppressWarnings("unchecked")
	public Node<T> deleteAt(Node<T> head,int index){
		int counter = 0;//记录已经遍历过的节点的个数
		if(head == null){
			System.out.println("删除失败");
			return head;
		}else if(head.next == null && index != 1){
			System.out.println("删除失败");
			return head;
		}else{
			Node<T> current = head.next;
			if(current != null){
				counter = 2;
				if(index<0){
					System.out.println("删除失败");
					return head;
				}
				if(index == 1){
					head = head.next;
				}
				if(index == 2){
					Node<T> preNode = head;
					preNode.next = head.next.next;
				}
				while(current.next != null){
					Node<T> preNode = null;
					Node<T> nextNode = null;
					if(index == counter+1){
						preNode = current;
						nextNode = current.next;
						preNode.next = nextNode.next;
						current = null;
						return head;
					}
					counter++;
					current = current.next;
				}
			}
		}
		return head;
	}
	
	/**
	 * 单链表反转
	 * @param head
	 * @return reverseNode
	 */
	@SuppressWarnings("unchecked")
	public Node<T> reverseList(Node<T> head){
		/**
		 * 反转过程：
		 * 1->2->3->4->null 原链表
		 * null             反转后链表
		 * 
		 * 2->3->4->null
		 * 1->null
		 * 
		 * 3->4->null
		 * 2->1->null
		 * 
		 * 4->null
		 * 3->2->1->null
		 * 
		 * null
		 * 4->3->2->1->null
		 */
		/**
		 * 反转步骤：
		 * 1、将原链表拆分成两个链表 1->2->3->4->null     1->null , 2->3->4->null
		 * 2、从原链表取其head放到心新链表的head  新链表：1->null， reverseNode指向1
		 * 3、将当前节点指向后一个节点   原链表：2->3->4->null,currentNode指向2
		 */
		Node<T> reverseNode = null;
		Node<T> currentNode = head;
		while(currentNode != null){
			Node<T> nextNode = currentNode.next;
			currentNode.next = reverseNode;
			reverseNode = currentNode;
			currentNode = nextNode;
		}
		return reverseNode;
	}
	
	/**
	 * 两个有序链表合并
	 * @param a
	 * @param b
	 * @return
	 */
	public Node<Number> mergeSorted(Node<Number> a,Node<Number> b){
		Node<Number> head = null;
		if(a == null) return b;
		if(b == null) return a;
		Node<Number> p = a;
		Node<Number> q = b;
		if(p.data.doubleValue()<q.data.doubleValue()){
			head = p;
			p = p.next;
		}else{
			head = q;
			q = q.next;
		}
		Node<Number> r = head;
		while(p != null && q != null){
			if(p.data.doubleValue()<q.data.doubleValue()){
				r.next = p;
				p = p.next;
			}else{
				r.next = q;
				q = q.next;
			}
		}
		if(p != null){
			r.next = p;
		}else{
			r.next = q;
		}
		return head;
	}
	
	/**
	 * 检测链表中是否有环
	 * 思路：
	 *  1、定义一个快速节点，每次走两步
	 * 	2、定义一个正常节点，每次走一步
	 * 	3、如果最终两个节点能够相遇，那么说明存在环
	 * @param head
	 * @return
	 */
	public boolean checkCircle(Node<T> head){
		if (head == null) return false;
		Node<T> fast = head.next;
		Node<T> slow = head;
		while(fast != null && fast.next != null){
			fast = fast.next.next;
			slow = slow.next;
			if(slow == fast) return true;
		}
		return false;
	}
	
	/**
	 * 求链表的中间节点  
	 * 思路：
	 * 	1、定义一个快速节点，每次走两步
	 * 	2、定义一个正常节点，每次走一步
	 *  3、当快速节点走完的时候，正常节点刚好处于中间位置
	 * @param head
	 * @return
	 */
	public Node<T> getMidNode(Node head){
		if(head == null){
			return null;
		}
		Node<T> fast = head;
		Node<T> slow = head;
		while(fast.next != null && fast.next.next != null){
			fast = fast.next.next;
			slow = slow.next;
		}
		return slow;
	}
	
	 /**
	  * 删除倒数第K个节点
	  * 思路：
	  *   1、定义两个节点，front、back、pre
	  *   2、front先走K个节点
	  *   3、剩余n-k-1个节点，接下来front与back同步往后走,pre则指向back节点
	  *   4、假定链表长度为n，当front走到最后，back则走了n-k-1步，此时back位于倒数第k个节点,pre位于back的前一个节点
	  * @param head
	  * @param k
	  * @return
	  */
	public Node<T> deleteLastKth(Node<T> head,int k){
		Node<T> front = head;
		Node<T> back = head;
		if(head == null) return null;
		int i = 1;
		while(front != null && i<k){
			front = front.next;
			i++;
		}
		if(front == null){
			return head;
		}
		Node<T> pre = null;//back的前一个节点
		while(front.next != null){
			front = front.next;
			pre = back;
			back = back.next;
		}
		if(pre == null){
			//当删除首节点时走此处，倒数第n个即首节点
			head = head.next; 
		}else{
			pre.next = pre.next.next;
		}
		return head;
	}
	
	/**
	 * 打印所有节点的data
	 * @param head 首节点
	 */
	public void printAll(Node<T> head){
		if(head != null){
			System.out.println("head:"+head.data);
			while(head.next != null){
				System.out.println("head.next:"+head.next.data);
				head = head.next;
			}
		}
	}
}
