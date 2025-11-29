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
            boolean fl=false,p=false;
            for(int i=0;i<n;i++){
                if(!map.containsKey(i)){
                    System.out.println(i);
                    p=true;
                    break;
                }
                if(fl && map.get(i)==1){
                    System.out.println(i);
                    p=true;
                    break;
                }
                if(map.get(i)==1){
                    fl=true;
                }
            }
            if(!p)System.out.println(n);
        }
    }
}
