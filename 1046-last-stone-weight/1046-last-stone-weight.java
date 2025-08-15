class Solution {
    public int lastStoneWeight(int[] stones) {
        int n=stones.length;
        if(n<=1){
            return stones[n-1];
        }
        while(true){
            Arrays.sort(stones);
            if(stones[n-2]==0 || stones[n-1]==0){
                return stones[n-1];
            }
            stones[n-1]=stones[n-1] - stones[n-2];
            stones[n-2]=0;

        }
    }
}