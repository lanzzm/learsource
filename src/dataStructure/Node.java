/**
$
file_name :Node.java
git_config:
package_name:dataStructure
project_name:learnSource
time:����3:56:00
todo:TODO
type_name:Node
user:lzm
year:2019



 */
package dataStructure;

/**
 * @author lanzm
 *
 */
//���ڵ�ķ�װ��
public class Node {
    int age;
    String name;
    Node leftChild;  //���ӽڵ������
    Node rightChild; //���ӽڵ������
   
    public Node(int age,String name){
           this.age = age;
           this.name = name;
    }
   
    //��ӡ�ýڵ����Ϣ
    public void displayNode(){
           System.out.println("name:"+name+",age:"+age);
    }
}

