/**
$
file_name :Object01.java
git_config:
package_name:learnSource
project_name:learnSource
time:����5:06:33
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
	 * objects ȫ�Ǿ�̬���� ����java��util�µ� ��Ҫ����
	 *  Ҫ���� �����ж��ǲ���null ��null���쳣
	 * 
	 */
	@Test
	public void test01(){
		Objects.requireNonNull(null, "reg");
		
	}
	
	
	/**
	 * equals ���ж������Ƿ�ͬһ������
	 * �ٵ��ö����equal�����ж��Ƿ���ͬ
	 * һ��null ���ط� ����null ������
	 * ��null�����̱ȽϺ� �Ժ�������ͺ���
	 */
	@Test
	public void test02(){
		System.out.println("1:"+Objects.equals(null, null));
		System.out.println("2:"+Objects.equals(null, 123));
		System.out.println("3:"+Objects.equals("282", new String("282")));
	}
	
	
	/**
	 * deepEquals �����ж����� 
	 *  Arrays.deepEquals0(a, b)
	 *   ���๦����equalsһ��
	 * 	��������ͨ��һֱ���� ��ȡ
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
	 * ��ʵ���ǵ���hashCode
	 * �㷨��һ��,hash����Զ���� 
	 * ûһ�����
	 * �����������ô��?���Ǹ����� �����hashcode����ô�����?
	 */
	
	@Test
	public void test04(){
		
		System.out.println(Objects.hashCode("1"));
		String a[] = new String[5];
		System.out.println(Objects.hash("1","2",1,5,8,9,a));
		
		
	}	
	
	/**
	 * ��һ���ã�ӦΪ���ܴ��ڻ�������������
	 * String.valueOf(o);
	 * �ڶ����ǵ���toStinrg
	 * ΪʲôҪ�����ظ� ��Ϊ��null�����
	 * 
	 */
	@Test
	public void test05(){
		char a = 'c';
		// ���null ���null�ַ���
		System.out.println(Objects.toString("0"));
		System.out.println(Objects.toString('a',"888888"));
		
	}


	
	
	
	
	
	
	
	
	
	
	
}

