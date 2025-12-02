import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        while(t-->0){
            StringTokenizer st=new StringTokenizer(br.readLine());
            int n=Integer.parseInt(st.nextToken());
            int q=Integer.parseInt(st.nextToken());
            
            int[] brand=new int[1002];
            for(int i=0;i<q;i++){
                st=new StringTokenizer(br.readLine());
                int b=Integer.parseInt(st.nextToken());
                int c=Integer.parseInt(st.nextToken());
                
                brand[b]+=c;
            }
            long res=0;
            Arrays.sort(brand);
            reverse(brand);
            for(int i=0;i<Math.min(n,1002);i++){
                res+=brand[i];
            }
            System.out.println(res);
        }
    }
    public static void reverse(int[] a){
        int n=a.length;
        for(int i=0;i<n/2;i++){
            int temp=a[i];
            a[i]=a[n-i-1];
            a[n-i-1]=temp;
        }
    }
}
