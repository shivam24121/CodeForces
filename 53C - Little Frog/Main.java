import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        
        int n=obj.nextInt();
        ArrayList<Integer>res=new ArrayList<>();
        int l=1,r=n;
        while(l<=r){
            res.add(l++);
            if(l<=r){
                res.add(r--);
            }
        }
        for(int i=0;i<res.size();i++){
            System.out.print(res.get(i)+" ");
        }
    }
}
