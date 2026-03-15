import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        while(t-->0){
            int n=Integer.parseInt(br.readLine());
            StringTokenizer st;
            int[] freq=new int[101];
            for(int i=0;i<n;i++){
                st=new StringTokenizer(br.readLine());
                for(int j=0;j<n;j++){
                    int x=Integer.parseInt(st.nextToken());
                    freq[x]++;
                }
            }
            int max=-1;
            for(int i=0;i<101;i++){
                max=Math.max(max,freq[i]);
            }
            System.out.println((max>(n*n-n))?"NO":"YES");
        }
    }
}
