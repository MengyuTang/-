package linkedlist;

import java.math.BigDecimal;

/**
 * ������
 * @author FPM0322
 *
 * @param <T>
 */
public class MyLinkedList<T> {

	/**
	 * �����ڵ� 
	 * @param head �׽ڵ�
	 * @param node Ҫ�����Ľڵ�
	 */
	@SuppressWarnings("unchecked")
	public Node<T> add(Node<T> head,Node<T> node){
		Node<T> current = null;
		//ֱ����β������
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
	 * ���ض�λ�ò���ڵ�
	 * @param head  �׽ڵ�
	 * @param node  Ҫ�����Ľڵ�
	 * @param index ����ڵ��λ��
	 */
	@SuppressWarnings("unchecked")
	public Node<T> addAt(Node<T> head,Node<T> node,int index){
		Node<T> current = null;
		int counter = 0;//��¼�������Ľڵ����
		//ֱ����β������
		if(head == null){
			head = node;
		}else if(head.next == null){
			head.next = node;
		}else{
			counter = 2;
			if(index<0){
				System.out.println("����λ�ò��Ϸ�������");
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
	 * ɾ���ڵ�
	 * @param head  �׽ڵ�
	 * @param node  Ҫ�����Ľڵ�
	 */
	@SuppressWarnings("unchecked")
	public Node<T> delete(Node<T> head,Node<T> node){
		if(head == null){
			System.out.println("ɾ��ʧ��");
			return head;
		}else if(head.next == null && head != node){
			System.out.println("ɾ��ʧ��");
			return head;
		}else{
			//����ԭ����������node��ȵĽڵ�
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
	 * @param head  �׽ڵ�
	 * @param index Ҫɾ����λ��
	 */
	@SuppressWarnings("unchecked")
	public Node<T> deleteAt(Node<T> head,int index){
		int counter = 0;//��¼�Ѿ��������Ľڵ�ĸ���
		if(head == null){
			System.out.println("ɾ��ʧ��");
			return head;
		}else if(head.next == null && index != 1){
			System.out.println("ɾ��ʧ��");
			return head;
		}else{
			Node<T> current = head.next;
			if(current != null){
				counter = 2;
				if(index<0){
					System.out.println("ɾ��ʧ��");
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
	 * ������ת
	 * @param head
	 * @return reverseNode
	 */
	@SuppressWarnings("unchecked")
	public Node<T> reverseList(Node<T> head){
		/**
		 * ��ת���̣�
		 * 1->2->3->4->null ԭ����
		 * null             ��ת������
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
		 * ��ת���裺
		 * 1����ԭ�����ֳ��������� 1->2->3->4->null     1->null , 2->3->4->null
		 * 2����ԭ����ȡ��head�ŵ����������head  ������1->null�� reverseNodeָ��1
		 * 3������ǰ�ڵ�ָ���һ���ڵ�   ԭ����2->3->4->null,currentNodeָ��2
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
	 * ������������ϲ�
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
	 * ����������Ƿ��л�
	 * ˼·��
	 *  1������һ�����ٽڵ㣬ÿ��������
	 * 	2������һ�������ڵ㣬ÿ����һ��
	 * 	3��������������ڵ��ܹ���������ô˵�����ڻ�
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
	 * ��������м�ڵ�  
	 * ˼·��
	 * 	1������һ�����ٽڵ㣬ÿ��������
	 * 	2������һ�������ڵ㣬ÿ����һ��
	 *  3�������ٽڵ������ʱ�������ڵ�պô����м�λ��
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
	  * ɾ��������K���ڵ�
	  * ˼·��
	  *   1�����������ڵ㣬front��back��pre
	  *   2��front����K���ڵ�
	  *   3��ʣ��n-k-1���ڵ㣬������front��backͬ��������,pre��ָ��back�ڵ�
	  *   4���ٶ�������Ϊn����front�ߵ����back������n-k-1������ʱbackλ�ڵ�����k���ڵ�,preλ��back��ǰһ���ڵ�
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
		Node<T> pre = null;//back��ǰһ���ڵ�
		while(front.next != null){
			front = front.next;
			pre = back;
			back = back.next;
		}
		if(pre == null){
			//��ɾ���׽ڵ�ʱ�ߴ˴���������n�����׽ڵ�
			head = head.next; 
		}else{
			pre.next = pre.next.next;
		}
		return head;
	}
	
	/**
	 * ��ӡ���нڵ��data
	 * @param head �׽ڵ�
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
