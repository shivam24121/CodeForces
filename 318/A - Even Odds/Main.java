import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int n=Integer.parseInt(st.nextToken());
        int k=Integer.parseInt(st.nextToken());
        int ans=-1;
        if(k<=(n+1)/2){
            ans=1;
            for(int i=1;i<k;i++){
                ans=ans+2;
            }
        }
        else{
            k-=(n+1)/2;
            ans=2;
            for(int i=1;i<k;i++){
                ans=ans+2;
            }
        }
        System.out.println(ans);
    }
}
