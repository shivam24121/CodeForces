import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        while(t-->0){
            StringTokenizer st=new StringTokenizer(br.readLine());
            int n=Integer.parseInt(st.nextToken());
            int x=Integer.parseInt(st.nextToken());
            if(n%x==0){
                System.out.println(2);
                System.out.println("1 "+ (n-1));
            }
            else{
                System.out.println(1);
                System.out.println(n);
            }
        }
    }
}
