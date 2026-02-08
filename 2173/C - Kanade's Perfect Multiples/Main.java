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
            
            Map<Integer,Integer>map=new HashMap<>();
            int[] a=new int[n];
            Set<Integer>set=new HashSet<>();
            
            st=new StringTokenizer(br.readLine());
            
            for(int i=0;i<n;i++){
                a[i]=Integer.parseInt(st.nextToken());
                map.put(a[i],map.getOrDefault(a[i],0)+1);
            }
            ArrayList<Integer>res=new ArrayList<>();
            
            Arrays.sort(a);
            
            boolean fl=false;
            
            outer:
            for(int i:a){
                if(!set.contains(i)){
                    for(int j=i;j<=k;j+=i){
                        if(!map.containsKey(j)){
                            System.out.println("-1");
                            fl=true;
                            break outer;
                        }
                        set.add(j);
                    }
                    //set.add(i);
                    res.add(i);
                }
            }
            if(fl)continue;
            System.out.println(res.size());
            for(int i=0;i<res.size();i++){
                System.out.print(res.get(i)+" ");
            }
            System.out.println();
        }
    }
}
