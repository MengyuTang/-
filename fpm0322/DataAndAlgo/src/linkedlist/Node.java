package linkedlist;

/**
 * 节点类
 * @author FPM0322
 *
 * @param <T> 泛型
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
