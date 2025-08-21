import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        while(t-->0){
            int n=Integer.parseInt(br.readLine());
            int[] a=new int[n];
            int[] b=new int[n];
            StringTokenizer st=new StringTokenizer(br.readLine());
            for(int i=0;i<n;i++){
                a[i]=Integer.parseInt(st.nextToken());
            }
            st=new StringTokenizer(br.readLine());
            for(int i=0;i<n;i++){
                b[i]=Integer.parseInt(st.nextToken());
            }
            int res=0;
            for(int i=0;i<n-1;i++){
                if(a[i]>b[i+1]){
                    res+=(a[i]-b[i+1]);
                }
            }
            res+=a[n-1];
            System.out.println(res);
        }
        
    }
}
