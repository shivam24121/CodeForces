import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        while(t-->0){
            int n=Integer.parseInt(br.readLine());
            int[][] a=new int[n+1][n+1];
            int val=1;
            for(int i=1;i<=n;i++){
                for(int j=1;j<=n;j++){
                    a[i][j]=val++;
                }
            }
            int max=0;
            
            for(int i=1;i<=n;i++){
                for(int j=1;j<=n;j++){
                    int curr=a[i][j];
                    curr+=j+1<=n?a[i][j+1]:0;
                    curr+=i+1<=n?a[i+1][j]:0;
                    curr+=j-1>=0?a[i][j-1]:0;
                    curr+=i-1>=1?a[i-1][j]:0;
                    max=Math.max(curr,max);
                }
            }
            System.out.println(max);
        }
    }
}
