import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int[] a=new int[7];
        
        for(int i=0;i<7;i++){
            a[i]=obj.nextInt();
        }
        
        int curr=0;
        while(n>0){
            n-=a[curr];
            if(n<=0){
                System.out.println(curr+1);
                return;
            }
            curr=(curr+1)%7;
        }
    }
}
