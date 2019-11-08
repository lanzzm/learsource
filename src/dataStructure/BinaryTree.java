/**
$
file_name :BinaryTree.java
git_config:
package_name:dataStructure
project_name:learnSource
time:����3:52:32
todo:TODO
type_name:BinaryTree
user:lzm
year:2019



 */
package dataStructure;

/**
 * @author lanzm
 *
 */
import java.util.ArrayList;
import java.util.List;

//�����������ķ�װ��
public class BinaryTree {
	private Node root; // ���ڵ�

	public BinaryTree() {
		root = null;
	}

	// ���ؼ��ֲ��ҽڵ�
	public Node find(int key) {
		Node cur = root; // �Ӹ��ڵ㿪ʼ����

		if (cur == null) { // �����Ϊ�գ�ֱ�ӷ���null
			return null;
		}

		while (cur.age != key) {
			if (key < cur.age) {
				cur = cur.leftChild; // ����ؼ��ֱȵ�ǰ�ڵ�С��ת�����ӽڵ�
			} else {
				cur = cur.rightChild; // ����ؼ��ֱȵ�ǰ�ڵ��ת�����ӽڵ�
			}

			if (cur == null) { // û���ҵ��������������
				return null;
			}
		}
		return cur;
	}

	// �����½ڵ�
	public void insert(Node node) {
		if (root == null) {
			root = node; // �����Ϊ�գ����²���Ľڵ�Ϊ���ڵ�
		} else {
			Node cur = root;

			while (true) {
				if (node.age < cur.age) {
					if (cur.leftChild == null) { // �ҵ���Ҫ����ڵ�ĸ��ڵ�
						cur.leftChild = node;
						return;
					}
					cur = cur.leftChild;
				} else {
					if (cur.rightChild == null) { // �ҵ���Ҫ����ڵ�ĸ��ڵ�
						cur.rightChild = node;
						return;
					}
					cur = cur.rightChild;
				}
			}
		}
	}

	// ɾ��ָ���ڵ�
	public boolean delete(Node node) {
		if (root == null) {
			return false; // ���Ϊ������ֱ�ӷ���false
		}

		boolean isLeftChild = true; // ��¼Ŀ��ڵ��Ƿ�Ϊ���ڵ�����ӽڵ�
		Node cur = root; // Ҫɾ���Ľڵ�
		Node parent = null; // Ҫɾ���ڵ�ĸ��ڵ�

		while (cur.age != node.age) { // ȷ��Ҫɾ���ڵ�����ĸ��ڵ�
			parent = cur;
			if (node.age < cur.age) { // Ŀ��ڵ�С�ڵ�ǰ�ڵ㣬��ת���ӽڵ�
				cur = cur.leftChild;
			} else {// Ŀ��ڵ���ڵ�ǰ�ڵ㣬��ת���ӽڵ�
				isLeftChild = false;
				cur = cur.rightChild;
			}
			if (cur == null) {
				return false; // û���ҵ�Ҫɾ���Ľڵ�
			}
		}

		if (cur.leftChild == null && cur.rightChild == null) { // Ŀ��ڵ�ΪҶ�ӽڵ㣨���ӽڵ㣩
			if (cur == root) { // Ҫɾ����Ϊ���ڵ�
				root = null;
			} else if (isLeftChild) {
				// Ҫɾ���Ĳ��Ǹ��ڵ㣬��ýڵ�϶��и��ڵ㣬�ýڵ�ɾ������Ҫ�����ڵ�ָ�����������ÿ�
				parent.leftChild = null;
			} else {
				parent.rightChild = null;
			}
		} else if (cur.leftChild == null) { // ֻ��һ�����ӽڵ�
			if (cur == root) {
				root = cur.rightChild;
			} else if (isLeftChild) {
				parent.leftChild = cur.rightChild;
			} else {
				parent.rightChild = cur.rightChild;
			}
		} else if (cur.rightChild == null) { // ֻ��һ�����ӽڵ�
			if (cur == root) {
				root = cur.leftChild;
			} else if (isLeftChild) {
				parent.leftChild = cur.leftChild;
			} else {
				parent.rightChild = cur.leftChild;
			}
		} else { // �������ӽڵ�
					// ��һ��Ҫ�ҵ���ɾ���ڵ�ĺ�̽ڵ�
			Node successor = cur.rightChild;
			Node successorParent = null;
			while (successor.leftChild != null) {
				successorParent = successor;
				successor = successor.leftChild;
			}
			// ��ɾ���ڵ�����ӽڵ�������ĺ�̣�֤���ú�������ӽڵ㣬���Ժ�̽ڵ�Ϊ�����������Ƽ���
			if (successorParent == null) {
				if (cur == root) { // Ҫɾ����Ϊ���ڵ㣬�򽫺������Ϊ�����Ҹ������ӽڵ�����Ϊ��ɾ���ڵ�������ӽڵ�
					root = successor;
					root.leftChild = cur.leftChild;
				} else if (isLeftChild) {
					parent.leftChild = successor;
					successor.leftChild = cur.leftChild;
				} else {
					parent.rightChild = successor;
					successor.leftChild = cur.leftChild;
				}
			} else { // ��ɾ���ڵ�ĺ�̲����������ӽڵ�
				successorParent.leftChild = successor.rightChild;
				successor.rightChild = cur.rightChild;
				if (cur == root) {
					root = successor;
					root.leftChild = cur.leftChild;
				} else if (isLeftChild) {
					parent.leftChild = successor;
					successor.leftChild = cur.leftChild;
				} else {
					parent.rightChild = successor;
					successor.leftChild = cur.leftChild;
				}
			}
		}

		return true;
	}

