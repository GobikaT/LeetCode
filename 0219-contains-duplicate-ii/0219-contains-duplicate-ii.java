class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> x=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(x.contains(nums[i])){
                return true;
            }
            x.add(nums[i]);
            if(x.size()>k){
                x.remove(nums[i-k]);
            }
        }
          return false;
    }
}