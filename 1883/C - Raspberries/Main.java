import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        int t=obj.nextInt();
        while(t-->0){
            int n=obj.nextInt();
            int k=obj.nextInt();
            int[] a=new int[n];
            for(int i=0;i<n;i++){
                a[i]=obj.nextInt();
            }
            solve(obj,n,k,a);
        }
    }
    /* four cases possible for the given value of k ie 2,3,4,5
       maintain one even element count variable 
       if any element is divisible by k then ans is 0
       else if find ki woh element k is kitna far hai like eg k=4 and a[i]=3 
       then k-a[i]%k=1 and keep storing it in res 
       yeh hamare k=2,3,5 (prime) ko coven kr lega 
       apart from this special case k==4 , 
       in this if even ct is>=2 then res=0
       else if even ct=1 then ans is 1 kyoki we can add 1 in any odd element and get even ct=2
       else eg k=4 and a={1,5,7} so instead of increasing 1 two times in 1 and 5 just add 1 in 7 and make it
       divisible by 4 (isme hme woh k-a[i]%k ka min help karega)*/
       
    public static void solve(Scanner obj,int n, int k,int[] a){
        int even=0,res=k;
        for(int i=0;i<n;i++){
            if(a[i]%2==0){
                even++;
            }
            if(a[i]%k==0){
                res=0;
            }
            else{
                res=Math.min(res,k-(a[i]%k));
            }
            if(k==4){
                if(even>=2)res=0;
                else if(even==1)res=Math.min(res,1);
                else res=Math.min(res,2);
            }
        }
        System.out.println(res);
    }
}
