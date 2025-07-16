import java.util.*;
class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> x=new Stack<>();
        for(String i:operations){
            if(i.equals("C")){
                x.pop();
            }
            else if(i.equals("D")){
                x.push(2*x.peek());
            }
            else if(i.equals("+")){
                int first=x.pop();
                int last=x.peek();
                x.push(first);
                x.push(first+last);
            }
            else{
                x.push(Integer.parseInt(i));
            }
        }
        int sum=0;
        while(!x.isEmpty()){
            sum+=x.pop();
        }
        return sum;
    }
}