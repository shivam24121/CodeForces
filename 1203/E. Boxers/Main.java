import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        int[] a=new int[n];
        StringTokenizer st=new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
            a[i]=Integer.parseInt(st.nextToken());
        }
        Arrays.sort(a);
        boolean[] bl=new boolean[150003];
        int ct=0;
        for(int i=0;i<n;i++){
            int x=a[i];
            
            if(x-1>0 && bl[x-1]==false){
                bl[x-1]=true;
                ct++;
            }
            else if(bl[x]==false){
                bl[x]=true;
                ct++;
            }
            else if(bl[x+1]==false){
                bl[x+1]=true;
                ct++;
            }
        }
        System.out.println(ct);
    }
}
