import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int a=Integer.parseInt(st.nextToken());
        int b=Integer.parseInt(st.nextToken());
        
        int ct=a;
        int temp=a;
        int use=0;
        
        while(temp>=b){
            use=temp/b;
            ct+=use;
            temp=use+(temp%b);
        }
        System.out.println(ct);
    }
}
