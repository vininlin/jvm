package gc;

/**
 * 
 * 对象优先分配在Eden区，当不足时，发起Minor GC
 * 
 * @author linwn@ucweb.com
 * @createDate 2016-6-16
 *
 */
public class TestAllocation {
	
	private static final int _1MB = 1024 *1024;

	public static void main(String[] args) {
		/**
		 * VM 参数：-verbose:gc -Xms20M -Xmx20M -Xmn10M -XX:+PrintGCDetails -XX:SurvivorRatio=8
		 * Xmn年轻代
		 * survior=from:to:eden=1:1:8
		 * a,b,c分配在eden区，d直接分区在老年代
		 */
		byte[] a,b,c,d;
		a = new byte[2*_1MB];
		b = new byte[2*_1MB];
		c = new byte[2*_1MB];
		d = new byte[4*_1MB];
	}

}
