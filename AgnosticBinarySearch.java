
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		int[] arr = {5, 4, 3, 2, 1};
		int target = 4;
		int index = agnosticBS(arr, target);
		System.out.println(index);
	}
	static int agnosticBS(int[] arr, int target){
	    int start = 0;
	    int end = arr.length - 1;
	    boolean isArrAsc = arr[start] < arr[end];
	    while(start <= end){
	        int mid = start + (end - start) / 2;
	        if(arr[mid] == target){
	            return mid;
	        }
	        if(isArrAsc){
	            if(target < arr[mid]){
	                end = mid - 1;
	            }else{
	                start = mid + 1;
	            }
	        }else{
	            if(target > arr[mid]){
	                end = mid - 1;
	            }else{
	                start = mid + 1;
	            }
	        }
	    }return -1;
	}
}
