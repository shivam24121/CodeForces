import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        int t=obj.nextInt();
        obj.nextLine();
        while(t-->0){
            StringBuilder sb=new StringBuilder();
            for(int i=0;i<8;i++){
                String s=obj.nextLine();
                for(int j=0;j<8;j++){
                    char c=s.charAt(j);
                    if(c>=97 && c<=122){
                        sb.append(c);
                    }
                }
            }
            System.out.println(sb);
        }
    }
}
