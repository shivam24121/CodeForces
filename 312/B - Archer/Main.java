import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        double a=Double.parseDouble(st.nextToken());
        double b=Double.parseDouble(st.nextToken());
        double c=Double.parseDouble(st.nextToken());
        double d=Double.parseDouble(st.nextToken());
        
        double p=a/b;
        double q=c/d;
        System.out.println(p/(p+q-p*q));
    }
}

/*  a make it b ki chance nhi aye =? a
    a miss and b maar de => (1-a)b  // not favorable s0 *0;
    a bhi na maare and b bhi => (1-a)(1-b);
    
    total a+(1-a)(1-b);
    P(1−(1−p)(1−q))=p
*/
