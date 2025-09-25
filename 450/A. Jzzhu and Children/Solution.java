import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int n=Integer.parseInt(st.nextToken());
        int m=Integer.parseInt(st.nextToken());
        st=new StringTokenizer(br.readLine());
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=Integer.parseInt(st.nextToken());
        }
        System.out.println(solve(n,m,a));
    }
    
    /* we can find ceil value for each childern and the last child with max value is the ans;
    note that condition should be >=
    as we have to give the last child;
    */
    
    public static int solve(int n,int m,int[] a){
        int max=-1;
        int res=1;
        for(int i=0;i<n;i++){
            int turn=(a[i]+m-1)/m;
            if(turn>=max){
                max=turn;
                res=i+1;
            }
            
        }
        return res;
    }
    
}
