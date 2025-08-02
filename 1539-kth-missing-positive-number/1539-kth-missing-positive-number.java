class Solution {
    public int findKthPositive(int[] arr, int k) {
       int max=0;
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        int [] arr2=new int[max+k];
        int count=1;
        for(int j=0;j<max+k;j++){
            arr2[j]=count++;
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr2.length;j++){
                if(arr[i]==arr2[j]){
                    arr2[j]=0;
                }
            }
        }
        int c=0;
        for(int i=0;c<k;i++){
             if(arr2[i]==0){
                continue;
            }
            if(c==k-1){
                return arr2[i];
            }
           
            else{
                c++;
            }
        }
        return -1;
    }
}