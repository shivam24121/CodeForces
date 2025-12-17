import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        while(t-->0){
            StringTokenizer st=new StringTokenizer(br.readLine());
            int n=Integer.parseInt(st.nextToken());
            int m=Integer.parseInt(st.nextToken());
            
            long[] a=new long[n];
            st=new StringTokenizer(br.readLine());
            for(int i=0;i<n;i++){
                a[i]=Long.parseLong(st.nextToken());
            }
            long b=Long.parseLong(br.readLine());
            
            long prev=Integer.MIN_VALUE;
            boolean fl=true;
            
            for(int i=0;i<n;i++){
                long skip=a[i];
                long pick=b-a[i];
                
                long best=Integer.MAX_VALUE;
                
                if(skip>=prev)best=skip;
                if(pick>=prev)best=Math.min(best,pick);
                
                if(best==Integer.MAX_VALUE){
                    fl=false;
                    break;
                }
                prev=best;
                
            }
            System.out.println(fl?"yes":"no");
        }
    }
}
