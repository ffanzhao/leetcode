package com.yifan.arrays;

public class Teemo_Attacking {

	public static void main(String[] args) {

	}
	public static int findPoisonedDuration(int[] timeSeries, int duration) {
        if(timeSeries.length==1||timeSeries==null){
            return 0;
        }
        int count=0;
        for(int i=1;i<timeSeries.length;i++){
            if((timeSeries[i]-timeSeries[i-1])>=duration){
                count+=duration;
            }else{
                count+=(timeSeries[i]-timeSeries[i-1]);
            }
        }
        return  count+duration;
    }

}
