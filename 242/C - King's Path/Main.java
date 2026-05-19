import java.util.*;
import java.lang.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws java.lang.Exception{
        
        BufferedReader br;
        br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        int t=1;
        while(t-->0){
            
            st=new StringTokenizer(br.readLine());
            
            int sx=Integer.parseInt(st.nextToken());
            int sy=Integer.parseInt(st.nextToken());
            
            int ex=Integer.parseInt(st.nextToken());
            int ey=Integer.parseInt(st.nextToken());
            
            int n=Integer.parseInt(br.readLine());
            
            int[] dx={1,1,1,0,0,-1,-1,-1};
            int[] dy={-1,0,1,-1,1,0,-1,1};
            
            Map<Long,Integer>map=new HashMap<>();
            
            for(int i=0;i<n;i++){
                
                st=new StringTokenizer(br.readLine());
                
                int row=Integer.parseInt(st.nextToken());
                
                int x=Integer.parseInt(st.nextToken());
                int y=Integer.parseInt(st.nextToken());
                
                for(int j=x;j<=y;j++){
                    
                    long key=(((long)row<<32)|(j & 0xFFFFFFFFL));
                    
                    if(!map.containsKey(key)){
                        map.put(key,-1);
                    }
                }
            }
            long start=(((long)sx<<32)|(sy & 0xFFFFFFFFL));
            
            Queue<int[]>q=new ArrayDeque<>();
            map.put(start,0);
            q.offer(new int[]{sx,sy});
            
            while(!q.isEmpty()){
                int[] curr=q.poll();
                int x=curr[0];
                int y=curr[1];
                
                long prevKey=(((long)x<<32)|(y & 0xFFFFFFFFL));
                
                if(x==ex && y==ey){
                    break;
                }
                for(int i=0;i<8;i++){
                    
                    int xx=x+dx[i];
                    int yy=y+dy[i];
                    
                    long key=(((long)xx<<32)|(yy & 0xFFFFFFFFL));
                    
                    if(map.containsKey(key) && map.get(key)==-1){
                        map.put(key,map.get(prevKey)+1);
                        q.offer(new int[]{xx,yy});
                    }
                }
            }
            long end=(((long)ex<<32)|(ey & 0xFFFFFFFFL));
            if(map.containsKey(end) && map.get(end)!=-1){
                System.out.println(map.get(end));
            }
            else{
                System.out.println("-1");
            }
        }
    }
}
