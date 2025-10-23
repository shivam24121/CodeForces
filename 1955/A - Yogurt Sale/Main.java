import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        while(t-->0){
            StringTokenizer st=new StringTokenizer(br.readLine());
            int n=Integer.parseInt(st.nextToken());
            int a=Integer.parseInt(st.nextToken());
            int b=Integer.parseInt(st.nextToken());
            
            System.out.println(solve(n,a,b));
        }
    }
    public static int solve(int n,int a,int b){
        if (a+a<=b){
            return n*a;
        }
        int ct=0;
        while(n>1){
            ct+=b;
            n-=2;
        }
        if(n==1)ct+=a;
        return ct;
    }
}
