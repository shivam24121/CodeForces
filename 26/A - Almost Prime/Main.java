import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        int[] res=new int[n+1];
        
        for(int i=2;i<=n;i++){
            if(res[i]==0){
                for(int j=i;j<=n;j+=i){
                    res[j]++;
                }
            }
        }
        int ct=0;
        for(int i=2;i<=n;i++){
            if(res[i]==2)ct++;
        }
        System.out.println(ct);
    }
}
