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
            int n=Integer.parseInt(st.nextToken());
            int k=Integer.parseInt(st.nextToken());
            int mod=(int)1e9+7;
            
            long res=1;
            for(int i=0;i<k;i++){
                res=(res*n)%mod;
            }
            System.out.println(res);
        }
    }
}
