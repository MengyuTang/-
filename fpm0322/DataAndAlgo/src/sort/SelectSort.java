package sort;

/**
 * 选择排序
 * @author FPM0322
 *
 */
public class SelectSort {
	
	/**
	 * 核心原理：
	 * 1、从原始数组中选出最小的元素，作为新数组第一个数据
	 * 2、循环从剩余数组中选出最小的数字，放到新数组的后面
	 * 3、直到所有元素都遍历完
	 * @param a
	 */
	public void sort(int[] a){
		if(null == a || a.length<2){
			return;
		}
		for(int i = 0;i<a.length - 1;i++){
			int min = i;
			//遍历剩余数组，找出比a[min]小的数据位置
			for(int j = i+1;j<a.length;j++){
				if(a[j]<a[min]){
					min = j;
				}
			}
			//交换a[min]与a[i]
			if(i != min){
				int temp = a[min];
				a[min] = a[i];
				a[i] = temp;
			}
		}
	}
}
