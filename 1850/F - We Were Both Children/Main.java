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
            System.out.println(solve(a));
        }
    }
    public static int solve(int[] a){
        Map<Integer,Integer> map=new HashMap<>();
        for(int i:a){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int[] temp=new int [a.length+1];
        for(int key:map.keySet()){
            for(int i=key;i<temp.length;i+=key){
                temp[i]+=map.get(key);
            }
        }
        return Arrays.stream(temp).max().getAsInt();
    }
}
