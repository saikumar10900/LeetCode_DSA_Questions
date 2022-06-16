// https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
class Solution {
    public List<Integer> findDisappearedNumbers(int[] arr) {
        List<Integer> li = new ArrayList<>();
        cyclicSort(arr);
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != i + 1){
                li.add(i + 1);
            }
        }
        return li;
    }
    void cyclicSort(int[] arr){
	    int i = 0;
	    while(i < arr.length){
	        int correctIndex = arr[i] - 1;
	        if(arr[i] != arr[correctIndex]){
	            swap(arr, i, correctIndex);
	        }else{
	            i++;
	        }
	    }
	}
	void swap(int[] arr, int first, int second){
	    int t = arr[first];
	    arr[first] = arr[second];
	    arr[second] = t;
	}
}