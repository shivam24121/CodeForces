import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int n=Integer.parseInt(st.nextToken());
        int k=Integer.parseInt(st.nextToken());
        int x=Integer.parseInt(st.nextToken());
        
        int[] a=new int[n];
        st=new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
            a[i]=Integer.parseInt(st.nextToken());
        }
        
        int destroy=0;
        for(int pos=0;pos<=n;pos++){
            ArrayList<Integer>list=new ArrayList<>();
            for(int i=0;i<n;i++){
                if(pos==i)list.add(x);
                list.add(a[i]);
            }
            if(pos==n)list.add(x);
            
            int temp=solve(list);
            destroy=Math.max(destroy,temp);
        }
        System.out.println(destroy);
    }
    public static int solve(ArrayList<Integer> ball){
        int ct=0;
        boolean fl=true;
        while(fl){
            int n=ball.size();
            fl=false;
            
            for(int i=0;i<n;){
                int j=i;
                while(j<n && ball.get(j).equals(ball.get(i)))j++;
                
                int len=j-i;
                if(len>=3){
                    ct+=len;
                    for(int k=j-1;k>=i;k--){
                        ball.remove(k);
                    }
                    fl=true;
                    break;
                }
                else{
                    i=j;
                }
            }
        }
        return ct>0?ct-1:0;
    }
}
