/**
$
file_name :Stack.java
git_config:
package_name:dataStructure
project_name:learnSource
time:����10:42:29
todo:TODO
type_name:Stack
user:lzm
year:2019



 */
package dataStructure;

/**
 * ջ
 * �Ƚ����
 * 
 * �����ʱ��ǵ� ֻ��Ҫ��ס����Ԫ�ص�λ��
 * ����Ԫ�س�ʼ��-1 
 * ÿ��push��++
 * ÿ��pop��--
 * peek ��һ�� �һ�۵���˼
 * 
 *ջ�ǡ�����ȳ�����LIFO��Last In First Out�������ݽṹ����֮�෴�������ǡ��Ƚ��ȳ�����FIFO��First In First Out�������ݽṹ
 */
public class Stack {
    private int size;                 //ջ�Ĵ�С
    private int top;                  //ջ��Ԫ�ص��±�
    private int [] stackArray;   //ջ������
   
    //���캯��
    public Stack(int size){
           stackArray = new int [size];
           top = -1; //��ʼ��ջ��ʱ��ջ����Ԫ�أ�ջ���±���Ϊ-1
           this.size = size;
    }
   
    //��ջ��ͬʱ��ջ��Ԫ�ص��±��һ
    public void push(int elem){
           stackArray[++top] = elem; //����ջ��
    }
   
    //��ջ��ɾ��ջ��Ԫ�أ�ͬʱ��ջ��Ԫ�ص��±��һ
    public int pop(){
           return stackArray[top--];
    }
   
    //�鿴ջ��Ԫ�أ�����ɾ��
    public int peek(){
           return stackArray[top];
    }
   
    //�п�
    public boolean isEmpty(){
           return (top == -1);
    }
   
    //����
    public boolean isFull(){
           return (top == size-1);
    }
   
}

