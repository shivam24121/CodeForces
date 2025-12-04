import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        while(t-->0){
            int n=Integer.parseInt(br.readLine());
            StringTokenizer st=new StringTokenizer(br.readLine());
            ArrayList<Integer>list=new ArrayList<>();
            for(int i=0;i<n;i++){
                int x=Integer.parseInt(st.nextToken());
                list.add(x);
            }
            int max=Collections.max(list);
            long res=-max;
            list.add(list.get(0));
            for(int i=0;i<n;i++){
                int temp=Math.max(list.get(i),list.get(i+1));
                res+=temp;
            }
            System.out.println(res);
        }
    }
}
