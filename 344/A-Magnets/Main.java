import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        String[] magnet=new String[n];
        for(int i=0;i<n;i++){
            magnet[i]=obj.next();
        }
        int ct=1;
        for(int i=1;i<n;i++){
            if(!magnet[i].equals(magnet[i-1])){
            ct++;
            }
        }
        System.out.println(ct);
    }
}
