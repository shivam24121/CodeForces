import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        int[] a=new int[5];
        int rem=0;
        StringTokenizer st=new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
            int x=Integer.parseInt(st.nextToken());
            a[x]++;
        }
        int ct=0;
        while(a[4]-->0){
            ct++;
        }
        ct+=a[2]/2;
        a[2]=a[2]%2;
        if(a[2]==1){
            ct++;
            a[1]-=Math.min(2,a[1]);
        }

        while(a[1]>0 && a[3]>0){
            ct++;
            a[1]--;
            a[3]--;
        }
        while(a[3]-->0){
            ct++;
        }
        int sum=0;
        while(a[1]-->0){
            sum+=1;
            if(sum==4){
                ct++;
                sum=0;
            }
        }
        if(sum>0)ct++;
        System.out.println(ct);
    }
}
