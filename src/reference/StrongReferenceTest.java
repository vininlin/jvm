/**
 * 
 */
package reference;

import java.util.ArrayList;
import java.util.List;


/**
 *强引用
 * 
 * @author linwn@ucweb.com
 * @createDate 2016-6-16
 * 
 */
public class StrongReferenceTest {

    /**
     * VMArgs -Xms20m -Xmx20m -XX:+HeapDumpOnOutOfMemoryError -XX:HeapDumpPath=d:\jvmdump\HeadOOM.bin
     */
    public static void main(String[] args) {
        method();
    }
    
    public static void method(){
        byte[] bytes = new byte[1024];
        
        //内存不足时不会回收引用对象所占内存。
        List<byte[]> list = new ArrayList<byte[]>();
        while(true){
            list.add(bytes);
        }
    }

}
