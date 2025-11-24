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
        int max=Arrays.stream(a).max().getAsInt();
        long sum=Arrays.stream(a).sum();
        System.out.println((sum&1)==0 && (sum-max)>=max?"YES":"NO");
    }
}
