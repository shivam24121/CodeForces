import java.util.*;
import java.io.*;
public class Main{
    
    public static void main(String[] args)throws IOException{
        Map<Long,Long>map=new HashMap<>();
        long[][] dp=new long[2024][2024];
        long curr=1L;
        for(int i=1;i<=2023;i++){
            for(int j=1;j<=i;j++){
                dp[i][j]=curr*curr;
                
                if(j-1>=1){
                    dp[i][j]+=dp[i-1][j-1];
                }
                if(j<=i-1){
                    dp[i][j]+=dp[i-1][j];
                }
                if(i>=3 && j-1>=1 && j-1<=i-2)
                    dp[i][j]-=dp[i-2][j-1];

                map.put(curr,dp[i][j]);
                curr++;
            }
        }
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        while(t-->0){
            long n=Long.parseLong(br.readLine());
            System.out.println(map.get(n));
        }
    }
}
