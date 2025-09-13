import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        while(t-->0){
            StringTokenizer st=new StringTokenizer(br.readLine());
            int n=Integer.parseInt(st.nextToken());
            int k=Integer.parseInt(st.nextToken());
            String s=br.readLine();
            
            int ct=0,res=Integer.MAX_VALUE;
            for(int i=0;i<k;i++){
                if(s.charAt(i)=='W')ct++;
            }
            res=ct;
            for(int i=k;i<s.length();i++){
                if(s.charAt(i-k)=='W')ct--;
                if(s.charAt(i)=='W')ct++;
                res=Math.min(res,ct);
            }
            System.out.println(res);
        }
    }
}
