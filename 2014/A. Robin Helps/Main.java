import java.util.*;
public class Main{
    public static void main(String [] args){
        Scanner obj=new Scanner(System.in);
        int t=obj.nextInt();
        while(t-->0){
            int n=obj.nextInt();
            int k=obj.nextInt();
            int [] arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=obj.nextInt();
            }
            int gold=0,res=0;
            for(int i=0;i<n;i++){
                if(arr[i]>=k){
                    gold+=arr[i];
                }
                else if(arr[i]==0 && gold!=0){
                    gold--;
                    res++;
                }
            }
            System.out.println(res);
            
        }
    }
}
