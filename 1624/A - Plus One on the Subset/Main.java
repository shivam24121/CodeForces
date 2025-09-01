import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        while(t-->0){
            int n=Integer.parseInt(br.readLine());
            int max=Integer.MIN_VALUE;
            int min=Integer.MAX_VALUE;
            StringTokenizer st=new StringTokenizer(br.readLine());
            for(int i=0;i<n;i++){
                int x=Integer.parseInt(st.nextToken());
                max=Math.max(max,x);
                min=Math.min(min,x);
            }
            System.out.println(max-min);
        }
    }
}
