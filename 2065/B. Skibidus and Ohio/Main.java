import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        int t=obj.nextInt();
        obj.nextLine();
        while(t-->0){
            String s=obj.nextLine();
            boolean fl=false;
            for(int i=1;i<s.length();i++){
                if(s.charAt(i)==s.charAt(i-1)){
                    fl=true;
                    break;
                }
                else{
                    fl=false;
                }
            }
            System.out.println(fl?"1":s.length());
        }
    }
}
