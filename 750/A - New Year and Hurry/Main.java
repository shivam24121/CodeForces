import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int n=Integer.parseInt(st.nextToken());
        int k=Integer.parseInt(st.nextToken());
        int rem=240-k;
        int time=0,ct=0;
        for(int i=1;i<=n;i++){
            time+=5*i;
            if(time>rem)break;
            ct++;
        }
        System.out.println(ct);
    }
    
}
