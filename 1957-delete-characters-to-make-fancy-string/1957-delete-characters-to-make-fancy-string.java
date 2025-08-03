class Solution {
    public String makeFancyString(String s) {
        int count=0;
        if(s.length()<2){
            return s;
        }
        String x="";
        for(int i=0;i<s.length()-1;i++){
            char c=s.charAt(i);
            if(c==s.charAt(i+1)){
                count++;
            }
            if(count<2){
                x+=c;
                continue;
            }
            else{
                count=0;
            }
            
                }
                 if(x.charAt(x.length()-1)==s.charAt(s.length()-1)){
                    return x;
                 }
                 else{
                    return x+s.charAt(s.length()-1);
                 }
            }
           
}
