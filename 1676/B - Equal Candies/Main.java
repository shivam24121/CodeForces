import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        while(t-->0){
            int n=Integer.parseInt(br.readLine());
            StringTokenizer st=new StringTokenizer(br.readLine());
            int[] a=new int[n];
            for(int i=0;i<n;i++){
                a[i]=Integer.parseInt(st.nextToken());
            }
            int min=Arrays.stream(a).min().getAsInt();
            int diff=0;
            for(int i=0;i<n;i++){
                diff+=(a[i]-min);
            }
            System.out.println(diff);
        }
    }
}
