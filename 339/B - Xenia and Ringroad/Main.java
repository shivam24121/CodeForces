import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int n=Integer.parseInt(st.nextToken());
        int m=Integer.parseInt(st.nextToken());
        
        int curr=1,cost=0;
        st=new StringTokenizer(br.readLine());
        for(int i=0;i<m;i++){
            int next=Integer.parseInt(st.nextToken());
            if(curr<=next){
                cost+=next-curr;
            }
            else{
                cost+=(n-curr)+next;
            }
            curr=next;
        }
        System.out.println(cost);
    }
}
