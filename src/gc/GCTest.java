package gc;

import java.util.HashMap;

public class GCTest {
    private static final int _512 = 512;
    
    private static final int _1BYTE = 1024;
    
    private static final int _1MB = 1024 *1024;
    
	static HashMap map = new HashMap();
	
	/**
	 * -Xmx512M -Xms512M  -XX:+PrintGCDetails -XX:+UseParallelOldGC
	 * @param args
	 */
	public static void main(String[] args){
		long beginTime = System.currentTimeMillis();
		for(int i = 0 ; i < 20000; i++){
			if(map.size() * 512 /1024 /1024 >= 400){
				map.clear();
				System.out.println("clean map ." );
			}
			byte[] b1;
			for(int j = 0 ; j < 100 ; j++){
				b1 = new byte[_512];
				map.put(System.nanoTime(), b1);
			}
			
		}
		//System.gc();
		long endTime = System.currentTimeMillis();
		System.out.println("cost time = " + (endTime - beginTime));
	}
}
