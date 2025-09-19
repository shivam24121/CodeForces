import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); 
        int n=Integer.parseInt(br.readLine());
        StringTokenizer st=new StringTokenizer(br.readLine());
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=Integer.parseInt(st.nextToken());
        }
        int res=0;
        for(int i=0;i<n;i++){
            int ct=1;
            
            int j=i-1;
            while(j>=0 && a[j]<=a[j+1]){
                ct++;
                j--;
            }
            j=i+1;
            while(j<n && a[j-1]>=a[j]){
                j++;
                ct++;
            }
            res=Math.max(res,ct);
        }
        System.out.println(res);
    }
}
