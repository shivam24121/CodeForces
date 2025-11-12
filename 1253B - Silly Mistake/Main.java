import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        
        List<Integer>day=new ArrayList<>();
        List<Integer>curr=new ArrayList<>();
        
        StringTokenizer st=new StringTokenizer(br.readLine());
        
        int people=0;
        int size=(int)1e6+1;
        int[] state=new int[size];
        
        for(int i=0;i<n;i++){
            int x=Integer.parseInt(st.nextToken());
            int val=Math.abs(x);
            curr.add(val);
            
            if(x>0){
                if(state[val]!=0){
                    System.out.println("-1");
                    return;
                }
                people++;
                state[val]=1;
            }
            else{
                if(state[val]!=1){
                    System.out.println("-1");
                    return;
                }
                people--;
                state[val]=2;
            }
            if(people==0){
                day.add(curr.size());
                
                for(int num:curr){
                    state[num]=0;
                }
                curr.clear();
            }
        }
        if(!curr.isEmpty()){
            System.out.println("-1");
            return;
        }
        else{
            System.out.println(day.size());
            for(int i=0;i<day.size();i++){
                System.out.print(day.get(i)+" ");
            }
        }
    }
}
