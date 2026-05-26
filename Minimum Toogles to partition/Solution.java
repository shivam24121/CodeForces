class Solution {
    int minToggle(int[] arr) {
        
        int n=arr.length;
        
        int z=0;
        int res=n;
        
        for(int i:arr){
            z+=i==0?1:0;
        }
        
        int one=0,zero=0;

        for(int i=0;i<=n;i++){
            int temp=one+(z-zero);
            res=Math.min(res,temp);
            
            if(i<n){
                if(arr[i]==0){
                    zero++;
                }
                else{
                    one++;
                }
            }
        }
        return res;
    }
}
