import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        String type=br.readLine();
        if(type.charAt(0)=='f'){
            int n=Integer.parseInt(br.readLine());
            StringTokenizer st=new StringTokenizer(br.readLine());
            int[] a=new int[n];
            for(int i=0;i<n;i++){
                a[i]=Integer.parseInt(st.nextToken());
                char c=(char)((a[i]+3-1)%26+'a');
                sb.append(c);
            }
            System.out.println(sb.toString());
        }
        else{
            StringBuilder sb1=new StringBuilder();
            // String t2=br.readLine();
            String temp=br.readLine();
            for(int i=0;i<temp.length();i++){
                char c=temp.charAt(i);
                int res=((int)(c-'a'-3+26)%26)+1;
                sb1.append(res).append(" ");
            }
            System.out.println(temp.length());
            System.out.println(sb1.toString());
        }
    }
}
