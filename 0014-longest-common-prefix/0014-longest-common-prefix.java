class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String s="";
        int n=strs.length;
        String first=strs[0];
        String last=strs[n-1];
        int min=(first.length()>last.length())?last.length():first.length();
        for(int i=0;i<min;i++){
            if(first.charAt(i)!=last.charAt(i)){
                break;
            }
            s+=first.charAt(i);

        }
        return s;
    }
}