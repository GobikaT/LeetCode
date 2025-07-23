class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int arr[]=new int[m+n];
        int c=0;
        if(n!=0){
        for(int i=0;i<nums1.length;i++){
            if(nums1[i]!=0){
                nums1[c++]=nums1[i];
            }
        }
        for(int i=0;i<nums2.length;i++){
             if(nums2[i]!=0){
                nums1[c++]=nums2[i];
            }
        }
        Arrays.sort(nums1);
        }
    }
}