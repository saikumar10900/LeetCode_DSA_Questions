// https://leetcode.com/problems/find-the-duplicate-number/

import java.util.*;
class Solution {
    public int findDuplicate(int[] arr) {
	    int i = 0;
	    while(i < arr.length){
            if(arr[i] != i + 1){
                int correctIndex = arr[i] - 1;
                if(arr[i] != arr[correctIndex]){
                    swap(arr, i, correctIndex);
                }else{
                    return arr[i];
                }
            }else{
                i++;
            }
        }
        return -1;
	        
	}
	void swap(int[] arr, int first, int second){
	    int t = arr[first];
	    arr[first] = arr[second];
	    arr[second] = t;
	}
    
}