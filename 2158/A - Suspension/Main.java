import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        while(t-->0){
            int n=Integer.parseInt(br.readLine());
            StringTokenizer st=new StringTokenizer(br.readLine());
            int y=Integer.parseInt(st.nextToken());
            int r=Integer.parseInt(st.nextToken());
            
            int sent=r;
            sent+=y/2;
            
            if(sent>n){
                System.out.println(n);
            }
            else{
                System.out.println(sent);
            }
        }
    }
}
