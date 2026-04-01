import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef{
    public static void main(String[] args) throws java.lang.Exception{
        BufferedReader br;
        br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int t=Integer.parseInt(br.readLine());
        while(t-->0){
            int n=Integer.parseInt(br.readLine());
            st=new StringTokenizer(br.readLine());
            int[] arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=Integer.parseInt(st.nextToken());
            }
            int ans=1;
            for(int x=0;x<=31;x++){
                int mask=(1<<x);
                int prev=-1;
                boolean fl=false;
                for(int i=0;i<n;i++){
                    if((mask&arr[i])!=0){
                        ans=Math.max(ans,i-prev);
                        prev=i;
                        fl=true;
                    }
                }
                if(fl){
                    ans=Math.max(ans,n-prev);
                }
            }
            System.out.println(ans);
        }
    }
}
