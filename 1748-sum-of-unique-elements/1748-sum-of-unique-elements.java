class Solution {
    public int sumOfUnique(int[] nums) {
        
        int sum=0;
        int count;
        for(int i=0;i<nums.length;i++){
           count=0;
           for(int j=0;j<nums.length;j++){
            if(nums[i]==nums[j]){
                count++;
            }
           }
           if(count==1){
            sum+=nums[i];
           }
        }
        return sum;
    }
}