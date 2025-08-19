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
            Map<Integer,Integer> map=new HashMap<>();
            for(int i=0;i<n;i++){
                map.put(a[i],map.getOrDefault(a[i],0)+1);
            }
            if(map.size()==1){
                System.out.println("yes");
            }
            else if(map.size()==2){
                boolean fl=false;
                for(int val:map.values()){
                    if(val==n/2){
                        fl=true;
                        break;
                    }
                }
                System.out.println(fl?"yes":"no");
            }
            else{
                System.out.println("no");
            }
        }
    }
}
