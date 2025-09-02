import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        while(t-->0){
            int n=Integer.parseInt(br.readLine());
            StringTokenizer st=new StringTokenizer(br.readLine());
            int[] a=new int[n];
            int minDiff=Integer.MAX_VALUE;
            for(int i=0;i<n;i++){
                a[i]=Integer.parseInt(st.nextToken());
                if(i>0){
                    int diff=Math.abs(a[i]-a[i-1]);
                    minDiff=Math.min(minDiff,diff);
                }
            }
            boolean sort=true;
            boolean equal=true;
            for(int i=1;i<n;i++){
                if(a[i]<a[i-1]){
                    sort=false;
                }
                if(a[i]!=a[i-1]){
                    equal=false;
                }
            }
            if(equal){
                System.out.println(1);
                continue;
            }
            System.out.println(!sort?0:(minDiff+2)/2);
        }
    }
}
