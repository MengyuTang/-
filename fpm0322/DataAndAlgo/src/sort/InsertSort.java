package sort;

/**
 * ��������
 * @author FPM0322
 *
 */
public class InsertSort {

	/**
	 * ����ԭ��������ֳ��������䣺�����������δ�������䣬ÿ�δ�δ��������ȡ��һ�������뵽����������ĺ���λ�ã�֪��δ��������û������
	 * @param a
	 * @param n ���鳤��
	 */
	public void sort(int[] a,int n){
		if(null == a || a.length<=1){
			return;
		}
		for(int i = 1;i<n;i++){
			//ѭ����δ��������ȡ���ݣ������뵽����������
			int value = a[i];
			int j = i - 1;
			for(;j>=0;--j){
				//�������ݣ���Ҫ��������������ݺ���
				if(a[j]>value){
					a[j+1] = a[j];
				}else{
					break;
				}
			}
			//��������֮�󣬲�������
			a[j+1] = value;
		}
	}
	
}
