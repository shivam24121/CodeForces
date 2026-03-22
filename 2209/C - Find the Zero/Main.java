import java.util.*;
public class Main{
    static Scanner obj=new Scanner(System.in);
    public static void main(String[] args){
        int t=obj.nextInt();
        while(t-->0){
            int n=obj.nextInt();
            boolean fl=false;
            int i=1;
            while(i<=(2*n-5)){
                int result=ask(i,i+1);
                if(result==1){
                    ans(i);
                    fl=true;
                    break;
                }
                i+=2;
            }
            
            if(fl)continue;
            
            if(ask(i,i+1)==1){
                ans(i);
                continue;
            }
            else if(ask(i,i+2)==1){
                ans(i);
                continue;
            }
            else if(ask(i+1,i+2)==1){
                ans(i+1);
                continue;
            }
            else{
                ans(i+3);
                continue;
            }
        }
    }
    public static int ask(int i,int j){
        System.out.println("? "+i+" "+j);
        System.out.flush();
        int response=obj.nextInt();
        if(response==-1){
            System.exit(0);
        }
        return response;
    }
    public static void ans(int res){
        System.out.println("! "+res);
        System.out.flush();
    }
}
