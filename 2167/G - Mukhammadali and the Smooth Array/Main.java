 public static long solve(int n,long[] a,long[] c){
        if(n==1)return 0;
        
        long[] t=new long[n];
        long curr=0;
        long res=0;
        
        if(inc(a)){
            return 0;
        }
        
        for(int i=0;i<n;i++){
            long prev=0;
            for(int j=0;j<i;j++){
                if(a[j]<=a[i]){
                    prev=Math.max(prev,t[j]);
                }
            }
            t[i]=c[i]+prev;
            res=Math.max(res,t[i]);
        }
        
        long sum=Arrays.stream(c).sum();
        return sum-res;
    }
    public static boolean inc(long[] a){
        for(int i=1;i<a.length;i++){
            if(a[i-1]>a[i])return false;
        }
        return true;
    }
}
