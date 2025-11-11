import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        Map<String,Integer>map=new HashMap<>();
        String[][] arr=new String[n][2];
        
        for(int i=0;i<n;i++){
            StringTokenizer st=new StringTokenizer(br.readLine());
            String s=st.nextToken();
            int val=Integer.parseInt(st.nextToken());
            map.put(s,map.getOrDefault(s,0)+val);
            
            arr[i][0]=s;
            arr[i][1]=String.valueOf(val);
        }
        int winScore=0;
        int HighPlayer=0;
        String winner="";
        
        
        for(Map.Entry<String,Integer>entry:map.entrySet()){
            if(entry.getValue()>winScore){
                winScore=entry.getValue();
                HighPlayer=1;
                winner=entry.getKey();
            }
            else if(entry.getValue()==winScore){
                HighPlayer++;
            }
        }
        
        if(HighPlayer==1){
            System.out.println(winner);
            return;
        }
        Set<String> set=new HashSet<>();
        
        for(Map.Entry<String,Integer>entry:map.entrySet()){
            if(entry.getValue()==winScore){
                set.add(entry.getKey());
            }
        }
        
        map.clear();
        
        for(int i=0;i<n;i++){
            String name=arr[i][0];
            int val=Integer.parseInt(arr[i][1]);
            
            map.put(name,map.getOrDefault(name,0)+val);
            if(set.contains(name) && map.get(name)>=winScore){
                System.out.println(name);
                return;
            }
        }
    }
}
