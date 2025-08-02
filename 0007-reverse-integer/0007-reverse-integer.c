int reverse(int x){
    int rem=0;
    long long sum=0;
while(x>0||x<0){
    rem=x%10;
    sum= (long long)sum*10 +rem;
     if (sum > INT_MAX || sum < INT_MIN) {
            return 0;
        }
    x=x/10;
}
return sum;
}