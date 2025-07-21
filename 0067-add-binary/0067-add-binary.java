class Solution {
    public String addBinary(String a, String b) {
        StringBuilder sb= new StringBuilder();
        int x=a.length()-1;
        int y=b.length()-1;
        int carry=0;
        int max=Math.max(x,y);
        while(x>=0||y>=0||carry==1){
            if(x>=0){
                carry+=a.charAt(x--)-'0';
            }
            if(y>=0){
                carry+=b.charAt(y--)-'0';
            }
            sb.append(carry%2);
            carry=carry/2;
        }
        return sb.reverse().toString();
    }
}