import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        while(t-->0){
            StringTokenizer st=new StringTokenizer(br.readLine());
            int n=Integer.parseInt(st.nextToken());
            int k=Integer.parseInt(st.nextToken());
            long[] a=new long[n];
            
            st=new StringTokenizer(br.readLine());
            for(int i=0;i<n;i++){
                a[i]=Long.parseLong(st.nextToken());
            }
            
            Arrays.sort(a);
            
            long[] prefix=new long[n+1];
            for(int i=0;i<n;i++){
                prefix[i+1]=a[i]+prefix[i];
            }
            
            long res=0;
            for(int i=0;i<=k;i++){
                int left=2*i;
                int right=n-(k-i);
                
                if(left>right)break;
                
                long sum=prefix[right]-prefix[left];
                res=Math.max(res,sum);
            }
            System.out.println(res);
        }
    }
}
