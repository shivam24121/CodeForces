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
            StringBuilder sb=new StringBuilder();
            int[] c=new int[26];
            for(int i=0;i<n;i++){
                for(int j=0;;j++){
                    if(c[j]==a[i]){
                        sb.append((char)(j+'a'));
                        ++c[j];
                        break;
                    }
                }
            }
            System.out.println(sb.toString());
        }
        
    }
}
