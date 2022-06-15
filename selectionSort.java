import java.util.*;
public class Main
{
	public static void main(String[] args) {
		int[] arr = {5, 4, 3, 1, 2};
		selectionSort(arr);
		System.out.println(Arrays.toString(arr));
	}
	static void selectionSort(int[] arr){
	    int startIndex = 0;
	    for (int i = 0; i < arr.length; i++){
	        int endIndex = arr.length - i - 1;
	        int maxValueIndex = getMaxIndex(arr, startIndex, endIndex);
	        swap(arr, maxValueIndex, endIndex);
	    } 
	}
	static int getMaxIndex(int[] arr, int startIndex, int endIndex){
	    int maxIndex = startIndex;
	    for(int i = startIndex; i <= endIndex; i++){
	        if(arr[i] > arr[maxIndex]){
	            maxIndex = i;
	        }
	    }
	    return maxIndex;
	}
	static void swap(int[] arr, int first, int second){
	    int t = arr[first];
	    arr[first] = arr[second];
	    arr[second] = t;
	}
}
