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
            Map<Integer,Integer>map=new HashMap<>();
            for(int i:a){
                map.put(i,map.getOrDefault(i,0)+1);
            }
            int res=-1;
            for(Map.Entry<Integer,Integer>entry:map.entrySet()){
                int val=entry.getValue();
                if(val>=3){
                    res=entry.getKey();
                    break;
                }
            }
            System.out.println(res);
        }
    }
}
