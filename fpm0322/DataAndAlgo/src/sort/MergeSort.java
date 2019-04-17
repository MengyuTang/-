package sort;

import java.util.Arrays;

/**
 * �鲢����
 * @author FPM0322
 *
 */
public class MergeSort {

	/**
	 * ����˼�룺����˼��
	 * 	���裺
	 * 	1����� ������ֳ�n�����飬ȷ��ÿ��������ֻ��һ��Ԫ��
	 * 	2���ϲ� ������������һ�δӵ�һ��Ԫ�ؿ�ʼ�Ƚϣ�С�ķ��������飬֪����������Ԫ�غϲ���һ������
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
	 * �Բ�ֺ��������кϲ�
	 * @param left ��ֺ���ߵ�����
	 * @param right ��ֺ��ұߵ�����
	 * @return �ϲ��������
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
