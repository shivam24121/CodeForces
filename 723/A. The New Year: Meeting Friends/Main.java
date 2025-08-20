import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int[] a=new int[3];
        for(int i=0;i<3;i++){
            a[i]=Integer.parseInt(st.nextToken());
        }
        Arrays.sort(a);
        int diff=0;
        diff+=Math.abs(a[1]-a[0]);
        diff+=Math.abs(a[2]-a[1]);
        System.out.println(diff);
        
    }
}
