import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        int t=obj.nextInt();
        while(t-->0){
            int n=obj.nextInt();
            int[] a=new int[n];
            for(int i=0;i<n;i++){
                a[i]=obj.nextInt();
            }
            Map<Integer,Integer> freq=new HashMap<>();
            Map<Integer,Integer> index=new HashMap<>();
            
            for(int i=0;i<n;i++){
                freq.put(a[i],freq.getOrDefault(a[i],0)+1);
                if(!index.containsKey(a[i])){
                    index.put(a[i],i+1);
                }
            }
            int winner=Integer.MAX_VALUE;
            int win_index=-1;
            List<Integer> l=new ArrayList<>(freq.keySet());
            for(int i=0;i<l.size();i++){
                int num=l.get(i);
                if(freq.get(num)==1 && num<winner){
                    winner=num;
                    win_index=index.get(num);
                }
            }
            System.out.println(win_index);
        }
    }
}
