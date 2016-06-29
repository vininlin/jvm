package gc;

/**
 * 
 * ���ڴ��Ķ�����������
 * 
 * @author linwn@ucweb.com
 * @createDate 2016-6-16
 *
 */
public class TestTenuringThreshold {

	private static final int _1MB = 1024 *1024;
	
	public static void main(String[] args) {
		/**
		 * VM ������-verbose:gc -Xms20M -Xmx20M -Xmn10M -XX:+PrintGCDetails -XX:SurvivorRatio=8 -XX:+UseParNewGC -XX:MaxTenuringThreshold=1 
		 */
		byte[] a ,b,c;
		a = new byte[_1MB/4];
		b = new byte[4*_1MB];
		c = new byte[4*_1MB];
		//---ע�͵����´����Ա�۲죬ע�͵�ֻ�����1�λ��գ�a����survior��from��
		//ûע�͵���Ϊc����ʱ������2�λ��գ���������ﵽ����1�Σ�a�����յ�tenured����
		//�µ�c������eden,�ɵ�c����,bҲ����tenured��
		c = null;
		c = new byte[4*_1MB];

	}

}
