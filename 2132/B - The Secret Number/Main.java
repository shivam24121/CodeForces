import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        int t=obj.nextInt();
        while(t-->0){
            long n=obj.nextLong();
            List<Long> l=solve(n);
            if(l.isEmpty()){
                System.out.println(0);
            }
            else{
                System.out.println(l.size());
                for(int i=0;i<l.size();i++){
                    System.out.print(l.get(i)+" ");
                }
                System.out.println();
            }
        }
    }
    
    //   n=x+y
    //   y=x*10 pow k
    //   n=x+x*10 pow k
    //   n=x(1+10 pow k)
    //   x=n/(1+10 pow k)
    
    
    public static ArrayList<Long> solve(long n){
        ArrayList<Long> res=new ArrayList<>();
        long a=10;
        for(int i=1;i<=18;i++){
            long sum=a+1;
            if(n%sum==0){
                res.add(n/sum);
            }
            if(i<18){
                a*=10;
            }
        }
        Collections.sort(res);
        return res;
    }
}
