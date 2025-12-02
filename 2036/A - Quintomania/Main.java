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
            for(int i=0;i<n;i++){
                a[i]=Integer.parseInt(st.nextToken());
            }
            boolean fl=true;
            for(int i=1;i<n;i++){
                int temp=Math.abs(a[i]-a[i-1]);
                if(temp!=5 && temp!=7){
                    fl=false;
                    break;
                }
            }
            System.out.println(fl?"YES":"NO");
        }
    }
}
