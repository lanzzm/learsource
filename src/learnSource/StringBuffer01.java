/**
$
file_name :String01.java
git_config:
package_name:learnSource
project_name:learnSource
time:上午10:36:49
todo:TODO
type_name:String01
user:lzm
year:2019



 */
package learnSource;


import java.util.Arrays;

import org.junit.Test;

/**
 * @author lanzm
 *
 */
public class StringBuffer01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		StringBuffer a = new StringBuffer("nihao");
		//这个是返回count 5 
		System.out.println(a.length());
		//放回char[]的length  构造函数5+16
		System.out.println(a.capacity());
		
		a.ensureCapacity(18);
		//小于5+16 则不变
		System.out.println(a.capacity());
	
		a.ensureCapacity(23);
		//大于5+16 则判断是否大于等于(5+16)*2+2  不大于 就是(5+16)*2+2=44
		System.out.println(a.capacity());
//		1000
		//100>90 改为100
		a.ensureCapacity(100);
		System.out.println(a.capacity());
		
		a.trimToSize();
		// 回归5
		System.out.println(a.capacity());
		
		// 相当于8*2
		System.out.println(8<<1);
		
		StringBuffer b = new StringBuffer("nihao");
		b.setLength(1);
		// 先执行 ensure 确认长度
		System.out.println(b.length());
		System.out.println(b.capacity());	
		// n
		System.out.println(b.toString());
	
		// 
		b.setLength(30);
		// 先执行 ensure 确认长度
		System.out.println(b.length());
		// 44
		System.out.println(b.capacity());	
		// n
		System.out.println(b.toString());		

	}
	
	
	/**
	 * 构造函数
	 * 
	 */
	
	@Test
	public void test01(){
		//无参
		StringBuffer a = new StringBuffer();
		System.out.println("1:"+a.capacity());
		//string
		StringBuffer b = new StringBuffer("nihao");
		System.out.println("2:"+b.capacity());
		//int
		StringBuffer c = new StringBuffer(88);
		System.out.println("3:"+c.capacity());
		//int
		StringBuffer d = new StringBuffer(1);
		System.out.println("4:"+d.capacity());
	}
	
	/**
	 * length()和capacity()的区别
	 */
	@Test
	public void test02(){
		//无参
		StringBuffer a = new StringBuffer("nihao");
		System.out.println("1:"+a.length());
		System.out.println("2:"+a.capacity());
	}
	
	
	/**
	 * 会用到Arrays.copyOf
	 * ensureCapacity 
	 * 如果当前的输入<capacity 则都不执行
	 * 如果本身是21 
	 * 新的<44 
	 * 则为44
	 * 新的>44 则为新的
	 * 原则 要么不变 要么扩大到2倍当前
	 */
	@Test
	public void test03(){
		//无参
		StringBuffer a = new StringBuffer("nihao");	
		a.ensureCapacity(25);
		System.out.println("1:"+a.capacity());
		
		StringBuffer b = new StringBuffer("nihao");	
		b.ensureCapacity(50);		
		System.out.println("2:"+b.capacity());
				
	}	
	
	
	/** trimToSize
	 * 	把容量调整为最小
	 * 	会用到Array。copy 数量多会影响性能
	 * 
	 */
	@Test
	public void test04(){
		StringBuffer a = new StringBuffer("nihao");	
		a.trimToSize();
		System.out.println("1:"+a.capacity());
		System.out.println("2:"+a.length());
	}
	
	/**setLength
	 * 如果新的长度>当前capacity
	 * 则进行扩容 
	 *  容量值为 *2+2 与 参数值 中最大一个
	 *  然后
	 */
	@Test
	public void test05(){
		
		StringBuffer a = new StringBuffer("nihao");	
		a.setLength(100);
		System.out.println("1:"+a.capacity());
		System.out.println("2:"+a.length());
		
		
		StringBuffer b = new StringBuffer("nihao");	
		b.setLength(15);
		System.out.println("3:"+b.capacity());
		System.out.println("4:"+b.length());
		
		StringBuffer c = new StringBuffer("nihao");	
		b.setLength(2);
		System.out.println("5:"+b.capacity());
		System.out.println("6:"+b.length());
	}
	
	/**
	 * append
	 * 
	 * 首先判断是不是空 是空就+null
	 * 然后ensure 新字符串的count
	 * 比如 nihao 会 ensure 5+新的长度
	 *  
	 * append 到了临界点不一定是*2+2 源码调用的是 AbstractStringBuilder 这个抽象类里面的 ensureCapacityInternal  
	 * 逻辑是这样的 如果要确保的长度小于当前char[]的容量 则什么都不执行 
	 * 如果要确保的长度>当前容量 又小于当前容量*2+2 则扩容到*2+2
	 * 如果要确保的长度>当前容县*2+2 则扩容到这个容量
	 * 
	 * 
	 */
	@Test
	public void test06(){
		
		StringBuffer a = new StringBuffer("nihao");	
		
		System.out.println("1:"+a.capacity());
		System.out.println("2:"+a.length());
		
		// 7+5 <16+5 不在乎 不用重构
		a.append("fuckyou"); 

		System.out.println("3:"+a.capacity());
		System.out.println("4:"+a.length());
			
		Object b = null;
		a.append(b);
		
		System.out.println("5:"+a.capacity());
		System.out.println("6:"+a.length());		
		System.out.println("7:"+a);
		
		//16+9=25 <21*2+2
		a.append("123456789");
		System.out.println("8:"+a.capacity());
		System.out.println("9:"+a.length());		

	}		
	
	/**
	 * delete 前包含 后不包含 如果前后一致 不处理
	 * 其实就是调用System.arraycopy, 把本身覆盖
	 *  capacity 是不会变的 count 才会变
	 * 
	 */
	
	@Test
	public void test07(){
		StringBuffer a = new StringBuffer("nihaopengyou");
		System.out.println("1:"+a.capacity());
		System.out.println("2:"+a.length());			
		
		a.delete(2, 5);
		System.out.println("3:"+a.capacity());
		System.out.println("4:"+a.length());			
		System.out.println("5:"+a);			
		
	}
	
	
	/**
	 * substring 
	 * 注意! 这个是返回String 而且自身不会变动的!
	 * 
	 * 
	 */
	@Test
	public void test08(){
		StringBuffer a = new StringBuffer("hello world ");
		System.out.println(a.substring(6));
		System.out.println(a);
	}
	
	/**
	 * 
	 * 这个是操作自身啦
	 * 
	 * 
	 */
	@Test
	public void test09(){
		StringBuffer a = new StringBuffer("hello world ");
		a.reverse();
		System.out.println(a);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
