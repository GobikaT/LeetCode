class Solution {
        public boolean halvesAreAlike(String s) {
        int n=s.length();
        String a=s.substring(0,n/2);
        String b=s.substring(n/2,n);
        int w=0,count=0;
       for(int i=0;i<a.length();i++){
           char c=a.charAt(i);
           if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U'){
               count++;
           }
       }
      for(int i=0;i<b.length();i++){
           char q=b.charAt(i);
           if(q=='a'||q=='e'||q=='i'||q=='o'||q=='u'||q=='A'||q=='E'||q=='I'||q=='O'||q=='U'){
               w++;
           }
       }
       return count==w;
        
    }
}