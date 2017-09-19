package com.yifan.tree;

public class Maximum_Binary_Tree {
	public static void main(String[] args) {
		int [] arr={3,2,1,6,0,5};
		TreeNode t = constructMaximumBinaryTree(arr);
		//输出二叉树
		putTree(t);
	}
	//输出二叉树
	
	
	
    private static void putTree(TreeNode t) {
		if(t==null){
			return;
		}else {
			System.out.print('[');
			
			putTree(t.left);
			System.out.print(t.val);
			putTree(t.right);
			
			System.out.print(']');
		}
		
		
	}

	public static TreeNode constructMaximumBinaryTree(int[] nums) {
    	
    	if(nums.length==0){
    		return null;
    		
    	}
    	return subBinaryTree(nums,0,nums.length-1);
        
		
    }

	private static TreeNode subBinaryTree(int[] nums, int start,int end) {
		if(start>end) return null;
		int max=Integer.MIN_VALUE;
		int index=start;
		for(int i=start;i<=end;i++){
			if(max<nums[i]){
				max=nums[i];
				index=i;
			}
		}
		TreeNode root=new TreeNode(max);
		root.left=subBinaryTree(nums, start, index-1);//这里的的区间一定是基于参数所给
		root.right=subBinaryTree(nums, index+1, end);
		return root;
        
	}
}
