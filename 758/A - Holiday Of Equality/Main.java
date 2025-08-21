import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        int[] a=new int[n];
        int sum=0;
        StringTokenizer st=new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
            a[i]=Integer.parseInt(st.nextToken());
            sum+=a[i];
        }
        int max=Arrays.stream(a).max().getAsInt();
        int total=max*n;
        int diff=total-sum;
        System.out.println(diff);
    }
}
