package linkedlist;

/**
 * �ڵ���
 * @author FPM0322
 *
 * @param <T> ����
 */
@SuppressWarnings("hiding")
public class Node<T>{
	T data;
	public Node<T> next;
	
	public Node(T data){
		this.data = data;
	}
	
	public T getData(){
		return data;
	}
}
