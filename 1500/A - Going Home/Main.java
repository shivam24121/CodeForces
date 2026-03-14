import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        StringTokenizer st=new StringTokenizer(br.readLine());
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=Integer.parseInt(st.nextToken());
        }
        Map<Integer,int[]>map=new HashMap<>();
        int max=Math.min(n,2000);
        for(int i=0;i<max;i++){
            for(int j=i+1;j<max;j++){
                int sum=a[i]+a[j];
                if(!map.containsKey(sum)){
                    map.put(sum,new int[]{i,j});
                }
                else{
                    int[] key=map.get(sum);
                    int x=key[0];
                    int y=key[1];
                    if(i!=x && i!=y && j!=x && j!=y){
                        System.out.println("YES");
                        System.out.println((i+1)+" "+(j+1)+" "+(x+1)+" "+(y+1));
                        return;
                    }
                }
            }
        }
        System.out.println("NO");
    }
}
