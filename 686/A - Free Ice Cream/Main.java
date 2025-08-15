import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        long ice=obj.nextLong();
        int upset=0;
        while(n-->0){
            String c=obj.next();
            int change=obj.nextInt();
            if(c.equals("+")){
                ice+=change;
            }
            else{
                if(ice>=change){
                    ice-=change;
                }
                else{
                    upset++;
                }
            }
        }
        System.out.println(ice+" "+upset);
    }
}
