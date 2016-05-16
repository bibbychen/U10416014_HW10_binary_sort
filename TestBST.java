public class TestBST {
	public static void main(String[] args) {
		
		// Create a BST
    
		Integer[] numbers = {3,5,7,8,2,4,1,6};
		System.out.print("Sort the sequence of the numbers with binary sort : ");
			for(int i = 0 ; i < numbers.length ; i++){
				System.out.print(numbers[i] + " ");
			}
	
		BST<Integer> intTree = new BST<>(numbers); 
		System.out.print("\nInorder (sorted): ");
		intTree.inorder();
		System.out.print("\nPostorder: ");
		intTree.postorder();
		System.out.print("\nPreorder: ");
		intTree.preorder();
	}
}