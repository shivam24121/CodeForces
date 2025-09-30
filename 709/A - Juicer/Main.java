import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int n=Integer.parseInt(st.nextToken());
        int b=Integer.parseInt(st.nextToken());
        int d=Integer.parseInt(st.nextToken());
        
        int ct=0;
        int curr=0;
        st=new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
            int x=Integer.parseInt(st.nextToken());
            if(x>b)continue;
            else{
                curr+=x;
                if(curr>d){
                    ct++;
                    curr=0;
                }
            }
        }
        System.out.println(ct);
    }
}
