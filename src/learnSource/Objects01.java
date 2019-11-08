/**
$
file_name :Object01.java
git_config:
package_name:learnSource
project_name:learnSource
time:下午5:06:33
todo:TODO
type_name:Object01
user:lzm
year:2019



 */
package learnSource;

import static org.hamcrest.CoreMatchers.instanceOf;

import java.util.Arrays;
import java.util.Objects;

import org.junit.Test;

/**
 * @author lanzm
 *
 */
public class Objects01 {

	
	/**
	 * objects 全是静态方法 是在java。util下的 需要导入
	 *  要多用 用来判断是不是null 是null抛异常
	 * 
	 */
	@Test
	public void test01(){
		Objects.requireNonNull(null, "reg");
		
	}
	
	
	/**
	 * equals 先判断两个是否同一个对象
	 * 再调用对象的equal方法判断是否相同
	 * 一个null 返回否 两个null 返回是
	 * 对null的容忍比较好 以后都用这个就好了
	 */
	@Test
	public void test02(){
		System.out.println("1:"+Objects.equals(null, null));
		System.out.println("2:"+Objects.equals(null, 123));
		System.out.println("3:"+Objects.equals("282", new String("282")));
	}
	
	
	/**
	 * deepEquals 可以判断数组 
	 *  Arrays.deepEquals0(a, b)
	 *   其余功能与equals一致
	 * 	初步看是通过一直遍历 获取
	 * 	
	 * 
	 * 
	 */
	@Test
	public void test03(){
		System.out.println("1:"+Objects.deepEquals(null, null));
		System.out.println("2:"+Objects.deepEquals(null, 123));
		System.out.println("3:"+Objects.deepEquals("282", new String("282")));
	}
	
	/**
	 * 其实就是调用hashCode
	 * 算法不一样,hash是针对多个的 
	 * 没一个相加
	 * 如果是数组怎么办?这是个疑问 数组的hashcode是怎么算的呢?
	 */
	
	@Test
	public void test04(){
		
		System.out.println(Objects.hashCode("1"));
		String a[] = new String[5];
		System.out.println(Objects.hash("1","2",1,5,8,9,a));
		
		
	}	
	
	/**
	 * 第一个用，应为可能存在基础数据类型嘛
	 * String.valueOf(o);
	 * 第二个是调用toStinrg
	 * 为什么要区分呢个 因为有null的情况
	 * 
	 */
	@Test
	public void test05(){
		char a = 'c';
		// 会把null 变成null字符串
		System.out.println(Objects.toString("0"));
		System.out.println(Objects.toString('a',"888888"));
		
	}


	
	
	
	
	
	
	
	
	
	
	
}

