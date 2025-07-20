class Solution {
    public boolean detectCapitalUse(String word) {
       int count=0;
       for(int i=0;i<word.length();i++){
        char c=word.charAt(i);
        if(Character.isUpperCase(c)){
            count++;
        }
       }
       if(word.length()==count||count==0){
        return true;
       }
       if(count==1 && Character.isUpperCase(word.charAt(0))){
        return true;
       }
       return false;
    }
    }
