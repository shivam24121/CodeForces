import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        while(t-->0){
            int n=Integer.parseInt(br.readLine());
            String s=br.readLine();
            char last=s.charAt(n-1);
            int ct=0;
            for(int i=0;i<n-1;i++){
                if(s.charAt(i)!=last){
                    ct++;
                }
            }
            System.out.println(ct);
        }
    }
}
