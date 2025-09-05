import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int[][] a=new int[5][5];
        int l=0,r=0;
        for(int i=0;i<5;i++){
            StringTokenizer st=new StringTokenizer(br.readLine());
            for(int j=0;j<5;j++){
                a[i][j]=Integer.parseInt(st.nextToken());
                if(a[i][j]==1){
                    l=i;
                    r=j;
                }
            }
        }
        System.out.println(Math.abs(2-l)+Math.abs(2-r));
        
    }
}
