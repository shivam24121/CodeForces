import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        while(t-->0){
            int n=Integer.parseInt(br.readLine());
            int[] a=new int[n];
            long even=0;
            StringTokenizer st=new StringTokenizer(br.readLine());
            ArrayList<Integer>odd=new ArrayList<>();
            for(int i=0;i<n;i++){
                int x=Integer.parseInt(st.nextToken());
                a[i]=x;
                if(x%2==1){
                    odd.add(x);
                }
                else{
                    even+=x;
                }
            }
            if(odd.size()==0){
                System.out.println(0);
                continue;
            }
            long sum=0;
            Collections.sort(odd);
            int l=0,r=odd.size()-1;
            while(l<=r){
                sum+=odd.get(r--);
                l++;
            }
            System.out.println(even+sum);
        }
    }
}
