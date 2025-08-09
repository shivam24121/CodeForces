import java.util.*;
public class Main{
    public static void solve(Scanner obj){
        int t=obj.nextInt();
        while(t-->0){
            int n=obj.nextInt();
            obj.nextLine();
            String s=obj.nextLine();
            int one=0,zero=0;
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)=='1')one++;
                else zero++;
            }
            if(zero>one){
                System.out.println("yes");
            }
            else if(zero==0){
                System.out.println("no");
            }
            else{
                System.out.println("yes");
            }
        }
    }
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        solve(obj);
    }
}
