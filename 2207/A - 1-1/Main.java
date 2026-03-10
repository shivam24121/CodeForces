import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        while(t-->0){
            int n=Integer.parseInt(br.readLine());
            String s=br.readLine();
            int ct0=0,ct1=0;
            char[] a=s.toCharArray();
            for(int i=1;i<n-1;i++){
                if(a[i-1]=='1' && a[i+1]=='1'){
                    a[i]='1';
                }
            }
            for(int i=0;i<n;i++){
                if(a[i]=='1')ct1++;
            }
            for(int i=1;i<n-1;i++){
                if(a[i-1]=='1' && a[i+1]=='1'){
                    a[i]='0';
                }
            }
            for(int i=0;i<n;i++){
                if(a[i]=='1')ct0++;
            }
            System.out.println(ct0+" "+ct1);
        }
    }
}
