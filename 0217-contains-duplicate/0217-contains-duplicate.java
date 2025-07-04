class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> seen= new HashSet<Integer>();
        for(int i:nums){
            if(!seen.add(i)){
                return true;
            }
        }
        return false;
    }
}