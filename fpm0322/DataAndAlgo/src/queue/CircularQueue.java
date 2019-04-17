package queue;

/**
 * 循环队列
 * @author FPM0322
 *
 */
public class CircularQueue {

	private String[] items; //数组
	
	private int n;//队列长度
	
	private int head = 0;//头部
	
	private int tail = 0;//尾部
	
	public CircularQueue(int n){
		this.n = n;
		items = new String[n];
	}
	
	/**
	 * 入队
	 * @param item
	 * @return
	 */
	public boolean enqueue(String item){
		if((tail+1)%n == head){
			//队满
			return false;
		}
		items[tail] = item;
		tail = (tail+1)%n;
		return false;
	}
	
	/**
	 * 出队
	 * @return
	 */
	public String dequeue(){
		if(head == tail){
			//队空
			return null;
		}
		String ret = items[head];
		head = (head+1)%n;
		return ret;
	}
}
