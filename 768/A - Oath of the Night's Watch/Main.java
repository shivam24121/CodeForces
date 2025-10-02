import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        StringTokenizer st=new StringTokenizer(br.readLine());
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=Integer.parseInt(st.nextToken());
        }
        System.out.println(solve(a,n));
    }
    public static int solve(int[] a,int n){
        int max=Integer.MIN_VALUE;
        for(int i:a){
            if(i>max){
                max=i;
            }
        }
        
        int min=Integer.MAX_VALUE;
        for(int i:a){
            if(i<min){
                min=i;
            }
        }
        
        int ct=0;
        
        for(int i:a){
            if(i>min && i<max){
                ct++;
            }
        }
        return ct;
    }
}
