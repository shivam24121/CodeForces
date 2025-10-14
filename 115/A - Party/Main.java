import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        int[] a=new int[n+1];
        for(int i=1;i<=n;i++){
            a[i]=Integer.parseInt(br.readLine());
        }
        
        int maxDepth=0;
        
        for(int i=1;i<=n;i++){
            int curr=i;
            int depth=0;
            while(curr!=-1){
                depth++;
                curr=a[curr];
            }
            maxDepth=Math.max(maxDepth,depth);
        }
        System.out.println(maxDepth);
    }
}
