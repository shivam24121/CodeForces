import java.util.*;
import java.io.*;
public class Main{
  public static void main(String[] args)throws IOException{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    int t=Integer.parseInt(br.readLine());
    while(t-->0){
      StringTokenizer st=new StringTokenizer(br.readLine());
      int n=Integer.parseInt(st.nextToken());
      int k=Integer.parseInt(st.nextToken());
      int[][] a=new int[n][n];
      for(int i=0;i<n;i++){
        String s=br.readLine();
        for(int j=0;j<n;j++){
          a[i][j]=s.charAt(j)-'0';
        }
      }
      for(int i=0;i<n;i+=k){
        for(int j=0;j<n;j+=k){
          System.out.print(a[i][j]);
        }
        System.out.println();
      }
    }
  }
}
