import java.util.*;
public class Main
{
	public static void main(String[] args) {
		int[][] arr = {
		    {10, 20, 30, 40},
		    {15, 25, 35, 45,}
		}; 
		int target = 25;
		System.out.println(Arrays.toString(searchIn2D(arr, target)));
	}
	static int[] searchIn2D(int[][] arr, int target){
	    int r = 0;
	    int c = arr.length - 1;
	    while(r < arr.length && c >= 0){
	        if(arr[r][c] == target){
	            return new int[]{r, c};
	        }else if(target < arr[r][c]){
	            c--;
	        }else{
	            r++;
	        }
	    }
	    return new int[]{-1, -1};
	}
}
