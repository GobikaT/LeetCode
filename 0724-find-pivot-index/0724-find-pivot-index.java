class Solution {
    public int pivotIndex(int[] nums) {
        if(nums.length<1){
            return -1;
        }
        int a=-1;
        for(int i=0;i<nums.length;i++){
            int r1=front(nums,i);
            int r2=back(nums,i,nums.length);
            if(r1==r2){
                 a=i;
                break;
            }
        }
        if(a!=-1){
            return a;
        }
        else{
            return -1;
        }
        
    }
    public int front(int [] nums,int n){
        int total=0;
        for(int i=0;i<n;i++){
            total+=nums[i];
        }
        return total;
    }
    public int back(int[] nums,int i,int n){
        int sum=0;
        for(int j=i+1;j<n;j++){
            sum+=nums[j];
        }
        return sum;
    }
}