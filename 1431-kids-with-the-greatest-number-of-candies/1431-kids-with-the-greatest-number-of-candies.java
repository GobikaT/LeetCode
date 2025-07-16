class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> x= new ArrayList<>();
        int max=0;
        for(int i:candies){
            if(i>max){
                max=i;
            }
        }
        for(int j:candies){
            if(j+extraCandies>=max){
                x.add(true);
            }
            else{
                x.add(false);
            }
        }
        return x;
    }
}