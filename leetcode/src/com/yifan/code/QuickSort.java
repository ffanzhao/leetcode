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
			return;//��Ϊ�ݹ����ֹ����
		}
		//����Ҫ���ӵݹ�ı߽�
		int pivotPos=partiton(arr,left,right);
		quickSort(arr, left, pivotPos-1);
		quickSort(arr, pivotPos+1, right);
		
	}
	//����һ�εݹ��ƶ�
	public static int partiton(int[] arr, int left, int right) {
		int pivotKey=arr[left];//��Ϊ����ƶ��Ļ�׼ ֵ
		int pivotepointer=left;
		//�Ժ��left<right�ǲ��ǿ�����=
		while(left<right){
			while(left<right&&arr[right]>=pivotKey){
				right--;
			}
			while(left<right&&arr[left]<=pivotKey){
				left++;
			}
			swap(arr, left, right);
		}
		swap(arr,pivotepointer,left);//�Ѵ�Ļ����ұߣ�С�Ļ������
		return left;
	}
	public static void swap(int[] arr, int left, int right) {
		int temp=arr[left];
		arr[left]=arr[right];
		arr[right]=temp;
	}
	

}
