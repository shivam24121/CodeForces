import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        double l=Double.parseDouble(st.nextToken());
        double d=Double.parseDouble(st.nextToken());
        double v=Double.parseDouble(st.nextToken());
        double g=Double.parseDouble(st.nextToken());
        double r=Double.parseDouble(st.nextToken());
        
        double s=d/v;
        double t1=r+g;
        double p=s%t1;
        
        double wait=p<g?0.0:(t1-p);
        double ans=wait+s+(l-d)/v;
        System.out.println(ans);
    }
}
