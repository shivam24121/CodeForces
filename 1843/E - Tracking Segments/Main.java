import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        while(t-->0){
            StringTokenizer st=new StringTokenizer(br.readLine());
            int n=Integer.parseInt(st.nextToken());
            int s=Integer.parseInt(st.nextToken());
            int[] arr=new int[n+1];
            int[][] seg=new int[n][2];
            
            for(int i=0;i<s;i++){
                st=new StringTokenizer(br.readLine());
                seg[i][0]=Integer.parseInt(st.nextToken());
                seg[i][1]=Integer.parseInt(st.nextToken());
            }
            int q=Integer.parseInt(br.readLine());
            int[] queries=new int[q];
            for(int i=0;i<q;i++){
                queries[i]=Integer.parseInt(br.readLine());
            }
            int ans=Integer.MAX_VALUE;
            int l=1,r=q;
            
            while(l<=r){
                int mid=l+(r-l)/2;
                if(valid(mid,seg,queries,n)){
                    ans=Math.min(mid,ans);
                    r=mid-1;
                }
                else{
                    l=mid+1;
                }
            }
            System.out.println(ans==Integer.MAX_VALUE?"-1":ans);
        }
    }
    public static boolean valid(int mid,int[][] seg,int[] q,int n){
        int[] temp=new int[n+1];
        for(int i=0;i<mid;i++){
            temp[q[i]]=1;
        }
        long[] prefix=new long[n+1];
        for(int i=1;i<=n;i++){
            prefix[i]=prefix[i-1]+temp[i];
        }
        for(int[] e:seg){
            int l=e[0];
            int r=e[1];
            
            long sum=prefix[r]-(l>1?prefix[l-1]:0);
            if(sum>(r-l+1)/2){
                return true;
            }
        }
        return false;
    }
}
