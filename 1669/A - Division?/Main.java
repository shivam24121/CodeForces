import java.util.Scanner;
public class Main{
    public static void main(String[] arg){
        Scanner obj=new Scanner(System.in);
        int t=obj.nextInt();
        while(t-->0){
            solve(obj);
        }
    }
    public static void solve(Scanner obj){
        int n=obj.nextInt();
        if(n<1400){
            System.out.println("Division 4");
        }
        else if(n<1600){
            System.out.println("Division 3");
        }
        else if(n<1900){
            System.out.println("Division 2");
        }
        else{
            System.out.println("Division 1");
        }
    }
}
