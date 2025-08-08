import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        int t=obj.nextInt();
        obj.nextLine();
        while(t-->0){
            String s=obj.nextLine();
            int ct=0;
            for(int i=0;i<s.length();i++){
                if(i==0 || s.charAt(i)!= s.charAt(i-1)){
                    ct++;
                }
            }
            if(s.contains("01"))ct--;
            
            System.out.println((ct));
        }
    }
}
