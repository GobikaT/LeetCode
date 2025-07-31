class Solution {
    public int firstUniqChar(String s) {
        char c,d;
        if(s.length()<=1){
            return 0;
        }
        for(int i=0;i<s.length();i++){
            int flag=0;
             c=s.charAt(i);
            for(int j=0;j<s.length();j++){
                 d=s.charAt(j);
                if(c==d && i!=j){
                    flag=1;
                    break;
                }
            }
            if(flag!=1){
                return i;
            }
        }
        return -1;
    }
}