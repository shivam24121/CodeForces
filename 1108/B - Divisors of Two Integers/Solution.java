import java.util.*;
import java.io.*;
import java.util.stream.*;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        int[] a=new int[n];
        StringTokenizer st=new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
            a[i]=Integer.parseInt(st.nextToken());
        }
        solve(a,n);
    }
    public static void solve(int[] a,int n){
        int max=Arrays.stream(a).max().getAsInt();
        ArrayList<Integer>l=new ArrayList<>();
        for(int i=1;i<=max;i++){
            if(max%i==0){
                l.add(i);
            }
        }
        Map<Integer,Integer>map=new HashMap<>();
        for(int i:a){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        
        for(int i=0;i<l.size();i++){
            if(map.containsKey(l.get(i))){
                map.put(l.get(i),map.getOrDefault(l.get(i),0)-1);
                if(map.get(l.get(i))==0){
                    map.remove(l.get(i));
                }
            }
        }
        int secMax=0;
        for(Map.Entry<Integer,Integer>entry:map.entrySet()){
            if(entry.getKey()>secMax){
                secMax=entry.getKey();
            }
        }
        System.out.print(max+" "+secMax);
    }
}
