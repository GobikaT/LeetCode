class Solution {
    public boolean isPerfectSquare(int num) {
        if(num==1){
            return true;
        }
        if(num<1){
            return false;
        }
        for(int i=2;i<=num/i;i++){
            if(i*i == num){
                return true;
            }
        }
        return false;
    }
}