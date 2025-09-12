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
        int max=1;
        int ct=1;
        for(int i=1;i<n;i++){
            if(a[i]>=a[i-1]){
                ct++;
            }
            else{
                ct=1;
            }
            max=Math.max(max,ct);
        }
        System.out.println(max);
    }
}
