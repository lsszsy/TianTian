package com.sulli.sort;
/**
 * 快速排序
 * @author lss
 *
 */
public class Sort {
	
	public static int[] qsort(int[] arr, int start, int end){
		int pivot = arr[start];
		int i = start;
		int j = end;
		while(i<j){
			while((i<j)&&(arr[j]>pivot)){
				j--;
			}
			while((i<j)&&(arr[i]<pivot)){
				i++;
			}
			if((arr[i]==arr[j])&&(i<j)){
				i++;
			}else{
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		if(i-1>start){
			arr = qsort(arr,start,i-1);
		}
		if(j+1<end){
			arr = qsort(arr,j+1,end);
		}
		return arr;
		 int s=1111;
	}
}
