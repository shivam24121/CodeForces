import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        while(t-->0){
            int n=Integer.parseInt(br.readLine());
            if(n>45){
                System.out.println("-1");
                continue;
            }
            StringBuilder sb=new StringBuilder();
            for(int i=9;i>=1;i--){
                if(n>=i){
                    sb.append(i);
                    n-=i;
                }
            }
            System.out.println(n==0?sb.reverse().toString():"-1");
        }
    }
}
