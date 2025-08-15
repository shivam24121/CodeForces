import java.util.*;
import java.util.stream.*;
public class Main{
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        long n=obj.nextLong();
        long solve=(n&1)==0?n/2:-(n+1)/2;
        System.out.println(solve);
    }
}
