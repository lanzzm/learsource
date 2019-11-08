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

import java.lang.Character.UnicodeBlock;
import java.util.Locale;
import java.util.Objects;

import org.junit.Test;

/**
 * @author lanzm
 *
 */
public class String01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

//		String a = new String ("");
//		String b = "";
//		String c= "";
//		System.out.println(a==b);
//		System.out.println(a==c);
//		System.out.println(c==b);
		
		

//		
//		System.out.println("掉尼玛".length());		
//		System.out.println("a".charAt(0));		
//		System.out.println("a".codePointAt(0));		
//		System.out.println("abc".codePointBefore((3)));		
//		System.out.println("a⑦".codePointCount(1, 2));		
//		System.out.println("a⑦".length());	
//		
//		System.out.println("123A".equalsIgnoreCase("123a"));
//		
//		
//		System.out.println("123".hashCode());
//		System.out.println("1234".hashCode());
//		System.out.println("1235".hashCode());
//		System.out.println("123".hashCode());
		
		System.out.println("13你好".hashCode());
		
		
		
//		System.out.println(System.identityHashCode("13你好"));
		
		
		char ss = 46896;
		
		System.out.println(ss);
		System.out.println("直接打印：€");
		System.out.println("通过UNICODE转码打印：\uB740");
//		
		
		String a= "\u1fffe";
		
		String b = "\u1fff\u0065";
		System.out.println(a.equals(b));
		
		System.out.println(0+a.charAt(0));
		System.out.println(0+a.charAt(1));
		System.out.println(0+'e');


		
		System.out.println(a);
		System.out.println(b);
		
		System.out.println("𐃶".length());
//		
//		char [] a = new char[3];
//		
//		"掉尼玛".getChars(1, 3, a, 0);	
//		System.out.println(a);
		
		
		
