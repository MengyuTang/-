package stack;

/**
 * 数组实现顺序栈
 * @author FPM0322
 *
 */
public class ArrayStack {

	public int n;//数组大小
	
	public int count;//栈中元素个数
	
	public String[] array;//栈中的数组
	
	public ArrayStack(int n){
		this.n = n;
		this.count = 0;
		array = new String[n];
	}
	
	/**
	 * 入栈操作
	 * @param item 
	 * @return
	 */
	public boolean push(String item){
		if(count == n){
			System.out.println("栈满了，不能再入栈");
			return false;
		}else{
			array[count++] = item;
			return true;
		}
	}
	
	/**
	 * 出栈操作
	 * @return
	 */
	public String pop(){
		String item = "";
		if(count == 0){
			item = "栈内已经没有元素了！";
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
