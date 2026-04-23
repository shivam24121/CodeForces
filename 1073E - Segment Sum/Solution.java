import java.util.*;
import java.lang.*;
import java.io.*;

public class Main{
    static int mod=998244353;
    public static void main(String[] args) throws java.lang.Exception{
        
        BufferedReader br;
        br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        int t=1;
        while(t-->0){

            st=new StringTokenizer(br.readLine());
            
            long l=Long.parseLong(st.nextToken());
            long r=Long.parseLong(st.nextToken());
            int k=Integer.parseInt(st.nextToken());
            
            System.out.println((solve(r,k)-solve(l-1,k)+mod)%mod);
        }
    }
    public static long solve(long n,int k){
        
        String s=String.valueOf(n);
        int[] digit=new int[s.length()];
        
        for(int i=0;i<s.length();i++){
            int c=s.charAt(i)-'0';
            digit[i]=c;
        }
        long[][][][] dp=new long[s.length()][2][2][1024];
        
        for(long[][][] a:dp){
            for(long[][] b:a){
                for(long[] c:b){
                    Arrays.fill(c,-1);
                }
            }
        }
        return dfs(0,1,1,0,0,digit,dp,k);
    }
    public static long dfs(int idx,int tight,int lZero,int mask,long num,int[] digit,long[][][][] dp,int k){
        
        if(idx==digit.length){
            // System.out.println(num);
            return Integer.bitCount(mask)<=k?num%mod:0;
        }
        // if(dp[idx][tight][lZero][mask]!=-1){
        //     return dp[idx][tight][lZero][mask];
        // }
        long res=0;
        
        int limit=tight==1?digit[idx]:9;
        
        for(int i=0;i<=limit;i++){
            
            int nextTight=(tight==1 && i==limit)?1:0;
            int nextZero=(lZero==1 && i==0)?1:0;
            int nextMask=mask;
            if(nextZero!=1){
                nextMask=(mask|(1<<i));
            }
            
            res=(res+dfs(idx+1,nextTight,nextZero,nextMask,((num*10)+i)%mod,digit,dp,k))%mod;
        }
        return dp[idx][tight][lZero][mask]=res;
    }
}
