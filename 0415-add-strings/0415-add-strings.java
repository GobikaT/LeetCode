class Solution {
    public String addStrings(String num1, String num2) {
       StringBuilder sb=new StringBuilder();
       int i=num1.length()-1;
       int j=num2.length()-1;
       int c=0;
       while(i>=0||j>=0||c!=0){
        int digit1=(i>=0)?num1.charAt(i)-'0':0;
        int digit2=(j>=0)?num2.charAt(i)-'0':0;
        int sum = digit1+digit2+c;
        sb.append(sum%10);
        c=c/10;
       }
       return sb.reverse().toString();
    }
}