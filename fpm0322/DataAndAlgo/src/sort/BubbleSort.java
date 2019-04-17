package sort;

/**
 * 冒泡排序
 * @author FPM0322
 *
 */
public class BubbleSort {
	
	/**
	 * 核心原理：
	 * 按照从小到大的顺序排列，相邻元素相比较，小的放前面，大的放后面
	 * @param array
	 * @return
	 */
	public int[] sort(int[] array){
		if(null == array || array.length <=1){
			array = new int[]{};
		}else{
			for(int i = 0;i<array.length-1;i++){
				for(int j = i+1;j<array.length;j++){
					if(array[i]>array[j]){
						int temp = array[i];
						array[i] = array[j];
						array[j] = temp;
					}
				}
			}
		}
		return array;
	}
}
