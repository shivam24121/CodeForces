import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        while(t-->0){
            int n=Integer.parseInt(br.readLine());
            StringTokenizer st=new StringTokenizer(br.readLine());
            int[] a=new int[n];
            for(int i=0;i<n;i++){
                a[i]=Integer.parseInt(st.nextToken());
            }
            
            Arrays.sort(a);
            
            Map<Integer,Integer>map=new HashMap<>();
            for(int i:a){
                map.put(i,map.getOrDefault(i,0)+1);
            }
            int res=0;
            for(int i:a){
                if(map.getOrDefault(i,0)>0){
                    int curr=i;
                    while(map.getOrDefault(curr,0)>0){
                        map.put(curr,map.getOrDefault(curr,0)-1);
                        curr++;
                    }
                    res++;
                }
            }
            System.out.println(res);
        }
    }
}
