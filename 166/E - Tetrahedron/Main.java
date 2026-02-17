import java.util.*;
import java.io.*;
public class Main{
  public static void main(String[] args)throws IOException{
    int mod=(int)1e9+7;
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    int n=Integer.parseInt(br.readLine());

    long[] dp=new long[n+1];
    
    for(int i=2;i<=n;i++){
      dp[i]=(dp[i-1]*3)%mod;
      if(i%2==1){
        dp[i]-=3;
      }
      else{
        dp[i]+=3;
      }
    }
    System.out.println(dp[n]);
  }
}
