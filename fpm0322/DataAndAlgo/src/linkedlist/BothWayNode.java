package linkedlist;

/**
 * �ڵ���
 * @author FPM0322
 *
 * @param <T> ����
 */
@SuppressWarnings("hiding")
public class BothWayNode<T>{
	T data;
	public BothWayNode<T> next;
	
	public BothWayNode<T> pre;
	
	public BothWayNode(T data){
		this.data = data;
	}
	
	public T getData(){
		return data;
	}
}
