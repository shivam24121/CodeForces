   public static int solve(int n,int[] a){
        long[] pre=new long[n];
        long max=0;
        for(int i=0;i<n;i++){
            max=Math.max(max,a[i]);
            pre[i]=max;
        }
        int ct=0;
        long temp=0;
        for(int i=0;i<n;i+=2){
            if(i==n-1){
                temp=pre[n-2]-1;
            }
            else if(i==0){
                temp=pre[1]-1;
            }
            else{
                temp=Math.min(pre[i-1],pre[i+1])-1;   // left and right neigbours of the curr
            }
            ct+=a[i]>temp?a[i]-temp:0;
        }
        return ct;
    }
}
