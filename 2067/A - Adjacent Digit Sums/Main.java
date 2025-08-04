import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        int t=obj.nextInt();
        while(t-->0){
            int x=obj.nextInt();
            int y=obj.nextInt();
            int diff=x-y+1;
            if(x+1>=y && diff%9==0){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
        
    }
}
