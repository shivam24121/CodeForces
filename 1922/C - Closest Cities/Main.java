import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        StringBuilder sb=new StringBuilder();
        while(t-->0){
            int n=Integer.parseInt(br.readLine());
            StringTokenizer st=new StringTokenizer(br.readLine());
            int[] a=new int[n];
            for(int i=0;i<n;i++){
                a[i]=Integer.parseInt(st.nextToken());
            }
            long[] right=new long[n];
            long[] left=new long[n];
            
            for(int i=0;i<n-1;i++){
                right[i+1]=right[i];
                if(i==0 || a[i]-a[i-1]>a[i+1]-a[i]){
                    right[i+1]++;
                }
                else{
                    right[i+1]+=(a[i+1]-a[i]);
                }
            }
            for(int i=n-1;i>0;i--){
                left[i-1]=left[i];
                if(i==n-1 || a[i]-a[i-1]<a[i+1]-a[i]){
                    left[i-1]++;
                }
                else{
                    left[i-1]+=(a[i]-a[i-1]);
                }
            }
            int q=Integer.parseInt(br.readLine());
            for(int i=0;i<q;i++){
                st=new StringTokenizer(br.readLine());
                int s=Integer.parseInt(st.nextToken())-1;
                int e=Integer.parseInt(st.nextToken())-1;
                
                if(s<e){
                    long temp=right[e]-right[s];
                    sb.append(temp).append('\n');
                }
                else{
                    sb.append(left[e]-left[s]).append('\n');
                }
            }
        }
        System.out.println(sb.toString());
    }
}
