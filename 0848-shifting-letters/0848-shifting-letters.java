class Solution {
    public String shiftingLetters(String s, int[] shifts) {
        
        for(int i=shifts.length-2;i>=0;i--){
            shifts[i]=(shifts[i]+shifts[i+1])%26;
        }
        String a="";
        for(int i=0;i<s.length();i++){
                char c=s.charAt(i);
                char k=(char)('a'+(c-'a'+shifts[i])%26);
                a+=k;
            }
             return a;
        }
       
    }
