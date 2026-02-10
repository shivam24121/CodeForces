import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        int t=obj.nextInt();
        while(t-->0){
            int n=obj.nextInt();
            if(n>1099){
                System.out.println("YES");
                continue;
            }
            boolean fl=false;
            for(int i=0;i<=n/111;i++){
                int rem=n-(111*i);
                if(rem%11==0){
                    fl=true;
                    break;
                }
            }
            System.out.println(fl?"YES":"NO");
        }
    }
}
