class Solution {
    public boolean checkRecord(String s) {
        int ab=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='A'){
                ab++;
                if(ab>1){
                    return false;
                }
            }
            if(c=='L'){
                if(i+2 < s.length() && s.charAt(i+1) == 'L'&& s.charAt(i+2)=='L'){
                    return false;
                }
            }
        }
        return true;
    }
}