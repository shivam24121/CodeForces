import java.util.*;
import java.io.*;
public class Conquest {

    long a,b;
    int[] nums;
    long[] dp;

    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        while(t-->0){
            StringTokenizer st=new StringTokenizer(br.readLine());
            int n=Integer.parseInt(st.nextToken());
            long a=Long.parseLong(st.nextToken());
            long b=Long.parseLong(st.nextToken());

            int[] nums=new int[n+1];
            nums[0]=0;
            st=new StringTokenizer(br.readLine());
            for(int i=1;i<=n;i++){
                nums[i]=Integer.parseInt(st.nextToken());
            }

            long[] prefix=new long[n+1];

            for(int i=1;i<=n;i++){
                prefix[i]=prefix[i-1]+nums[i];
            }
            long ans=Long.MAX_VALUE;

            for(int i=0;i<=n;i++){
                long one=(a+b)*(nums[i]-nums[0]);
                long two=b*(prefix[n]-prefix[i]-(long)(n-i)*nums[i]);
                long val=one+two;
                ans=Math.min(ans,val);
            }
            System.out.println(ans);
        }
    }
}
