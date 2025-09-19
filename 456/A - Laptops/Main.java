import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        int[][] a=new int[n][2];
        
        for(int i=0;i<n;i++){
            StringTokenizer st=new StringTokenizer(br.readLine());
            a[i][0]=Integer.parseInt(st.nextToken());
            a[i][1]=Integer.parseInt(st.nextToken());
        }
        Arrays.sort(a,(x,y)->Integer.compare(x[0],y[0]));
        boolean fl=false;
        
        for(int i=1;i<n;i++){
            if(a[i][1]<a[i-1][1]){
                fl=true;
                break;
            }
        }
        System.out.println(fl?"Happy Alex":"Poor Alex");
    }
}
