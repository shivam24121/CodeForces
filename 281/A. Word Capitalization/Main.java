import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        String s=obj.nextLine();
        String res=Character.toUpperCase(s.charAt(0))+s.substring(1);
        System.out.println(res);
    }
}
