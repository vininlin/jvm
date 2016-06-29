package gc;

/**
 * 
 * 大对象直接分配在老年代
 * 
 * @author linwn@ucweb.com
 * @createDate 2016-6-16
 *
 */
public class TestPretenureSizeThreshold {

	private static final int _1MB = 1024 *1024;
	
	public static void main(String[] args) {
		/**
		 * VM 参数：-verbose:gc -Xms20M -Xmx20M -Xmn10M -XX:+PrintGCDetails -XX:SurvivorRatio=8 -XX:+UseParNewGC -XX:PretenureSizeThreshold=3145728
		 * 默认UseParallelGC无效 
		 */
	    
		byte[] a = new byte[4*_1MB];
		

	}

}
