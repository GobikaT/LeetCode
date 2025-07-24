class Solution {
    public int[] searchRange(int[] nums, int target) {
        int a[]={-1,-1};
        int flag=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target && flag!=1){
                a[0]=i;
                flag=1;
            }
            else if(nums[i]==target){
                a[1]=i;
            }
        }
        return a;
    }
}