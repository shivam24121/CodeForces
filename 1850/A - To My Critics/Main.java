import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        while(t-->0){
            StringTokenizer st=new StringTokenizer(br.readLine());
            int a=Integer.parseInt(st.nextToken());
            int b=Integer.parseInt(st.nextToken());
            int c=Integer.parseInt(st.nextToken());
            
            int high=Math.max(a,Math.max(b,c));
            int secHigh=Math.max(Math.min(a,b),Math.max(Math.min(a,c),Math.min(b,c)));
            System.out.println(high+secHigh>=10?"YES":"NO");
        }
    }
}
