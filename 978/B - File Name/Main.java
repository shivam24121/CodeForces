import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        obj.nextLine();
        String s=obj.nextLine();
        System.out.println(solve(n,s));
    }
    private static int solve(int n,String s){
        if(!s.contains("xxx")){
            return 0;
        }
        int ct=0,res=0;
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='x'){
                ct++;
                if(ct>2){
                    res++;
                }
            }
            else{
                ct=0;
            }
        }
        return res;
    }
}
