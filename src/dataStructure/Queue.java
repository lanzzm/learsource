package dataStructure;

/**
 * 
 * 
 * 
 * ջ�ǡ�����ȳ�����LIFO��Last In First Out�������ݽṹ����֮�෴�������ǡ��Ƚ��ȳ�����FIFO��First In First Out�������ݽṹ
 * 
 *
 */



public class Queue {
    
    private int [] queArray;
    private int maxSize;
    public int front;   //�洢��ͷԪ�ص��±�
    public int rear;    //�洢��βԪ�ص��±�
    private int length; //���г���
   
    //���췽������ʼ������
    public Queue(int maxSize){
           this.maxSize = maxSize;
           queArray = new int [maxSize];
           front = 0;
           rear = -1;
           length = 0;
    }
   
    //����
    public void insert(int elem) throws Exception{
           if(isFull()){
                  throw new Exception("�������������ܽ��в��������");
           }
           //�����βָ���ѵ��������ĩ�ˣ����뵽����ĵ�һ��λ��
           if(rear == maxSize-1){
                  rear = -1;
           }
           queArray[++rear] = elem;
           length++;
    }
   
    //�Ƴ�
    public int remove() throws Exception{
           if(isEmpty()){
                  throw new Exception("����Ϊ�գ����ܽ����Ƴ�������");
           }
           int elem = queArray[front++];
           //�����ͷָ���ѵ�������ĩ�ˣ����Ƶ������һ��λ��
           if(front == maxSize){
                  front = 0;
           }
           length--;
           return elem;
    }
   
    //�鿴��ͷԪ��
    public int peek() throws Exception{
           if(isEmpty()){
                  throw new Exception("������û��Ԫ�أ�");
           }
           return queArray[front];
    }
   
    //��ȡ���г���
    public int size(){
           return length;
    }
   
    //�п�
    public boolean isEmpty(){
           return (length == 0);
    }
    
    //����
    public boolean isFull(){
           return (length == maxSize);
    }
    
    
}
