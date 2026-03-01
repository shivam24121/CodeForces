import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        while(t-->0){
            int n=Integer.parseInt(br.readLine());
            int[] a=new int[n];
            StringTokenizer st=new StringTokenizer(br.readLine());
            for(int i=0;i<n;i++){
                a[i]=Integer.parseInt(st.nextToken());
            }
            int[] prefix=new int[n];
            prefix[0]=a[0];
            for(int i=1;i<n;i++){
                prefix[i]=Math.max(prefix[i-1],a[i]+i);
            }
            int[] suffix=new int[n];
            suffix[n-1]=a[n-1]-(n-1);
            for(int i=n-2;i>=0;i--){
                suffix[i]=Math.max(suffix[i+1],a[i]-i);
            }
            long res=0;
            for(int i=1;i<n-1;i++){
                res=Math.max(res,a[i]+prefix[i-1]+suffix[i+1]);
            }
            System.out.println(res);
        }
    }
}
