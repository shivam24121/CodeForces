import java.util.*;
import java.util.stream.*;
public class Main{
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        obj.nextLine();
        List<String> l=new ArrayList<>();
        while(n-->0){
            String s=obj.nextLine();
            l.add(s);
        }
        String res=l.stream()
        .sorted((a,b)->(a+b).compareTo(b+a))
        .collect(Collectors.joining());
        System.out.println(res);
    }
}
