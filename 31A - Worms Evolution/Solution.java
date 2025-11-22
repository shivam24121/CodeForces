import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        StringTokenizer st=new StringTokenizer(br.readLine());
        Map<Integer,Integer>map=new HashMap<>();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=Integer.parseInt(st.nextToken());
            map.put(a[i],i);
        }
        //Arrays.sort(a);
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                int temp=a[i]+a[j];
                if(map.containsKey(temp)){
                    System.out.println(map.get(temp)+1+" "+(i+1)+" "+(j+1));
                    return;
                }
            }
        }
        System.out.println("-1");
    }
}
