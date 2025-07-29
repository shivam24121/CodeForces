import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        int t=obj.nextInt();
        while(t-->0){
            int k=obj.nextInt();
            if((k & 1)==1){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
