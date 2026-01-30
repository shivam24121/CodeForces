import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        while(t-->0){
            int n=Integer.parseInt(br.readLine());
            if(n<=3){
                System.out.println("-1");
                continue;
            }
            else{
                StringBuilder sb=new StringBuilder();
                int max=n%2==1?n:n-1;
                
                for(int i=max;i>=1;i-=2){
                    sb.append(i).append(" ");
                }
                for(int i=4;i<=n;i+=2){
                    sb.append(i).append(" ");
                    if(i==4){
                        sb.append(2).append(" ");
                    }
                }
                System.out.println(sb.toString());
            }
        }
    }
}
