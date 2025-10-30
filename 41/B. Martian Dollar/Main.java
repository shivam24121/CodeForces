import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int n=Integer.parseInt(st.nextToken());
        int b=Integer.parseInt(st.nextToken());
        st=new StringTokenizer(br.readLine());
        int[] a=new int[n];
        
        for(int i=0;i<n;i++){
            a[i]=Integer.parseInt(st.nextToken());
        }
        
        int res=b;
        int min=a[0];
        
        for(int i=1;i<n;i++){
            int canBuy=b/min;
            int sum=(b-(canBuy*min))+a[i]*canBuy;
            
            res=Math.max(res,sum);
            min=Math.min(min,a[i]);
        }
        System.out.println(res);
    }
}
