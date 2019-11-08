/**
$
file_name :bitOperation.java
git_config:
package_name:learnSource
project_name:learnSource
time:下午3:35:18
todo:TODO
type_name:bitOperation
user:lzm
year:2019



 */
package learnSource;

import org.junit.Test;

/**
 * @author lanzm
 *
 */
public class BitOperation {
	
	/**
	 *	翻倍  相当于*2的多少次方 
	 * 
	 */
	@Test
	public void test01(){
		int a = 46;
		System.out.println(a<<1);
		System.out.println(a<<2);
		
	}
	
	/**
	 * 除以二 有余数不管 
	 */
	
	@Test
	public void test02(){
		int a = 46;
		System.out.println(a>>1);
		System.out.println(a>>2);
		System.out.println(46/4);
	}	
	
	
	
	
	
	

}
