import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=1;
        while(t-->0){
            int n=Integer.parseInt(br.readLine());
            long sum=0;
            long oddMin=Long.MAX_VALUE;
            StringTokenizer st=new StringTokenizer(br.readLine());
            for(int i=1;i<=n;i++){
                long x=Long.parseLong(st.nextToken());
                sum+=x;
                if(x%2==1){
                    oddMin=Math.min(oddMin,x);
                }
            }
            System.out.println(sum%2==1?sum-oddMin:sum);
        }
    }
}
