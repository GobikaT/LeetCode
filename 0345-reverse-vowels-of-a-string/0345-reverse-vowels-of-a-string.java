class Solution {
    public String reverseVowels(String s) {
        Stack<Character> x = new Stack<>();
        String emp="";
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='A'||c=='E'||c=='I'||c=='O'||c=='U'||c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
                 x.push(c);
            }
        }
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='A'||c=='E'||c=='I'||c=='O'||c=='U'||c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
                 c=x.pop();
            }
            emp+=c;
            
        }
        return emp;
    }
}