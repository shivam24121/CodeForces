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
            int[] a=new int[n];
            st=new StringTokenizer(br.readLine());
            Set<Integer>set=new HashSet<>();
            for(int i=0;i<n;i++){
                a[i]=Integer.parseInt(st.nextToken());
                set.add(a[i]);
            }
            int x=-1;
            for(int i=1;i<=n;i++){
                if(!set.contains(i)){
                    x=i;
                    break;
                }
            }
            if(x==-1){
                for(int i=0;i<k;i++){
                    System.out.print(a[i%3]+" ");
                }
                System.out.println();
            }
            else{
                int y=-1;
                for(int i=1;i<=n;i++){
                    if(i!=x && i!=a[n-1]){
                        y=i;
                        break;
                    }
                }
                int[] temp={x,y,a[n-1]};
                for(int i=0;i<k;i++){
                    System.out.print(temp[i%3]+" ");
                }
                System.out.println();
            }
        }
    }
}
