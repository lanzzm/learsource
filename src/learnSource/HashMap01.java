/**
$
file_name :HashMap01.java
git_config:
package_name:learnSource
project_name:learnSource
time:下午4:47:42
todo:TODO
type_name:HashMap01
user:lzm
year:2019



 */
package learnSource;

import java.util.HashMap;

import org.junit.Test;

/**
 * @author lanzm
 *
 */
public class HashMap01 {
	
	
	/**
	 * 默认最大容量 十亿
	 * 如果初始化的时候更改 则使用十亿 不能更高
	 *  hashmap的容量一定是2的咪
	 * 1 2 4 8 16 32 64 128 256 512 1024 2048
	 */
	@Test
	public void test01(){
		System.out.println(tableSizeFor(176));		
	}
	
	/**
	 * 
	 * 返回给定目标容量的两倍幂。
	 * @param cap
	 * @return
	 */
	static final int MAXIMUM_CAPACITY = 1 << 30;
    static final int tableSizeFor(int cap) {
        int n = cap - 1;
        n |= n >>> 1;     
		System.out.println(n); 
        n |= n >>> 2;
        System.out.println(n);
        n |= n >>> 4;
        System.out.println(n);
        n |= n >>> 8;
        System.out.println(n);
        n |= n >>> 16;
        System.out.println(n);
        return (n < 0) ? 1 : (n >= MAXIMUM_CAPACITY) ? MAXIMUM_CAPACITY : n + 1;
    }
	
    /**
     * hashMap 里面的hash算法
     * 有一个临界值 1<<16
     * 如果值大于65535 则 hashcode 的算法有所不用 是 int ss= d^(d>>>16)
     * 如果小于等于65535 则hashcode 就是原obj的算法
     * 
     */
	@Test
	public void test02(){
		HashMap a = new HashMap(56);
		int d = (1<<16)-1;
		System.out.println(d);
		int ss= d^(d>>>16);
		System.out.println(ss);
		d = 1<<16;
		ss= d^(d>>>16);
		System.out.println(ss);		
	}   
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
	

}
