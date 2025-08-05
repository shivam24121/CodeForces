import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        int t=obj.nextInt();
        obj.nextLine();
        while(t-->0){
            String s=obj.nextLine();
            int n=s.length();
            String sb=s.substring(0,n-2);
            if(n==2){
                System.out.println("i");
            }
            else{
                System.out.println(sb+"i");
            }
        }
    }
}
