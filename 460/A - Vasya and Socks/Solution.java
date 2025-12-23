import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int n=Integer.parseInt(st.nextToken());
        int k=Integer.parseInt(st.nextToken());
        
        int res=n;
        
        while(n>=k){
            int add=n/k;
            n=add+(n%k);
            res+=add;
        }
        System.out.println(res);
    }
}
