package schoolAlgorithms;

import java.util.Arrays;

public class SelectionSort {

	public static void sort(int[] arr){
	    for(int i=0;i<arr.length;i++)
	    {
	        int min=i;
	        for(int j=i+1;j<arr.length;j++){
	            if(arr[j]<arr[min]){
	                min=j;
	            }
	        }
	        int temp=arr[min];
	        arr[min]=arr[i];
	        arr[i]=temp;
	        printArray(arr);
	    }
	}
	public static void printArray(int[] arr){
	    System.out.print(" ");
	    for(int i=0;i<arr.length;i++)
	    {
	        if(i==arr.length-1){
	            System.out.print(arr[i]);
	            
	        }
	        else{
	            System.out.print(arr[i]+ " ");
	        }
	    }
	    System.out.println(" ");
	}
}
