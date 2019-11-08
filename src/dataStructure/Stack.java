/**
$
file_name :Stack.java
git_config:
package_name:dataStructure
project_name:learnSource
time:上午10:42:29
todo:TODO
type_name:Stack
user:lzm
year:2019



 */
package dataStructure;

/**
 * 栈
 * 先进后出
 * 
 * 代码的时候记得 只需要记住顶端元素的位置
 * 顶端元素初始是-1 
 * 每次push都++
 * 每次pop都--
 * peek 看一眼 瞟一眼的意思
 * 
 *栈是“后进先出”（LIFO，Last In First Out）的数据结构，与之相反，队列是“先进先出”（FIFO，First In First Out）的数据结构
 */
public class Stack {
    private int size;                 //栈的大小
    private int top;                  //栈顶元素的下标
    private int [] stackArray;   //栈的容器
   
    //构造函数
    public Stack(int size){
           stackArray = new int [size];
           top = -1; //初始化栈的时候，栈内无元素，栈顶下标设为-1
           this.size = size;
    }
   
    //入栈，同时，栈顶元素的下标加一
    public void push(int elem){
           stackArray[++top] = elem; //插入栈顶
    }
   
    //出栈，删除栈顶元素，同时，栈顶元素的下标减一
    public int pop(){
           return stackArray[top--];
    }
   
    //查看栈顶元素，但不删除
    public int peek(){
           return stackArray[top];
    }
   
    //判空
    public boolean isEmpty(){
           return (top == -1);
    }
   
    //判满
    public boolean isFull(){
           return (top == size-1);
    }
   
}

