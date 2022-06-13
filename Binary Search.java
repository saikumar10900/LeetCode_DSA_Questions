class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {-18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22, 45, 89};
        int target = 22;
        System.out.println("Target found at " + binarySearch(arr, target));
    }
    static int binarySearch(int[] ar, int tar){
        int start = 0, end = ar.length - 1;
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