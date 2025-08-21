import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        int t=obj.nextInt();
        while(t-->0){
            int n=obj.nextInt();
            obj.nextLine();
            String a=obj.nextLine();
            int m=obj.nextInt();
            obj.nextLine();
            String b=obj.nextLine();
            String c=obj.nextLine();
            StringBuilder sb=new StringBuilder();
            sb.append(a);
            for(int i=0;i<m;i++){
                if(c.charAt(i)=='D'){
                    sb.append(b.charAt(i));
                }
                else{
                    sb.insert(0,b.charAt(i));
                }
            }
            System.out.println(sb.toString());
        }
    }
}
