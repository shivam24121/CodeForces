import java.util.*;
import java.io.*;

public class PracticeCF{

    static String s;
    static int[][] dp;

    static int solve(int i,int state){

        if(i==s.length()){
            return 0;
        }

        if(dp[i][state]!=-1){
            return dp[i][state];
        }

        int skip=solve(i+1,state);

        int pick=0;

        char ch=s.charAt(i);

        if(ch!='4'){

            if(state==0){

                if(ch=='2'){
                    pick=1+solve(i+1,0);
                }
                else{
                    pick=1+solve(i+1,1);
                }
            }
            else{

                if(ch=='1' || ch=='3'){
                    pick=1+solve(i+1,1);
                }
            }
        }

        return dp[i][state]=Math.max(skip,pick);
    }

    public static void main(String[] args)throws Exception{

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        int t=Integer.parseInt(br.readLine());

        while(t-->0){

            s=br.readLine();

            int n=s.length();

            dp=new int[n][2];

            for(int i=0;i<n;i++){
                Arrays.fill(dp[i],-1);
            }

            int keep=solve(0,0);

            System.out.println(n-keep);
        }
    }
}
