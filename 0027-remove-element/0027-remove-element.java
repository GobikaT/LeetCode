class Solution {
    public int removeElement(int[] nums, int val) {
        int count=0;
        int c=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                nums[c++]=nums[i];
                count++;
            }
        }
        return count;

    }
}