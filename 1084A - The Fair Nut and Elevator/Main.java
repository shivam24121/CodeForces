import java.util.*;
import java.lang.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws java.lang.Exception{
        
        BufferedReader br;
        br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        int t=1;
        while(t-->0){
            
            int n=Integer.parseInt(br.readLine());
            st=new StringTokenizer(br.readLine());
            
            int[] arr=new int[n+1];
            
            for(int i=1;i<=n;i++){
                arr[i]=Integer.parseInt(st.nextToken());
            }
            int res=Integer.MAX_VALUE;
            for(int i=1;i<=n;i++){
                int cost=0;
                for(int j=1;j<=n;j++){
                    int perP=2*(Math.abs(j-i)+Math.abs(j-1)+Math.abs(i-1));
                    cost+=perP*arr[j];
                }
                res=Math.min(res,cost);
            }
            System.out.println(res);
        }
    }
}
