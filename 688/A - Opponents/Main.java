import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int n=Integer.parseInt(st.nextToken());
        int d=Integer.parseInt(st.nextToken());
        String[] s=new String[d];
        for(int i=0;i<d;i++){
            s[i]=br.readLine();
        }
        int ct=0,res=0;
        String one="1";
        for(int i=0;i<d;i++){
            String lose=one.repeat(n);
            if(!s[i].equals(lose)){
                ct++;
                res=Math.max(res,ct);
            }
            else{
                ct=0;
            }
        }
        System.out.println(res);
    }
}