//		System.out.println("abcd". offsetByCodePoints(1, 5));		
		
		
		

		
		
		
	}
	
	/**
	 * 
	 *  codepoin 这个涉及到编码只是比较多
	 *  
	 *   如果char在给定索引处指定的值在高代理范围内，
	 *   则后续索引小于此值的长度String
	 *   ，并且 char在后续索引处的值在低代理范围内，
	 *   则与此对应的补充代码点返回代理对。
	 *   否则，将char返回给定索引处的值。
	 *   
	 */
	@Test
	public void test01(){
		System.out.println("1".codePointAt(0));
		System.out.println(Character.isHighSurrogate('\uD811'));
		System.out.println(Character.isHighSurrogate('\uDC11'));
		System.out.println(Character.toCodePoint('\uD811','\uDC11'));
		System.out.println("\uD811\uDC11".codePointAt(0));
		System.out.println("\uD811\uDC11".codePointAt(1));
		
		System.out.println("\uD811\uDC11");
		
	}
	

	
	/**
	 * contentEquals
	 * 这个功能比equals 强 比较本身也包含equals 还能比较CharSequence 的
	 * 
	 * 
	 */
	@Test
	public void test02(){
		StringBuffer a = new StringBuffer("3821");
		System.out.println("3821".contentEquals(a));
		
	}
	
	/**
	 * compareTo 比较  
	 * 比较第一个的 unicode码
	 * 如果相同 比较第二个
	 * 如果都相同 但是长度不同 返回长度
	 * 实现Comparable接口，重写compareTo方法，
	 * 
	 */
	@Test
	public void test03(){
		//前-后
	    String str1 = "abc";
	    String str2 = "c";
	    System.out.println("1:"+str1.compareTo(str2));
	    
	    //前-后
	    String str3 = "abc";
	    String str4 = "ac";
	    System.out.println("2:"+str3.compareTo(str4));

	    // 这个是位数
        String str5 = "ljj";
        String str6 = "ljjLovexql";
        System.out.println("3:"+str5.compareTo(str6));
	    
        // 
        String str7 = "\uabcd"; //43981
        String str8 = "\uacde";	//44254
        System.out.println("4:"+str7.compareToIgnoreCase(str8));

	}
	
	/**
	 * hashCode 算法
	 * 第一次运行 ,hash为0
	 * 以后取值就可以拿到hash
	 * 数学上 是 s[0]*31^(n-1) + s[1]*31^(n-2) + ... + s[n-1]
	 * 
	 */
	@Test
	public void test04(){
		String a = "13你好";
		System.out.println("1:"+a.hashCode());
        char val[] =  {'1','3','你','好'};
        int h=0;
        for (int i = 0; i < 4; i++) {
            h = 31 * h + val[i];
        }
		System.out.println("2:"+h);
		
		System.out.println("3:"+Objects.hashCode(a));
		
		
		
		
	}
	
	/**
	 * 获取内部char[] value 的副本
	 * 
	 * 
	 */
	@Test
	public void test05(){
		String a= "nananrn男人ktV";
		char [] b = a.toCharArray();
		for(char c:b){
			System.out.println(c+":"+(c+0));
			//判断是否是中文
		}
		
	}	
	
	private boolean isChinese(char c) {
	    Character.UnicodeBlock ub = Character.UnicodeBlock.of(c);
	    if (ub == Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS
	            || ub == Character.UnicodeBlock.CJK_COMPATIBILITY_IDEOGRAPHS
	            || ub == Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_A
	            || ub == Character.UnicodeBlock.GENERAL_PUNCTUATION
	            || ub == Character.UnicodeBlock.CJK_SYMBOLS_AND_PUNCTUATION
	            || ub == Character.UnicodeBlock.HALFWIDTH_AND_FULLWIDTH_FORMS) {
	        return true;
	    }
	    return false;
	}
	
	/**
	 * startsWith  可以带两个参数 第二个参数是便宜量
	 * 
	 * endwith 其实就是用start with 实现的
	 */
	
	
	@Test
	public void test06(){
		String a = "hello";
		String b = "hello world";
		String c = "world";
		System.out.println(b.startsWith(a, 0));
		System.out.println(b.endsWith(c));
		//等价上面 ,多了判断边界, 
		System.out.println(b.startsWith(c, b.length()-c.length()));
		
	}
	
	
	/**
	 * concat 和 +  Stringbufder性能对比
	 * concat 性能好 因为他只能连接字符串，而+功能更丰富
	 * 可见 Stringbuffer连接性能秒杀String 最快能百倍
	 * 
	 */
	@Test
	public void test07(){
		//String +
		String a= new String("123");
		long begin;
		long end;
		begin = System.currentTimeMillis();
		for(int i=0;i<50000;i++){
			a = a+"nihao";
		}
		end = System.currentTimeMillis();
		System.out.println("1:"+(end-begin));
		
		// String concat
		a= new String("123");
		begin = System.currentTimeMillis();
		for(int i=0;i<50000;i++){
//			a = a.concat("nihao");
			a = a+"nihao";
		}
		end = System.currentTimeMillis();		
		System.out.println("2:"+(end-begin));
		
		
		// Stringbuffer 未初始化
		StringBuffer sb = new StringBuffer("123");
		begin = System.currentTimeMillis();
		for(int i=0;i<5000000;i++){
			sb = sb.append("nihao");
		}
		end = System.currentTimeMillis();
		System.out.println("3:"+(end-begin));
		
		
		// Stringbuffer 初始化长度
		StringBuffer sb2 = new StringBuffer(26000000);
		sb2.append("123");
		begin = System.currentTimeMillis();
		for(int i=0;i<5000000;i++){
			sb2 = sb2.append("nihao");
		}
		end = System.currentTimeMillis();
		System.out.println("4:"+(end-begin));
		
	}
	
	/**
	 * repalce 和 replaceAll区别 
	 * replace 可以替换字符 和字符串 但是不能使用正则表达式
	 * replaceAll 不能输入字符类型,可以使用正则表达式
	 * 替换可以链式替换
	 * 里面是使用 Pattern 这个类的方法 具体需要阅读这个源码才知道
	 */
	@Test
	public void test08(){
		String a = "hello world";
		System.out.println(a.replace("o", "oo"));
		System.out.println(a.replace('o', 'e'));
		System.out.println(a.replaceAll("o", "oo"));
	}
	
	
	/**
	 * split 可以给两个参数 
	 * 如果是单参数 后一个默认是给0 
	 * 负数 : 所有都分,不限制,如果是空串 也写出来
	 * 0 : 所有都分,不限制,如果最后是空串 不写出来
	 * 正整数 : 最多这么多组,如果不够 全塞在最后里面
	 * 这个源码比较复杂 以后看
	 * 
	 */
	@Test
	public void test09(){
		String a = "219-195-195159-1589-1616-15619-";
		String[] b = a.split("-");
		for(String c:b){
			System.out.println("1:"+c);
		}
		
		String[] c = a.split("-",-1);
		for(String d:c){
			System.out.println("2:"+d);
		}
		
		String[] d = a.split("-",2);
		for(String f:d){
			System.out.println("3:"+f);
		}		
	}
	
	
	/**
	 * join 用法
	 * join 是个静态方法
	 * 如果是null 则加null
	 * 
	 */
	@Test
	public void test10(){
		String aa = String.join("-", "388","156156","154165",null,"fuck"); 
		System.out.println(aa);
	}
	
	/**
	 * format 暂时不会用 
	 * 
	 */
	@Test
	public void test11(){
		
		System.out.println(Locale.getDefault());
		
	}
	
	/**
	 * 测试valueof各个功能
	 * 
	 *   1byte：8bit，一个bit代表一个1或者0，是计算机的基本单位。
         byte：1byte        short：2 byte       int：4byte          long：8byte
         float：4byte        double：8个byte
         char：2byte   
         
         byte 和short没有  调用的是    int的 他先转换为int 
         double 和float如果是整合数 会在后面+。0
              
	 */
	
	@Test
	public void test12(){
		
		byte a = 121;
		short b = 55;
		char c = 'a';
		int d = 1800;
		float e = 18f;
		long f = 180L;
		double g = 18d;
		boolean h = true;
		
		
		System.out.println(String.valueOf(a));
		System.out.println(String.valueOf(b));
		System.out.println(String.valueOf(c));
		System.out.println(String.valueOf(d));
		System.out.println(String.valueOf(e));
		System.out.println(String.valueOf(f));
		System.out.println(String.valueOf(g));
		System.out.println(String.valueOf(h));
		
	}
	
	
	/**
	 * String intern(); 这个以后看
	 * 
	 */
	@Test 
	public void test13(){
		
		
		
	}
	
	/**
	 * 前包后不包
	 */
	
	@Test 
	public void test14(){
		String a = "hello world";
		String b = a.substring(1, 3);
		System.out.println(b);
		
	}	
	
	
	
	

	
	
	

	
}

