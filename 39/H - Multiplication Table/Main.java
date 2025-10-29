import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        int[][] a=new int[n-1][n-1];
        
        for(int i=0;i<n-1;i++){
            int mul=i+1;
            for(int j=0;j<n-1;j++){
                a[i][j]=(j+1)*mul;
            }
        }
        
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        
    }
}
