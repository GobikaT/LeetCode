import java.math.BigInteger;
class Solution {
    public int numTrees(int n) {
        if(n==0||n==1){
            return 1;
        }
            else{
                BigInteger a=fact(2*n);
                BigInteger b=fact(n).multiply(fact(n+1));
                BigInteger x=a.divide(b);
                return x.intValue();
            }
    }
    public BigInteger fact(int n){
        BigInteger sum=BigInteger.ONE;
        for(int i=2;i<=n;i++){
            sum=sum.multiply(BigInteger.valueOf(i));
        }
        return sum;
    }
}