import java.util.*;
import java.lang.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws java.lang.Exception{
        
        BufferedReader br;
        br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        int t=Integer.parseInt(br.readLine());
        while(t-->0){
            
            st=new StringTokenizer(br.readLine());
            
            long l=Long.parseLong(st.nextToken());
            long r=Long.parseLong(st.nextToken());
            
            System.out.println(solve(r)-solve(l-1));
        }
    }
    public static long solve(long n){
        
        String s=String.valueOf(n);
        int[] digit=new int[s.length()];
        
        for(int i=0;i<s.length();i++){
            int c=s.charAt(i)-'0';
            
            digit[i]=c;
        }
        long[][][] dp=new long[20][2][4];
        
        for(long[][] a:dp){
            for(long[] b:a){
                Arrays.fill(b,-1);
            }
        }
        return dfs(0,1,0,dp,digit);
    }
    public static long dfs(int idx,int tight,int nonZero,long[][][] dp,int[] digit){
        
        if(idx==digit.length){
            return nonZero<=3?1:0;
        }
        if(dp[idx][tight][nonZero]!=-1){
            return dp[idx][tight][nonZero];
        }
        long res=0;
        
        int limit=tight==1?digit[idx]:9;
        
        for(int i=0;i<=limit;i++){
            
            int nextTight=(tight==1 && (i==limit)?1:0);
            
            int nextNonZeros=nonZero+((i!=0)?1:0);
            if(nextNonZeros>3)continue;
            
            res+=dfs(idx+1,nextTight,nextNonZeros,dp,digit);
        }
        return dp[idx][tight][nonZero]=res;
    }
}
