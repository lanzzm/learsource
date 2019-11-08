/**
$
file_name :SomeBase.java
git_config:
package_name:learnSource
project_name:learnSource
time:下午4:47:10
todo:TODO
type_name:SomeBase
user:lzm
year:2019



 */
package learnSource;

import java.util.Objects;

import org.junit.Test;

/**
 * @author lanzm
 *
 */
public class SomeBase {
	/**
	 * 计算程序时间
	 * 该方法的作用是返回当前的计算机时间，
	 * 时间的表达格式为当前计算机时间和GMT时间(格林威治时间)1970年1月1号0时0分0秒所差的毫秒数
	 * 1秒=1000毫秒
	 */
	@Test
	public void test01(){
		
		long begin = System.currentTimeMillis();
		long end = System.currentTimeMillis();
		System.out.println("毫秒:"+(begin-end));
		
	}
	/**
	 *	自动装箱 会传入obj 或者character  有限最大匹配 
	 * 
	 */
	@Test
	public void test02(){
		char a = 'c';
		aa(a);
	}
	/**
	 * 看看是否会装箱
	 * @param a
	 */
	private void aa(Object a){
		boolean c = a instanceof Character;
		System.out.println(c);
	}
	/**
	 * 最精准的匹配
	 * @param a
	 */
	private void aa(Character a){
		boolean c = a instanceof Character;
		System.out.println(c+"456");
	}
		
	
	@Test
	public void test04(){
		
		//构造方法调用另一个构造方法
		this();
	}
	
	
	

	
	
	
	
	
	
	
	
}
