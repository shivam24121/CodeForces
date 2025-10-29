 public static long solve(int n,long[] a){
        long curr=a[0];
        for(int i=1;i<n;i++){
            curr=gcd(curr,a[i]);
        }
        return div(curr);
        
    }
    public static long gcd(long a,long b){
        return b==0?a:gcd(b,a%b);
    }
    public static  boolean prime(int x){
        if(x<2)return false;
        if (x==2)return true;
        if(x!=2){
            if(x%2==0)return false;
        }
        for(int i=3;(long)i*i<=x;i+=2){
            if(x%i==0){
                return false;
            }
        }
        return true;
    }
    public static  int div(long x){
        int i=2;
        while(true){
            if(prime(i) && x%i!=0)return i;
            else i++;
        }
    }
}
