import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        while(t-->0){
            int n=Integer.parseInt(br.readLine());
            int[] a=new int[n];
            StringTokenizer st=new StringTokenizer(br.readLine());
            for(int i=0;i<n;i++){
                a[i]=Integer.parseInt(st.nextToken());
            }
            ArrayList<Integer>res=new ArrayList<>();
            res.add(a[0]);
            for(int i=1;i<n;i++){
                if(a[i]!=a[i-1]){
                    res.add(a[i]);
                }
            }
            int ans=res.size();
            
            for(int i=0;i+2<res.size();i++){
                int x=res.get(i);
                int y=res.get(i+1);
                int z=res.get(i+2);
                
                if(x<y && y<z)ans--;
                if(x>y && y>z)ans--;
            }
            System.out.println(ans);
        }
    }
}
