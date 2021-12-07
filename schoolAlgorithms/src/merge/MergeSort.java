package merge;

import java.util.Arrays;

public class MergeSort {

	public static int[] sort(int[] arr) {
		
		if(arr.length == 1) {
			return arr;
		}
		
		int middle = arr.length /2;
		
		int[] leftSide = new int[middle];
		int[] rightSide = new int[arr.length - middle];
		
		
		for (int i = 0; i < middle; i++) {
			leftSide[i] = arr[i];
		}
		for (int i = 0; i < arr.length - middle; i++) {
			rightSide[i] = arr[i + middle];
		}
		System.out.print(Arrays.toString(leftSide) + "   ");
		System.out.println(Arrays.toString(rightSide) + "\n");
		
		sort(leftSide);
		sort(rightSide);
		
		
		return merge(arr,leftSide,rightSide);
		
		
	}
	
	public static int[] merge(int[] arr,int[]left, int[] right) {
		
		int[] result = new int[left.length + right.length];
		int j = 0, i = 0, k = 0;
		
		while(i<left.length && j < right.length) {
			if(left[i] <= right[j]) {
				result[k] = left[i];
				i++;
			}else {
				result[k] = right[j];
				j++;
			}
			k++;
		}
		while (i < left.length) {
            result[k] = left[i];
            i++;
            k++;
		}
		
		while (j < right.length) {
            result[k] = right[j];
            j++;
            k++;
		}
	
		System.out.println(Arrays.toString(result));
			
			for (int n = 0; n < result.length; n++) {
				arr[n] = result[n];
			}
			
			return arr;
	}
}
