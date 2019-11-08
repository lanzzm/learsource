package dataStructure;

/**
 * ��������
 * ����������ŵ㣺����죬���֪���±꣬���Ժܿ�Ĵ�ȡ
 * ���������ȱ�㣺��������ɾ��������С�̶���
 * ���Ե�ʱ��˵һ���㷨���Ӷ�
 * 
 * 
 * 
 * 
 * ������һ�ֳ��������ݽṹ
 * ����һ���Ϊ�����������������
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */
public class Array01 {
    
    private String [] strArray;
    private int length = 0;       //����Ԫ�ظ���
          
    //���췽��������������󳤶�
    public Array01(int max){
           strArray = new String [max];
    }
   
    //��������Ƿ����ĳ��Ԫ�أ�������ڷ������±꣬�������򷵻�-1
    public int contains(String target){
           int index = -1;
           for(int i=0;i<length;i++){
                  if(strArray[i].equals(target)){
                         index = i;
                         break;
                  }
           }
           return index;
    }
   
    //����
    public void insert(String elem) {
           strArray[length] = elem;
           length++;
    }
   
    //ɾ��ĳ��ָ����Ԫ��ֵ��ɾ���ɹ��򷵻�true�����򷵻�false
    public boolean delete(String target){
           int index = -1;
           if((index = contains(target)) !=-1){
                  for(int i=index;i<length-1;i++){
                         //ɾ��Ԫ��֮�������Ԫ��ǰ��һλ
                         strArray[i] =strArray[i+1]; 
                  }
                  length--;
                  return true;
           }else{
                  return false;
           }
    }
   
    //�г�����Ԫ��
    public void display(){
           for(int i=0;i<length;i++){
                  System.out.print(strArray[i]+"\t");
           }
    }
   
}
