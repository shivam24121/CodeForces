import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        while(t-->0){
            int n=Integer.parseInt(br.readLine());
            int[] a=new int[n];
            StringTokenizer st=new StringTokenizer(br.readLine());
            for(int i=0;i<n;i++){
                a[i]=Integer.parseInt(st.nextToken());
            }
            boolean fl=false;
            for(int i=0;i<n;i++){
                for(int j=i+1;j<n;j++){
                    if(gcd(a[i],a[j])<=2){
                        fl=true;
                        break;
                    }
                }
            }
            System.out.println(!fl?"NO":"YES");
        }
    }
    public static int gcd(int x,int y){
        return y==0?x:gcd(y,x%y);
    }
}
