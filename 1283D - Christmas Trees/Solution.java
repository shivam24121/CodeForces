import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int n=Integer.parseInt(st.nextToken());
        int m=Integer.parseInt(st.nextToken());
        
        
        st=new StringTokenizer(br.readLine());
        long[] tree=new long[n];
        for(int i=0;i<n;i++){
            tree[i]=Long.parseLong(st.nextToken());
        }
        ArrayList<Long>list=new ArrayList<>();
        Queue<long[]>q=new LinkedList<>();
        Set<Long>set=new HashSet<>();
        long res=0;
        
        for(long i:tree){
            q.offer(new long[]{i,0});
            set.add(i);
        }
        while(!q.isEmpty()){
            long[] fnt=q.poll();
            long curr=fnt[0];
            long dis=fnt[1];
            
            
            long left=curr-1;
            long right=curr+1;
            
            if(set.contains(left)==false){
                res+=(Math.abs(curr-left)+dis);
                set.add(left);
                list.add(left);
                q.offer(new long[]{left,dis+1});
                if(list.size()==m)break;
            }
            if(set.contains(right)==false){
                res+=(Math.abs(curr-right)+dis);
                set.add(right);
                list.add(right);
                q.offer(new long[]{right,dis+1});
                if(list.size()==m)break;
            }
        }
        System.out.println(res);
        for(int i=0;i<m;i++){
            System.out.print(list.get(i)+" ");
        }
    }
}
