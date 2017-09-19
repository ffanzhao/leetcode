package com.yifan.code;

public class QuickSort {

	public static void main(String[] args) {
		int []a={1,4,3,2,88,99,7,3};
		sort(a);
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
	}
	public static void sort(int[] arr){
		if(arr==null||arr.length==0){
			return;
		}
		quickSort(arr,0,arr.length-1);
	}
	public static void quickSort(int[] arr, int left, int right) {
		if(left>=right){
			return;//作为递归的终止条件
		}
		//首先要求子递归的边界
		int pivotPos=partiton(arr,left,right);
		quickSort(arr, left, pivotPos-1);
		quickSort(arr, pivotPos+1, right);
		
	}
	//进行一次递归移动
	public static int partiton(int[] arr, int left, int right) {
		int pivotKey=arr[left];//作为这次移动的基准 值
		int pivotepointer=left;
		//以后的left<right是不是可以用=
		while(left<right){
			while(left<right&&arr[right]>=pivotKey){
				right--;
			}
			while(left<right&&arr[left]<=pivotKey){
				left++;
			}
			swap(arr, left, right);
		}
		swap(arr,pivotepointer,left);//把大的换在右边，小的换在左边
		return left;
	}
	public static void swap(int[] arr, int left, int right) {
		int temp=arr[left];
		arr[left]=arr[right];
		arr[right]=temp;
	}
	

}
