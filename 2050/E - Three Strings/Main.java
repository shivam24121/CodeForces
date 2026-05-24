import java.util.*;
import java.lang.*;
import java.io.*;

public class Main{
    
    static int inf=(int)1e9;
    
    public static void main(String[] args) throws java.lang.Exception{
        
        BufferedReader br;
        br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        int t=Integer.parseInt(br.readLine());
        while(t-->0){
            
            String a=br.readLine();
            String b=br.readLine();
            String c=br.readLine();
            
            int[][] dp=new int[a.length()+1][b.length()+1];
            
            for(int[] arr:dp){
                Arrays.fill(arr,inf);
            }
            System.out.println(solve(0,0,a,b,c,dp));
        }
    }
    public static int solve(int i,int j,String a,String b,String c,int[][] dp){
        
        if(i==a.length() && j==b.length()){
            return 0;
        }
        if(dp[i][j]!=inf){
            return dp[i][j];
        }
        
        int first=i<a.length()?(a.charAt(i)==c.charAt(i+j)?0:1)+solve(i+1,j,a,b,c,dp):inf;
        
        int second=j<b.length()?(b.charAt(j)==c.charAt(i+j)?0:1)+solve(i,j+1,a,b,c,dp):inf;
        
        return dp[i][j]=Math.min(first,second);
    }
}
