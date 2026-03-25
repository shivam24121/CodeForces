import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int n=Integer.parseInt(st.nextToken());
        int left=Integer.parseInt(st.nextToken());
        int right=Integer.parseInt(st.nextToken());
        int x=Integer.parseInt(st.nextToken());
        int[] a=new int[n];
        st=new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
            a[i]=Integer.parseInt(st.nextToken());
        }
        int res=0;
        for(int mask=0;mask<(1<<n);mask++){
            if(Integer.bitCount(mask)<2)continue;
            long sum=0;
            int l=Integer.MAX_VALUE;
            int r=Integer.MIN_VALUE;
            for(int i=0;i<n;i++){
                if(((mask>>i)&1)!=0){
                    sum+=a[i];
                    l=Math.min(l,a[i]);
                    r=Math.max(r,a[i]);
                }
            }
            if(sum>=left && sum<=right && (r-l)>=x){
                res++;
            }
        }
        System.out.println(res);
    }
}
