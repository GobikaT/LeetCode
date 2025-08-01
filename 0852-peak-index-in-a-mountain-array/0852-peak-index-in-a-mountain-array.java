class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int max=0,a=0;
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
                a=i;
            }
        }
        return a;
    }
}