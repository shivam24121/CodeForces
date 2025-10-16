import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int n=Integer.parseInt(st.nextToken());
        int m=Integer.parseInt(st.nextToken());
        st=new StringTokenizer(br.readLine());
        int[] a=new int[n];
        int res=0;
        for(int i=0;i<n;i++){
            a[i]=Integer.parseInt(st.nextToken());
        }
        Arrays.sort(a);
        for(int i=0;i<n;i++){
            if(a[i]<0 && m>0){
                res+=Math.abs(a[i]);
                m--;
            }
        }
        System.out.println(res);
    }
}
