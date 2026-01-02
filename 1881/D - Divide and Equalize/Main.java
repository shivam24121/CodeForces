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
                for(int j=2;j*j<=i;j++){
                    while(i%j==0){
                        map.put(j,map.getOrDefault(j,0)+1);
                        i/=j;
                    }
                }
                if(i>1){
                    map.put(i,map.getOrDefault(i,0)+1);
                }
            }
            boolean ok=true;
            for(int i:map.values()){
                if(i%n!=0){
                    ok=false;
                    break;
                }
            }
            System.out.println(ok?"yes":"no");
        }
    }
}
