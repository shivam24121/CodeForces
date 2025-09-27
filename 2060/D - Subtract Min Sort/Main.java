import java.util.*;
import java.io.*;
public class Main{
    public static void main(Stirng[] arfs)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        while(t-->0){
            int n=Integer.parseInt(br.readLine());
            StringTokenizer st=new StringTokenizer(br.readLine());
            int[] a=new int[n];
            for(int i=0;i<n;i++){
                a[i]=Integer.parseInt(st.nextToken());
            }
            System.out.println(solve(n,a)?"YES":"NO");
        }
    }
    public static boolean solve(int n,int[] a){
        for(int i=0;i<n-1;i++){
            if(a[i]>a[i+1]){
                return false;
            }
            a[i+1]-=a[i];
        }
        return true;
    }
}
