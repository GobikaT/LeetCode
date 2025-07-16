class Solution {
    public void reverseString(char[] s) {
        int n=s.length;
        for(int i=0;i<s.length;i++){
            if(i<=n-1-i){
            char temp=s[i];
            s[i]=s[n-1-i];
            s[n-1-i]=temp;
            }
        }
        System.out.println(s);
        
    }
}