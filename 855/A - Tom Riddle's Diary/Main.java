import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        int t=1;
        while(t-->0){
            solve(obj);
        }
    }
    public static void solve(Scanner obj){
        int n=obj.nextInt();
        obj.nextLine();
        Map<String,Boolean> hm=new HashMap<>();
        for(int i=0;i<n;i++){
            String str=obj.nextLine();
            if(hm.containsKey(str)){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
                hm.put(str,true);
            }
        }
    }
}
