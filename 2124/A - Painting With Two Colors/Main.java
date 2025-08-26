import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        int t=obj.nextInt();
        while(t-->0){
            long n=obj.nextLong();
            long a=obj.nextLong();
            long b=obj.nextLong();
            boolean bl=(n%2)==(b%2);
            boolean re=(a<=b || (n%2)==(a%2));
            
            if(bl && re){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
