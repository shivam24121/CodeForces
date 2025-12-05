import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        while(t-->0){
            StringTokenizer st=new StringTokenizer(br.readLine());
            int n=Integer.parseInt(st.nextToken());
            int k=Integer.parseInt(st.nextToken());
            if((n-1)/2<k){
                System.out.println("-1");
                continue;
            }
            int[] a=new int[n];
            int val=1;
            int j=0;
            for(int i=0;i<k+1;i++){
                a[j]=val++;
                j+=2;
            }
            
            for(int i=0;i<n;i++){
                if(a[i]==0){
                    a[i]=val++;
                }
            }
            for(int i=0;i<n;i++){
                System.out.print(a[i]+" ");
            }
            System.out.println();
        }
    }
}
