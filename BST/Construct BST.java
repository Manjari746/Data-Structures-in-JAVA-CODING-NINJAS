public class Solution {

    /*	Binary Tree Node class 
 * 
 * 	class BinaryTreeNode<T> {
		T data;
		BinaryTreeNode<T> left;
		BinaryTreeNode<T> right;

		public BinaryTreeNode(T data) {
			this.data = data;
		}
	}
	*/

    public static BinaryTreeNode<Integer> SortedArrayToBST(int[] arr ,int n){
        return SortedArrayToBST(arr,0,n-1);
        }
    public static BinaryTreeNode<Integer>  SortedArrayToBST(int[] arr,int si,int ei){
       
        if(si>ei)
            return null;
            
        int mid=(ei+si)/2;
        BinaryTreeNode<Integer> root=new BinaryTreeNode<>(arr[mid]);
     
        root.left= SortedArrayToBST(arr,si,mid-1);
        root.right= SortedArrayToBST(arr,mid+1,ei);
        return root;


    }
}
