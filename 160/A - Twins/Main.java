import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        StringTokenizer st=new StringTokenizer(br.readLine());
        int sum=0;
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=Integer.parseInt(st.nextToken());
            sum+=a[i];
        }
        Arrays.sort(a);
        reverse(a);
        
        int curr=0;
        for(int i=0;i<n;i++){
            curr+=a[i];
            if(curr>(sum/2)){
                System.out.println(i+1);
            }
        }
    }
    public static void reverse(int[] a){
        int n=a.length;
        for(int i=0;i<n/2;i++){
            int temp=a[i];
            a[i]=a[n-1-i];
            a[n-1-i]=temp;
        }
    }
}
