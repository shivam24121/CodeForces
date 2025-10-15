import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        StringTokenizer st=new StringTokenizer(br.readLine());
        int[] a=new int[n];
        int total=0;
        for(int i=0;i<n;i++){
            a[i]=Integer.parseInt(st.nextToken());
            total+=a[i];
        }
        if(total%2!=0){
            System.out.println(0);
            return;
        }
        int half=total/2;
        int curr=0;
        int ct=0;
        for(int i=0;i<n-1;i++){
            curr+=a[i];
            if(curr==half){
                ct++;
            }
        }
        System.out.println(ct);
    }
}
