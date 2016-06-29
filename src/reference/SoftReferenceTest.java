/**
 * 
 */
package reference;

import java.lang.ref.SoftReference;

/**
 * Àà/½Ó¿Ú×¢ÊÍ
 * 
 * @author linwn@ucweb.com
 * @createDate 2016-6-16
 * 
 */
public class SoftReferenceTest {
    
    private static final int _1MB = 1024 *1024;
    /**
     * VMArgs -verbose:gc -Xms20m -Xmx20m -XX:+PrintGCDetails -XX:SurvivorRatio=8
     * @param args
     */
    public static void main(String[] args) {
       byte[] m = new byte[_1MB*10];
       SoftReference<byte[]> b = new SoftReference<byte[]>(m);
       
       System.out.println(b.get());
    }
}
