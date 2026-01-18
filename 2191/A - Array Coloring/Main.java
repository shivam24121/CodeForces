import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        while(t-->0){
            int n=Integer.parseInt(br.readLine());
            StringTokenizer st=new StringTokenizer(br.readLine());
            boolean fl=true;
            int[][] a=new int[n][2];
            for(int i=0;i<n;i++){
                a[i][0]=Integer.parseInt(st.nextToken());
                a[i][1]=fl?1:0;
                fl=!fl;
            }
            Arrays.sort(a,(x,y)->x[0]-y[0]);
            boolean check=true;
            
            for(int i=0;i<n-1;i++){
                if(a[i][1]==a[i+1][1]){
                    check=false;
                    break;
                }
            }
            System.out.println(check?"YES":"NO");
        }
    }
}
