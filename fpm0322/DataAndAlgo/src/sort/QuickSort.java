package sort;

/**
 * ��������
 * ����ԭ��ѡȡһ����������С�����ķ�������ߣ��������ķ������ұ�
 * @author FPM0322
 *
 */
public class QuickSort {

	/**
	 * ��������
	 * @param arr Դ����
	 * @param low ��λ
	 * @param high ��λ
	 */
	public void quickSort(int[] arr,int low, int high){
		if(low<high){
			//�ҵ���������ȷ��������ȷλ��
			int index = getIndex(arr,low,high);
			//�Ի���֮ǰ�����ݽ�������
			quickSort(arr, low ,index - 1);
			//�Ի���֮������ݽ�������
			quickSort(arr, index + 1 ,high);
		}
	}
	
	/**
	 * Ѱ�һ���Ӧ���ڵ�λ��
	 * @param arr Դ����
	 * @param low ��λ
	 * @param high ��λ
	 * @return low
	 */
	public int getIndex(int[] arr,int low, int high){
		//ѡȡ��λ����
		int temp = arr[low];
		while(low<high){
			//�ȸ�λ��ʼ����
			//����λ���ִ���temp����high��ǰ�ƶ�һλ
			while(low<high && arr[high]>=temp){
				high -- ;
			}
			//���򣬽�highλ�õ����ݸ�ֵ��lowλ�ã�����ʼ�ӵ�λ����
			arr[low] = arr[high];
			//����λ������С��tempʱ��low��ǰ�ƶ�
			while(low<high && arr[low]<temp){
				low ++ ;
			}
			//���򣬽���λ���ݸ�ֵ��highλ��
			arr[high] = arr[low];
		}
		//����ѭ������low == high;��ʱlow��λ�þ���temp����ȷλ��
		arr[low] = temp;
		return low;
	}
}
