import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int m=obj.nextInt();
        int min=Math.min(m,n);
        System.out.println(min%2==1?"Akshat":"Malvika");
    }
}
