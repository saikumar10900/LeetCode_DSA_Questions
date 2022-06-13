
class InfiniteArray {
    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 9, 10, 90,
                100, 130, 140, 160, 170};
        int target = 10;
        System.out.println("Target found at " + getIndex(arr, target));
    }
    static int getIndex(int[] arr, int target){
        int start = 0, end = 1;
        while(target > arr[end]){
            int temp = start;
            end = end + (end - start + 1) * 2;
            start = temp;
        }
        return binarySearch(arr, target, start, end);
    }
    static int binarySearch(int[] ar, int tar, int start, int end){
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(tar > ar[mid]){
                start = mid + 1;
            }else if(tar < ar[mid]){
                end = mid - 1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}