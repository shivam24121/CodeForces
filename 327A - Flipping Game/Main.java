import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        StringTokenizer st=new StringTokenizer(br.readLine());
        int one=0;
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=Integer.parseInt(st.nextToken());
            if(a[i]==1)one++;
        }
        if(one==n){
            System.out.println(n-1);
            return;
        }
        int min=Integer.MIN_VALUE;
        int res=0;
        for(int i=0;i<n;i++){
            int val=a[i]==0?1:-1;
            res+=val;
            
            if(res>min){
                min=res;
            }
            if(res<0){
                res=0;
            }
        }
        System.out.println(one+min);
    }
}
