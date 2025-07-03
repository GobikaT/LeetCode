class Solution {
    public String longestPalindrome(String s) {
         int n=s.length();
        int max=1;
        int x=0;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                if(ispal(s,i,j)&&(j-i+1>max)){
                    x=i;
                    max=j-i+1;
                }
            }
        }
        return s.substring(x,x+max);
    }
    public static boolean ispal(String str,int start,int end){
        while(start<end){
            if(str.charAt(start)!=str.charAt(end)){
                return false;
            }
        start++;
        end--;
        }
        return true;
    }
}