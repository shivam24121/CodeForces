import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        int t=obj.nextInt();
        while(t-->0){
            int a=obj.nextInt();
            int b=obj.nextInt();
            if(a%2==1){
                System.out.println("no");
            }
            else if(b%2==0){
                System.out.println("yes");
            }
            else if(a>=2){
                System.out.println("yes");
            }
            else{
                System.out.println("no");
            }
        }
    }
}
