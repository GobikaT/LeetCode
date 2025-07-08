class Solution {
    public boolean isValid(String s) {
        Stack<Character> x= new Stack<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='('||c=='{'||c=='['){
                x.push(c);
            }
            else{
                if(x.isEmpty()){
                    return false;
                }
                char top=x.pop();
                if((c==')'&&top!='(')||(c=='}'&& top!='{')||(c==']'&&top!='[')){
                    return false;
                }
            }
        }
        return x.isEmpty();
    }
}