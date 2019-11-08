package dataStructure;

/**
 * ��������
 * ����������ŵ㣺����Ч�ʸ�
 * ���������ȱ�㣺ɾ���Ͳ���������С�̶�
 * 
 * ���ַ�
 * 
 * 
 * 
 * 
 */

public class Array02 {
	private int[] intArray;
	private int length = 0; // ����Ԫ�ظ���
 
	// ���췽��������������󳤶�
	public Array02(int max) {
		intArray = new int[max];
	}
 
	// �ö��ֲ��ҷ���λĳ��Ԫ�أ�������ڷ������±꣬�������򷵻�-1
	public int find(int target) {
		int lowerBound = 0; // ��������СԪ�ص�С��
		int upperBound = length - 1; // ���������Ԫ�ص��±�
		int curIn; // ��ǰ���Ԫ�ص��±�
 
		if (upperBound < 0) { // �������Ϊ�գ�ֱ�ӷ���-1
			return -1;
		}
 
		while (true) {
			curIn = (lowerBound + upperBound) / 2;
 
			if (target == intArray[curIn]) {
				return curIn;
			} else if (curIn == lowerBound) { // �ڵ�ǰ�±��������ε���С�±��غ�ʱ��������������ֻ����1����2��Ԫ��
				// ��Ȼ�ߵ��÷�֧��֤����һ��if��֧�����㣬��Ŀ��Ԫ�ز����ڵ�λԪ��
				if (target == intArray[upperBound]) { // ���ڸ�λԪ�أ�����
					return upperBound;
				} else { // ��λԪ��Ҳ������Ŀ��Ԫ�أ�֤��������û�и�Ԫ�أ���������
					return -1;
				}
			} else {// �������е�Ԫ���������������ҵ�ǰԪ�ز�����Ŀ��Ԫ��
				if (intArray[curIn] < target) {
					// �����ǰԪ��С��Ŀ��Ԫ�أ�����һ�������ε���С�±���Ϊ��ǰԪ�ص��±�
					lowerBound = curIn;
				} else {
					// �����ǰԪ�ش���Ŀ��Ԫ�أ�����һ�������ε�����±���Ϊ��ǰԪ�ص��±�
					upperBound = curIn;
				}
			}
		}
	}
 
	// ����
	public void insert(int elem) {
		int location = 0;
 
		// �ж�Ӧ����λ�õ��±�
		for (; location < length; location++) {
			if (intArray[location] > elem)
				break;
		}
		// System.out.println(location);
		// �������±�֮�������Ԫ�غ���һλ
		for (int i = length; i > location; i--) {
			intArray[i] = intArray[i - 1];
		}
 
		// ����Ԫ��
		intArray[location] = elem;
 
		length++;
	}
 
	// ɾ��ĳ��ָ����Ԫ��ֵ��ɾ���ɹ��򷵻�true�����򷵻�false
	public boolean delete(int target) {
		int index = -1;
		if ((index = find(target)) != -1) {
			for (int i = index; i < length - 1; i++) {
				// ɾ��Ԫ��֮�������Ԫ��ǰ��һλ
				intArray[i] = intArray[i + 1];
			}
			length--;
			return true;
		} else {
			return false;
		}
	}
 
	// �г�����Ԫ��
	public void display() {
		for (int i = 0; i < length; i++) {
			System.out.print(intArray[i] + "\t");
		}
		System.out.println();
	}
 
	public static void main(String[] args) {
		Array02 orderArray = new Array02(4);
 
		orderArray.insert(3);
		orderArray.insert(4);
		orderArray.insert(6);
		orderArray.insert(8);
 
		int i = orderArray.find(8);
		System.out.println("�ڶ����е�λ����" + i);
	}
}
