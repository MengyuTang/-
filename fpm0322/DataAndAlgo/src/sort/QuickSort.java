package sort;

/**
 * 快速排序
 * 核心原理：选取一个基数，把小于它的放在它左边，大于它的放在它右边
 * @author FPM0322
 *
 */
public class QuickSort {

	/**
	 * 快速排序
	 * @param arr 源数据
	 * @param low 低位
	 * @param high 高位
	 */
	public void quickSort(int[] arr,int low, int high){
		if(low<high){
			//找到基数，并确定它的正确位置
			int index = getIndex(arr,low,high);
			//对基数之前的数据进行排序
			quickSort(arr, low ,index - 1);
			//对基数之后的数据进行排序
			quickSort(arr, index + 1 ,high);
		}
	}
	
	/**
	 * 寻找基数应该在的位置
	 * @param arr 源数据
	 * @param low 低位
	 * @param high 高位
	 * @return low
	 */
	public int getIndex(int[] arr,int low, int high){
		//选取低位基数
		int temp = arr[low];
		while(low<high){
			//先高位开始遍历
			//当高位数字大于temp，则将high向前移动一位
			while(low<high && arr[high]>=temp){
				high -- ;
			}
			//否则，将high位置的数据赋值给low位置，并开始从低位遍历
			arr[low] = arr[high];
			//当低位的数据小于temp时，low向前移动
			while(low<high && arr[low]<temp){
				low ++ ;
			}
			//否则，将低位数据赋值给high位置
			arr[high] = arr[low];
		}
		//跳出循环，则low == high;此时low的位置就是temp的正确位置
		arr[low] = temp;
		return low;
	}
}
