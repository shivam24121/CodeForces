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
            long[] arr=new long[n];
            st=new StringTokenizer(br.readLine());
            for(int i=0;i<n;i++){
                arr[i]=Long.parseLong(st.nextToken());
            }
            int res=0;
            int ct=0;
            for(int i=0;i<k;i++){
                if(arr[i]<arr[i+1]*2){
                    ct++;
                }
            }
            for(int i=k;i<n-1;i++){
                if(ct==k)res++;
                if(arr[i]<arr[i+1]*2)ct++;
                if(arr[i-k]<arr[i-k+1]*2)ct--;
            }
            if(ct==k)res++;
            System.out.println(res);
        }
    }
}
