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
		
		
		
        char val[] =  {'1','3','你','好'};
        int h=0;
        for (int i = 0; i < 4; i++) {
            h = 31 * h + val[i];
        }
		System.out.println(h);

		
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
	
	
	
	
	
	
	
	
	
	
	
	
}

