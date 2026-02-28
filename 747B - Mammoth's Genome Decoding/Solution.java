import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        String s=obj.next();
        int[] acgt=new int[4];
        for(int i=0;i<n;i++){
            char c=s.charAt(i);
            if(c=='A'){
                acgt[0]++;
            }
            else if(c=='C'){
                acgt[1]++;
            }
            else if(c=='G'){
                acgt[2]++;
            }
            else if(c=='T'){
                acgt[3]++;
            }
        }
        int max=0;
        for(int i=0;i<4;i++){
            max=Math.max(max,acgt[i]);
        }
        if(n%4!=0 || max>(n/4)){
            System.out.println("===");
            return;
        }
        int target=n/4;
        int idx=0;
        for(int i=0;i<4;i++){
            acgt[i]=target-acgt[i];
        }
        StringBuilder sb=new StringBuilder(s);
        for(int i=0;i<sb.length();i++){
            if(sb.charAt(i)!='?')continue;
            while(idx<4 && acgt[idx]==0)idx++;
            if(idx==4)break;
            char val=idx==0?'A':idx==1?'C':idx==2?'G':'T';
            sb.setCharAt(i,val);
            acgt[idx]--;
        }
        System.out.println(sb.toString());
    }
    
}
