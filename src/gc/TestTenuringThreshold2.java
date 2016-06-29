package gc;

public class TestTenuringThreshold2 {

	private static final int _1MB = 1024 *1024;
	
	public static void main(String[] args) {
		/**
		 * VM ������-verbose:gc -Xms20M -Xmx20M -Xmn10M -XX:+PrintGCDetails -XX:SurvivorRatio=8 -XX:+UseParNewGC -XX:MaxTenuringThreshold=15 
		 */
		byte[] a ,b,c,d;
		a = new byte[_1MB/4];
		b = new byte[_1MB/4];
		//a+b����512K������Survivor�ռ��һ��
		c = new byte[4*_1MB];
		//��������eden����a,b����survior from����cֱ�ӽ���tenured��
		//Ȼ���eden����d����
		d = new byte[4*_1MB];
		//------ע���������ݹ۲�
		d = null;
		//������2�λ��գ�dû�����õ�ʵ�������ϵ�d���õ�����ֱ�ӱ����յ�
		//�µ�d������eden��
		//��Survivor�ռ����ͬ��������ж���Ĵ�С�ܺ͵���Survivor�ռ��һ��ʱ��Ҳ�����GC��
		d = new byte[4*_1MB];

	}

}
