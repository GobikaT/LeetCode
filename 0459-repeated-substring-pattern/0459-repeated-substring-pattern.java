class Solution {
    public boolean repeatedSubstringPattern(String s) {
        String x=s+s;
        String d=x.substring(1,x.length()-1);
        return d.contains(s);
       
    }
}