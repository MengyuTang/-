package sort;

/**
 * 插入排序
 * @author FPM0322
 *
 */
public class InsertSort {

	/**
	 * 核心原理：将数组分成两个区间：已排序区间和未排序区间，每次从未排序区间取第一个数插入到已排序区间的合适位置，知道未排序区间没有数据
	 * @param a
	 * @param n 数组长度
	 */
	public void sort(int[] a,int n){
		if(null == a || a.length<=1){
			return;
		}
		for(int i = 1;i<n;i++){
			//循环从未排序区间取数据，并插入到已排序区间
			int value = a[i];
			int j = i - 1;
			for(;j>=0;--j){
				//插入数据，需要将数组的其他数据后移
				if(a[j]>value){
					a[j+1] = a[j];
				}else{
					break;
				}
			}
			//搬移数据之后，插入数据
			a[j+1] = value;
		}
	}
	
}
