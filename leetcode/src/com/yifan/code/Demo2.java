package com.yifan.code;

public class Demo2 {

	public static void main(String[] args) {
		int[]a={1,2};
		int[]b={3,4};
		double i=findMedianSortedArrays(a, b);
		System.out.println(i);

	}
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
    	
    	int len1=nums1.length;
    	int len2=nums2.length;
    	int total=len1+len2;
    	if(total%2==0){
    		return (findkth(nums1,nums2,total/2)+findkth(nums1,nums2,total/2+1))/2.0;//����Ҫת���ɸ�����
    	}else {
			return findkth(nums1, nums2, total/2+1);
		}
     
    }
	public  static int findkth(int[] nums1, int[] nums2, int k) {
		int p=0,q=0;
		for(int i=0;i<k-1;i++){//����k�Σ��ҵ���k��Ԫ��
			if(p>=nums1.length && q<nums2.length){//��������Ҫ�ж��Ƿ�������鷶Χ���������ж�
				q++;
			}else if (p<=nums1.length&&q>nums2.length) {
				p++;
			}else if (nums1[p]>nums2[q]) {
				q++;
			}else {
				p++;
			}
		}
		//�������ж�����Ҫѡȡ�ĸ�λ�õ���
		if(p>=nums1.length){//
			return nums2[q];
		}else if (q>=nums2.length) {
			return nums1[p];
		}else {
			return Math.min(nums1[p], nums2[q]);
		}
		
	}

}
