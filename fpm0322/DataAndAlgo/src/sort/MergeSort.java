package sort;

import java.util.Arrays;

/**
 * 归并排序
 * @author FPM0322
 *
 */
public class MergeSort {

	/**
	 * 核心思想：分治思想
	 * 	步骤：
	 * 	1、拆分 将数组分成n个数组，确保每个数组内只有一个元素
	 * 	2、合并 相邻两个数组一次从第一个元素开始比较，小的放入新数组，知道最终所有元素合并成一个数组
	 * @param a
	 */
	public int[] sort(int[] a){
		if(null == a || a.length<2){
			return a;
		}
		int mid = (int) Math.floor(a.length/2);
		int[] left = Arrays.copyOfRange(a,0, mid);
		int[] right = Arrays.copyOfRange(a,mid, a.length);
		return merge(sort(left),sort(right));
	}
	
	/**
	 * 对拆分后的数组进行合并
	 * @param left 拆分后左边的数组
	 * @param right 拆分后右边的数组
	 * @return 合并后的数组
	 */
	public int[] merge(int[] left,int[] right){
		int[] result = new int[left.length+right.length];
		int i = 0;
		while(left.length>0 && right.length>0){
			if(left[0]<right[0]){
				result[i++] = left[0];
				left = Arrays.copyOfRange(left, 1, left.length);
			}else{
				result[i++] = right[0];
				right = Arrays.copyOfRange(right, 1, right.length);
			}
		}
		while(left.length>0){
			result[i++] = left[0];
			left = Arrays.copyOfRange(left, 1, left.length);
		}
		while(right.length>0){
			result[i++] = right[0];
			right = Arrays.copyOfRange(right, 1, right.length);
		}
		return result;
	}
}
