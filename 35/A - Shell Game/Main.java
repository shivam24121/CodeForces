import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new FileReader("input.txt"));
        PrintWriter out=new PrintWriter(new FileWriter("output.txt"));
        int n=Integer.parseInt(br.readLine());
        for(int i=0;i<3;i++){
            StringTokenizer st=new StringTokenizer(br.readLine());
            int a=Integer.parseInt(st.nextToken());
            int b=Integer.parseInt(st.nextToken());
            if(a==n){
              n=b;
            }
            else if(b==n){
              n=a;
            }
        }
        out.println(n);
        out.close();
    }
}
