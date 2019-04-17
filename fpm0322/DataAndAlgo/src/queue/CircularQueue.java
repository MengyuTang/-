package queue;

/**
 * ѭ������
 * @author FPM0322
 *
 */
public class CircularQueue {

	private String[] items; //����
	
	private int n;//���г���
	
	private int head = 0;//ͷ��
	
	private int tail = 0;//β��
	
	public CircularQueue(int n){
		this.n = n;
		items = new String[n];
	}
	
	/**
	 * ���
	 * @param item
	 * @return
	 */
	public boolean enqueue(String item){
		if((tail+1)%n == head){
			//����
			return false;
		}
		items[tail] = item;
		tail = (tail+1)%n;
		return false;
	}
	
	/**
	 * ����
	 * @return
	 */
	public String dequeue(){
		if(head == tail){
			//�ӿ�
			return null;
		}
		String ret = items[head];
		head = (head+1)%n;
		return ret;
	}
}
