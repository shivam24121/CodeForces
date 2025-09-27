import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        while(t-->0){
            int n=Integer.parseInt(br.readLine());
            StringTokenizer st=new StringTokenizer(br.readLine());
            int[] a=new int[n+1];
            for(int i=1;i<=n;i++){
                a[i]=Integer.parseInt(st.nextToken());
            }
            System.out.println(solve(n,a)?"YES":"NO");
        }
    }
    public static boolean solve(int n,int[] a){
        long sumO=0,sumE=0,sum=0;
        for(int i=1;i<=n;i++){
            if((i&1)==1){
                sumO+=a[i];
            }
            else{
                sumE+=a[i];
            }
            sum+=a[i];
        }
        if(sum%n==0){
            int oddCt=(n+1)/2;
            int evenCt=n-oddCt;
            long avg=sum/n;
            if(sumO==oddCt*avg && sumE==evenCt*avg){
                return true;
            }
        }
        return false;
    }
}
