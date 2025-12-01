import java.util.*;
import java.io.*;
public class Main{
    static class Pair{
        int val;
        int idx;
        Pair(int v,int i){
            this.val=v;
            this.idx=i;
        }
    }
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        while(t-->0){
            
            int n=Integer.parseInt(br.readLine());
            int[] a=new int[n];
            
            if(n%2==0){
                for(int i=0;i<=n-2;i+=2){
                    a[i]=i+2;
                    a[i+1]=i+1;
                }
            }
            else{
                for(int i=0;i<n-3;i+=2){
                    a[i]=i+2;
                    a[i+1]=i+1;
                }
                a[n-3]=n-1;
                a[n-2]=n;
                a[n-1]=n-2;
            }
            
            for(int i=0;i<n;i++){
                System.out.print(a[i]+" ");
            }
            System.out.println();
        }
    }
}
