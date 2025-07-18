class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int a=0;
        int l=nums.length;
        if(nums[l-1]==l){
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=i){
                a=i;
                break;
            }
        }
        }
        else{
            a=l;
        }
        return a;
    }
}