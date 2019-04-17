package sort;

/**
 * ѡ������
 * @author FPM0322
 *
 */
public class SelectSort {
	
	/**
	 * ����ԭ��
	 * 1����ԭʼ������ѡ����С��Ԫ�أ���Ϊ�������һ������
	 * 2��ѭ����ʣ��������ѡ����С�����֣��ŵ�������ĺ���
	 * 3��ֱ������Ԫ�ض�������
	 * @param a
	 */
	public void sort(int[] a){
		if(null == a || a.length<2){
			return;
		}
		for(int i = 0;i<a.length - 1;i++){
			int min = i;
			//����ʣ�����飬�ҳ���a[min]С������λ��
			for(int j = i+1;j<a.length;j++){
				if(a[j]<a[min]){
					min = j;
				}
			}
			//����a[min]��a[i]
			if(i != min){
				int temp = a[min];
				a[min] = a[i];
				a[i] = temp;
			}
		}
	}
}
