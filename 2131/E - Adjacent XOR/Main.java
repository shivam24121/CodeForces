import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        int t=obj.nextInt();
        while(t-->0){
            int n=obj.nextInt();
            int[] a=new int[n];
            int[] b=new int[n];
            for(int i=0;i<n;i++){
                a[i]=obj.nextInt();
            }
            for(int i=0;i<n;i++){
                b[i]=obj.nextInt();
            }
            System.out.println(solve(a,b)?"YES":"NO");
        }
    }
    /* we cannot perform any ops on last index so agar a[n-1]!=b[n-1] then return false
       else 
       if a[i]=b[i] correct
       else if a[i]^a[i+1]=b[i]  correct again 
       ya phir chaining se like perform ops on i+1 with i+2 and store it in i+1 and then perform ops on i 
       aur ha performing on i+1 and i+2 of a will make a[i+1]=b[i+1];
       so ultimately we are doing ops on a[i]^b[i+1]   --yeh yaad rakhna aage se*/
       // additionally start loop fron n-2 to 0 kyoki we are checking chaining (condition 3)
    
    public static boolean solve(int[] a,int[] b){
        int n=b.length;
        if(a[n-1]!=b[n-1])return false;
        for(int i=n-2;i>=0;i--){
            if(a[i]==b[i] || (a[i]^a[i+1])==b[i] || (a[i]^b[i+1])==b[i]){
                continue;
            }
            else{
                return false;
            }
            
        }
        return true;
    }
}
