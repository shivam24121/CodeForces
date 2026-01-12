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
        boolean fl=true;
        for(int i=0;i<n;i++){
            while(a[i]%2==0){
                a[i]=a[i]/2;
            }
            while(a[i]%3==0){
                a[i]=a[i]/3;
            }
        }
        for(int i=0;i<n-1;i++){
            if(a[i]!=a[i+1]){
                fl=false;
                break;
            }
        }
        System.out.println(fl?"Yes":"No");
    }
}
