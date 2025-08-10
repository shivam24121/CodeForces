import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        int t=obj.nextInt();
        obj.nextLine();
        while(t-->0){
            solve(obj);
        }
    }
    /* the max number of coin cannot exceed the total number of A
    we will look for the 3 windows of B
      1- from start to first occurance of B
      2- from one b to another B
      3- last B to last element of the String
    
    since the The answer=total A-smallest gap(since we can't use A from the smallest gap in any operation)*/
    
    public static void solve(Scanner obj){
        String s=obj.nextLine();
        int n=s.length();
        List<Integer> l=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='B'){
                l.add(i);
            }
        }
        if(l.isEmpty()){
            System.out.println(0);
            return;
        }
        int ct_a=0;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<=l.size();i++){
            int left=(i==0)?-1:l.get(i-1);
            int right=(i==l.size())?n:l.get(i);
            int gap=right-left-1;
            ct_a+=gap;
            if(min>gap)min=gap;
        }
        System.out.println(ct_a-min);
    }
}
