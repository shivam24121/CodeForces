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
            String s=br.readLine();
            int res=0;
            for(int i=0;i<n;i++){
                if(s.charAt(i)=='0'){
                    int temp=1;
                    for(int j=Math.max(0,i-k);j<i;j++){
                        if(s.charAt(j)=='1'){
                            temp=0;
                            break;
                        }
                    }
                    res+=temp;
                }
            }
            System.out.println(res);
        }
    }
}
