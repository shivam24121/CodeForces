import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        while(t-->0){
            
            int n=Integer.parseInt(br.readLine());
            
            int[] a=new int[n+1];
            int[] b=new int[n+1];
            
            StringTokenizer st=new StringTokenizer(br.readLine());
            for(int i=1;i<=n;i++){
                a[i]=Integer.parseInt(st.nextToken());
            }
            st=new StringTokenizer(br.readLine());
            for(int i=1;i<=n;i++){
                b[i]=Integer.parseInt(st.nextToken());
            }
            int[] c=new int[n+1];
            
            int max=Integer.MIN_VALUE;
            for(int i=0;i<=n;i++){
                c[i]=Math.abs(a[i]-b[i]);
                max=Math.max(max,c[i]);
            }
            ArrayList<Integer>res=new ArrayList<>();
            for(int i=1;i<=n;i++){
                if(c[i]==max){
                    res.add(i);
                }
            }
            System.out.println(res.size());
            for(int i=0;i<res.size();i++){
                System.out.print(res.get(i)+" ");
            }
            System.out.println();
        }
        
        
    }
}