	public static final int PREORDER = 1; // ǰ�����
	public static final int INORDER = 2; // �������
	public static final int POSTORDER = 3; // �������

	// ����
	public void traverse(int type) {
		switch (type) {
		case 1:
			System.out.print("ǰ�������\t");
			preorder(root);
			System.out.println();
			break;
		case 2:
			System.out.print("���������\t");
			inorder(root);
			System.out.println();
			break;
		case 3:
			System.out.print("���������\t");
			postorder(root);
			System.out.println();
			break;
		}
	}

	// ǰ�����
	public void preorder(Node currentRoot) {
		if (currentRoot != null) {
			System.out.print(currentRoot.age + "\t");
			preorder(currentRoot.leftChild);
			preorder(currentRoot.rightChild);
		}
	}

	// ��������������ֱ��������˵�����˼��
	public void inorder(Node currentRoot) {
		if (currentRoot != null) {
			inorder(currentRoot.leftChild); // �ȶԵ�ǰ�ڵ���������Խ����������
			System.out.print(currentRoot.age + "\t"); // Ȼ����ʵ�ǰ�ڵ�
			inorder(currentRoot.rightChild); // ���Ե�ǰ�ڵ���������Խ����������
		}
	}

	// �������
	public void postorder(Node currentRoot) {
		if (currentRoot != null) {
			postorder(currentRoot.leftChild);
			postorder(currentRoot.rightChild);
			System.out.print(currentRoot.age + "\t");
		}
	}

	// ˽�з������õ�����������ȡ���������������������ȣ������������ֵ
	private int getDepth(Node currentNode, int initDeep) {
		int deep = initDeep; // ��ǰ�ڵ��ѵ�������
		int leftDeep = initDeep;
		int rightDeep = initDeep;
		if (currentNode.leftChild != null) { // ���㵱ǰ�ڵ���������������
			leftDeep = getDepth(currentNode.leftChild, deep + 1);
		}
		if (currentNode.rightChild != null) { // ���㵱ǰ�ڵ���������������
			rightDeep = getDepth(currentNode.rightChild, deep + 1);
		}

		return Math.max(leftDeep, rightDeep);
	}

	// ��ȡ�������
	public int getTreeDepth() {
		if (root == null) {
			return 0;
		}
		return getDepth(root, 1);
	}

	// ���عؼ�ֵ���Ľڵ�
	public Node getMax() {
		if (isEmpty()) {
			return null;
		}
		Node cur = root;
		while (cur.rightChild != null) {
			cur = cur.rightChild;
		}
		return cur;
	}

	// ���عؼ�ֵ��С�Ľڵ�
	public Node getMin() {
		if (isEmpty()) {
			return null;
		}
		Node cur = root;
		while (cur.leftChild != null) {
			cur = cur.leftChild;
		}
		return cur;
	}

	// ��������ʽ��ӡ������
	public void displayTree() {
		int depth = getTreeDepth();
		ArrayList<Node> currentLayerNodes = new ArrayList<Node>();
		currentLayerNodes.add(root); // �洢�ò����нڵ�
		int layerIndex = 1;
		while (layerIndex <= depth) {
			int NodeBlankNum = (int) Math.pow(2, depth - layerIndex) - 1; // �ڽڵ�֮ǰ��֮��Ӧ�ô�ӡ������λ
			for (int i = 0; i < currentLayerNodes.size(); i++) {
				Node node = currentLayerNodes.get(i);
				printBlank(NodeBlankNum); // ��ӡ�ڵ�֮ǰ�Ŀ�λ

				if (node == null) {
					System.out.print("*\t"); // ����ýڵ�Ϊnull���ÿ�λ����
				} else {
					System.out.print("*  " + node.age + "\t"); // ��ӡ�ýڵ�
				}

				printBlank(NodeBlankNum); // ��ӡ�ڵ�֮��Ŀ�λ
				System.out.print("*\t"); // �����λ
			}
			System.out.println();
			layerIndex++;
			currentLayerNodes = getAllNodeOfThisLayer(currentLayerNodes); // ��ȡ��һ�����еĽڵ�
		}
	}

	// ��ȡָ���ڵ㼯�ϵ������ӽڵ�
	private ArrayList getAllNodeOfThisLayer(List parentNodes) {
		ArrayList list = new ArrayList<Node>();
		Node parentNode;
		for (int i = 0; i < parentNodes.size(); i++) {
			parentNode = (Node) parentNodes.get(i);
			if (parentNode != null) {
				if (parentNode.leftChild != null) { // ����ϲ�ĸ��ڵ�������ӽڵ㣬���뼯��
					list.add(parentNode.leftChild);
				} else {
					list.add(null); // ����ϲ�ĸ��ڵ㲻�������ӽڵ㣬��null���棬һ�����뼯��
				}
				if (parentNode.rightChild != null) {
					list.add(parentNode.rightChild);
				} else {
					list.add(null);
				}
			} else { // ����ϲ㸸�ڵ㲻���ڣ�������nullռλ�����������ӽڵ�
				list.add(null);
				list.add(null);
			}
		}
		return list;
	}

	// ��ӡָ�������Ŀ�λ
	private void printBlank(int num) {
		for (int i = 0; i < num; i++) {
			System.out.print("*\t");
		}
	}

	// �п�
	public boolean isEmpty() {
		return (root == null);
	}

	// �ж��Ƿ�ΪҶ�ӽڵ�
	public boolean isLeaf(Node node) {
		return (node.leftChild != null || node.rightChild != null);
	}

	// ��ȡ���ڵ�
	public Node getRoot() {
		return root;
	}

}
