package tree;

class DoublelyLinkedList{
	int key;
	DoublelyLinkedList left,right;
	public DoublelyLinkedList(int val) {
		key=val;
		left=right=null;
	}
}
public class TreeImplimentationUsingLinkedList {
	static int count=0;
	static int sum=0;
	public static void main(String[] args) {
		
		DoublelyLinkedList root=new DoublelyLinkedList(1);
		root.left=new DoublelyLinkedList(2);
		root.right=new DoublelyLinkedList(3);
		root.left.left=new DoublelyLinkedList(4);
		root.right.right=new DoublelyLinkedList(5);
		root.left.right=new DoublelyLinkedList(6);
		System.out.println("inorder:");
		inOrder(root);
		
		System.out.println();
		
		System.out.println("preorder:");
		preOrder(root);
		
		System.out.println();
		
		System.out.println("postorder");
		postOrder(root);
		
		System.out.println();
		
		System.out.println("height of tree is:");
		System.out.println(heightOfTree(root));
		
		System.out.println("Count no of nodes");
		System.out.println(countNoOfNOdes(root));
		
		System.out.println("print Leaf Node");
		leafNode(root);
		
		System.out.println();
		
		System.out.println("Sum of all node values:----");
		System.out.println(sumOfNodeValues(root));
		
	}
	private static int sumOfNodeValues(DoublelyLinkedList root) {
		
		if(root==null)
		{
			return 0;
		}
		sum=sum+root.key;
		sumOfNodeValues(root.left);
		sumOfNodeValues(root.right);
		return sum;
		
	}
	private static void leafNode(DoublelyLinkedList root) {
		if(root==null)
		{
			return;
		}
		if(root.left== null && root.right==null) {
			System.out.print(root.key+" ");
		}
		leafNode(root.left);
		leafNode(root.right);
	}
	private static int countNoOfNOdes(DoublelyLinkedList root) {
		
		if(root==null)
		{
			return 0;
		}
		count ++;
		countNoOfNOdes(root.left);
		countNoOfNOdes(root.right);
		return count;
	}
	private static void postOrder(DoublelyLinkedList root) {
		if(root==null)
			return ;
		postOrder(root.left);
		postOrder(root.right);
		System.out.print(root.key+" ");
		
	}
	public static void inOrder(DoublelyLinkedList root) {
		
		if(root==null)
		{
			return;
		}
		inOrder(root.left);
		System.out.print(root.key+" ");
		inOrder(root.right);
	}
	public static void preOrder(DoublelyLinkedList root) {
		
		if(root==null)
		{
			return ;
			
		}
		System.out.print(root.key+" ");
		preOrder(root.left);
		preOrder(root.right);
	}
	public static int heightOfTree(DoublelyLinkedList root)
	{
		if(root==null)
			return 0;
		else
		{
			return Math.max(heightOfTree(root.left),heightOfTree(root.right))+1;
		}
	}

}
