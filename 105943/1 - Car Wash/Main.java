import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner obj=new Scanner (System.in);
        int x=obj.nextInt();
        int y=obj.nextInt();
        int z=obj.nextInt();
        int t=obj.nextInt();
        int v=obj.nextInt();
        System.out.println(Math.min(x,Math.min(y*t,z*v)));
    }
}
