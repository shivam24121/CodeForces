import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        while(t-->0){
            int n=Integer.parseInt(br.readLine());
            StringTokenizer st=new StringTokenizer(br.readLine());
            long[] a=new long[n];
            for(int i=0;i<n;i++){
                a[i]=Long.parseLong(st.nextToken());
            }
            if(n==1 || n==2){
                System.out.println(0);
                continue;
            }
            Arrays.sort(a);
            long res=0;
            for(int i=1;i<n;i++){
                res+=a[i]-a[i-1];
            }
            System.out.println(-res);
        }
    }
}
