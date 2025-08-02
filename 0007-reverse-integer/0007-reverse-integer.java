class Solution {
    public int reverse(int x) {
        int m=x;
        int flag=0;
        if(m<0){
            flag=1;
        }
        long sum=0;
        while(x>0||x<0){
            int rem=x%10;
            sum=sum*10+rem;
            if(sum<Integer.MIN_VALUE||sum>Integer.MAX_VALUE){
                return 0;
            }
            x=x/10;
        }
        return (int) sum;
    }
}