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
            int[] a=new int[n+1];
            st=new StringTokenizer(br.readLine());
            for(int i=1;i<=n;i++){
                a[i]=Integer.parseInt(st.nextToken());
            }
            int idx=0;
            for(int i=n;i>=1;i--){
                if(a[i]!=i){
                    idx=i;
                    break;
                }
            }
            if(idx==0){
                System.out.println("1.000000");
                continue;
            }
            double res=1;
            for(int i=0;i<m;i++){
                st=new StringTokenizer(br.readLine());
                int range=Integer.parseInt(st.nextToken());
                float prob=Float.parseFloat(st.nextToken());
                if(range<idx)continue;
                res*=(1-prob);
            }
            System.out.printf("%.6f\n",1-res);
        }
    }
}
