class Solution {
    public String reverseWords(String s) {
        String arr[]=s.trim().split("\\s+");
        StringBuilder x=new StringBuilder();
        for(int i=arr.length-1;i>=0;i--){
            x.append(arr[i]);
            if(i!=0){
                x.append(" ");
            }
        }
        return x.toString();
    }
}