import java.io.*;
import java.util.*;

public class Main {

    static final long MOD=1000000007L;
    static final int MAX=200005;

    static long[] fact=new long[MAX];
    static long[] invFact=new long[MAX];

    public static void main(String[] args) throws Exception {

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        precompute();

        int t=Integer.parseInt(br.readLine());

        StringBuilder sb=new StringBuilder();

        while(t-->0){

            StringTokenizer st=new StringTokenizer(br.readLine());

            int n=Integer.parseInt(st.nextToken());
            int k=Integer.parseInt(st.nextToken());

            st=new StringTokenizer(br.readLine());

            int one=0;
            int zero=0;

            for(int i=0;i<n;i++){

                int x=Integer.parseInt(st.nextToken());

                if(x==1) one++;
                else zero++;
            }

            long ans=0;

            int need=(k+1)/2;

            for(int i=need;i<=k;i++){

                if(i>one) continue;

                int z=k-i;

                if(z>zero) continue;

                ans=(ans+
                        nCr(one,i)*nCr(zero,z)
                    )%MOD;
            }

            sb.append(ans).append("\n");
        }

        System.out.print(sb);
    }

    static void precompute(){

        fact[0]=1;

        for(int i=1;i<MAX;i++){
            fact[i]=(fact[i-1]*i)%MOD;
        }

        invFact[MAX-1]=pow(fact[MAX-1],MOD-2);

        for(int i=MAX-2;i>=0;i--){
            invFact[i]=(invFact[i+1]*(i+1))%MOD;
        }
    }

    static long nCr(int n,int r){

        if(r<0 || r>n) return 0;

        return (((fact[n]*invFact[r])%MOD)
                *invFact[n-r])%MOD;
    }

    static long pow(long a,long b){

        long res=1;

        while(b>0){

            if((b&1)==1){
                res=(res*a)%MOD;
            }

            a=(a*a)%MOD;

            b>>=1;
        }

        return res;
    }
}
