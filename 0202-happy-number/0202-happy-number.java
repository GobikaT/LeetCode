class Solution {
    public boolean isHappy(int n) {
        int m=remain(n);
        if(m==1){
            return true;
        }
        else{
            return false;
        }
    }
    public int remain(int n){
        if(n==1){
            return 1;
        }
        if(n==4){
            return 4;
        }
        int sum=0;
        while(n!=0){
            int re=n%10;
            sum+=re*re;
            n=n/10;
        }
        return remain(sum);
    }
   
}