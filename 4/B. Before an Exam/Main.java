import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int n=Integer.parseInt(st.nextToken());
        int hours=Integer.parseInt(st.nextToken());
        
        int[] min=new int[n];
        int[] max=new int[n];
        int[] res=new int[n];
        
        int minSum=0,maxSum=0;
        
        for(int i=0;i<n;i++){
            st=new StringTokenizer(br.readLine());
            min[i]=Integer.parseInt(st.nextToken());
            max[i]=Integer.parseInt(st.nextToken());
            res[i]=min[i];
            minSum+=min[i];
            maxSum+=max[i];
        }
        
        if(minSum>hours || maxSum<hours){
            System.out.println("NO");
            return;
        }
        
        int remaining=hours-minSum;
        
        for(int i=0;i<n && remaining>0;i++){
            int add=Math.min(max[i]-min[i],remaining);
            res[i]+=add;
            remaining-=add;
        }
        System.out.println("YES");
        for(int i=0;i<n;i++){
            System.out.print(res[i]+" ");
        }
    }
}
