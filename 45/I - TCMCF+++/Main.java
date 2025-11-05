import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        ArrayList<Integer>pos=new ArrayList<>();
        ArrayList<Integer>neg=new ArrayList<>();
        StringTokenizer st=new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
            int x=Integer.parseInt(st.nextToken());
            if(x>0){
                pos.add(x);
            }
            else if(x<0){
                neg.add(-x);
            }
        }
        for(int i=0;i<pos.size();i++){
            System.out.print(pos.get(i)+" ");
        }
        Collections.sort(neg);
        for(int i=0;i<neg.size()-1;i++){
            System.out.print("-"+neg.get(i)+" ");
        }
        if(!neg.isEmpty() && neg.size()%2==0){
            System.out.print(neg.get(neg.size()-1));
        }
        if(pos.size()==0 && neg.size()==0){
            System.out.print("0");
        }
        System.out.println();
    }
}
