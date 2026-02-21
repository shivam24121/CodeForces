import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        while(t-->0){
            int n=Integer.parseInt(br.readLine());
            StringTokenizer st=new StringTokenizer(br.readLine());
            boolean[] dp=new boolean[n+1];
            dp[0]=true;
            for(int i=1;i<=n;i++){
                int x=Integer.parseInt(st.nextToken());
                if(dp[i-1] && i+x<=n){
                    dp[i+x]=true;
                }
                if(i-x>=1)dp[i]=(dp[i]|dp[i-x-1]);
            }
            System.out.println(dp[n]?"YES":"NO");
        }
    }
}
