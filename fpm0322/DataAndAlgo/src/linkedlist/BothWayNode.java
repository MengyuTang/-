package linkedlist;

/**
 * 节点类
 * @author FPM0322
 *
 * @param <T> 泛型
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
