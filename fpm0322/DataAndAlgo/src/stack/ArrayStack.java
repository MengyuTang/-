package stack;

/**
 * ����ʵ��˳��ջ
 * @author FPM0322
 *
 */
public class ArrayStack {

	public int n;//�����С
	
	public int count;//ջ��Ԫ�ظ���
	
	public String[] array;//ջ�е�����
	
	public ArrayStack(int n){
		this.n = n;
		this.count = 0;
		array = new String[n];
	}
	
	/**
	 * ��ջ����
	 * @param item 
	 * @return
	 */
	public boolean push(String item){
		if(count == n){
			System.out.println("ջ���ˣ���������ջ");
			return false;
		}else{
			array[count++] = item;
			return true;
		}
	}
	
	/**
	 * ��ջ����
	 * @return
	 */
	public String pop(){
		String item = "";
		if(count == 0){
			item = "ջ���Ѿ�û��Ԫ���ˣ�";
		}else{
			item = array[--count];
		}
		return item;
	}
	
	public void printAll(){
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
}
