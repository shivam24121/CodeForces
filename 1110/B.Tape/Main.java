import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int n=Integer.parseInt(st.nextToken());
        int l=Integer.parseInt(st.nextToken());
        int k=Integer.parseInt(st.nextToken());
        int[] a=new int[n];
        st=new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
            a[i]=Integer.parseInt(st.nextToken());
        }
        int[] diff=new int[n-1];
        for(int i=0;i<n-1;i++){
            diff[i]=a[i+1]-a[i]-1;
        }
        Arrays.sort(diff);
        long res=n;
        for(int i=0;i<n-k;i++){
            res+=diff[i];
        }
        System.out.println(res);
    }
}
