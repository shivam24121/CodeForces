import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int n=Integer.parseInt(st.nextToken());
        int m=Integer.parseInt(st.nextToken());
        int[] a=new int[m];
        st=new StringTokenizer(br.readLine());
        for(int i=0;i<m;i++){
            a[i]=Integer.parseInt(st.nextToken());
        }
        Arrays.sort(a);
        int min=a[n-1]-a[0];
        for(int i=n;i<m;i++){
            int temp=a[i]-a[i-n+1];
            min=Math.min(min,temp);
        }
        System.out.println(min);
    }
}
