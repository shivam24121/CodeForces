import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        int t=obj.nextInt();
        while(t-->0){
            int n=obj.nextInt();
            int sum=0;
            Map<Integer,Integer> mp=new HashMap<>();
            for(int i=0;i<n;i++){
                int x=obj.nextInt();
                mp.put(x,mp.getOrDefault(x,0)+1);
                sum+=x;
            }
            if((sum&1)==1){
                System.out.println("no");
                continue;
            }
            int half=sum/2;
            if((half&1)==1 && mp.getOrDefault(1,0)==0){
                System.out.println("NO");
            }
            else{
                System.out.println("YES");
            }
        }
    }
}
