/**
$
file_name :SomeBase.java
git_config:
package_name:learnSource
project_name:learnSource
time:����4:47:10
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
	 * �������ʱ��
	 * �÷����������Ƿ��ص�ǰ�ļ����ʱ�䣬
	 * ʱ��ı���ʽΪ��ǰ�����ʱ���GMTʱ��(��������ʱ��)1970��1��1��0ʱ0��0������ĺ�����
	 * 1��=1000����
	 */
	@Test
	public void test01(){
		
		long begin = System.currentTimeMillis();
		long end = System.currentTimeMillis();
		System.out.println("����:"+(begin-end));
		
	}
	/**
	 *	�Զ�װ�� �ᴫ��obj ����character  �������ƥ�� 
	 * 
	 */
	@Test
	public void test02(){
		char a = 'c';
		aa(a);
	}
	/**
	 * �����Ƿ��װ��
	 * @param a
	 */
	private void aa(Object a){
		boolean c = a instanceof Character;
		System.out.println(c);
	}
	/**
	 * �׼��ƥ��
	 * @param a
	 */
	private void aa(Character a){
		boolean c = a instanceof Character;
		System.out.println(c+"456");
	}
		
	
	@Test
	public void test04(){
		
		//���췽��������һ�����췽��
		this();
	}
	
	
	

	
	
	
	
	
	
	
	
}
