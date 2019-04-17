package queue;

/**
 * �������
 * @author FPM0322
 *
 */
public class ArrayQueue {
	private String[] items;//����
	private int n;//���鳤��
	private int head = 0;//ͷ���±�
	private int tail = 0;//β���±�
	
	public ArrayQueue(int count){
		items = new String[count];
		n = count;
	}
	
	/**
	 * ���
	 * @param item
	 * @return
	 */
	public boolean enqueue(String item){
		if(tail == n){
			//��������
			return false;
		}
		items[tail] = item;
		tail++;
		return true;
	}
	
	/**
	 * ����
	 * @return
	 */
	public String dequeue(){
		if(head == tail){
			//����Ϊ��
			return null;
		}
		String item = items[head];
		++head;
		return item;
	}
}
