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
            
            long[] height=new long[n];
            long[] ques=new long[m];
            
            st=new StringTokenizer(br.readLine());
            for(int i=0;i<n;i++){
                height[i]=Long.parseLong(st.nextToken());
            }
            
            st=new StringTokenizer(br.readLine());
            for(int i=0;i<m;i++){
                ques[i]=Long.parseLong(st.nextToken());
            }
            
            //Arrays.sort(height);
            
            long[] prefix=new long[n+1];
            long[] max=new long[n+1];
            prefix[0]=0;
            max[0]=0;
            
            for(int i=0;i<n;i++){
                prefix[i+1]=prefix[i]+height[i];
                max[i+1]=Math.max(max[i],height[i]);
            }
            long[] res=new long[m];
            solve(n,m,height,ques,prefix,max);
        }
    }
    public static void solve(int n,int m,long[] height,long[] ques, long[] prefix,long[] max){
        long[] res=new long[m];
        for(int i=0;i<m;i++){
            res[i]=bs(n,i,m,max,ques,prefix);
        }
         
        for(int i=0;i<m;i++){
            System.out.print(res[i]+" ");
        }   
        System.out.println();
        
    }
    public static long bs(int n,int idx,int m,long[] max,long[]ques,long[] prefix){
        int l=0,r=n-1;
        int res=-1;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(max[mid+1]<=ques[idx]){
                res=mid;
                l=mid+1;
            }
            else{
                r=mid-1;
            }
        }
        return res==-1?0:prefix[res+1];
    }
}
