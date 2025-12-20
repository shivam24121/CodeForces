import java.util.*;
import java.io.*;
public class PairTopic{
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        int[] a=new int[n];
        int[] b=new int[n];

        StringTokenizer st=new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
            a[i]=Integer.parseInt(st.nextToken());
        }
        st=new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
            b[i]=Integer.parseInt(st.nextToken());
        }
        int[] c=new int[n];

        for(int i=0;i<n;i++){
            c[i]=a[i]-b[i];
        }
        Arrays.sort(c);
        long res=0;

        int l=0,r=n-1;

        while(l<=r){
            if(c[l]+c[r]>0){
                res+=(r-l);
                r--;
            }
            else{
                l++;
            }
        }
        System.out.println(res);
    }
}
