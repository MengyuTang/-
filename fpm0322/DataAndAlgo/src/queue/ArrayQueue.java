package queue;

/**
 * 数组队列
 * @author FPM0322
 *
 */
public class ArrayQueue {
	private String[] items;//数组
	private int n;//数组长度
	private int head = 0;//头部下标
	private int tail = 0;//尾部下表
	
	public ArrayQueue(int count){
		items = new String[count];
		n = count;
	}
	
	/**
	 * 入队
	 * @param item
	 * @return
	 */
	public boolean enqueue(String item){
		if(tail == n){
			//队列已满
			return false;
		}
		items[tail] = item;
		tail++;
		return true;
	}
	
	/**
	 * 出队
	 * @return
	 */
	public String dequeue(){
		if(head == tail){
			//队列为空
			return null;
		}
		String item = items[head];
		++head;
		return item;
	}
}
