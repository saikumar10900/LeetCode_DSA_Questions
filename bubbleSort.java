import java.util.*;
public class Main
{
	public static void main(String[] args) {
		int[] arr = {5, 4, 3, 1, 2};
		bubbleSort(arr);
		System.out.println(Arrays.toString(arr));
	}
	static void bubbleSort(int[] arr){
	    boolean isSwapped;
	    for (int i = 0; i < arr.length; i++){
	        isSwapped = false;
	        for(int j = 1; j < arr.length - i; j++){
	            if(arr[j] < arr[j - 1]){
	                swap(arr, j - 1, j);
	                isSwapped = true;
	            }
	        }
	        if(!isSwapped){
	            break;
	        }
	    } 
	}
	static void swap(int[] arr, int first, int second){
	    int t = arr[first];
	    arr[first] = arr[second];
	    arr[second] = t;
	}
}