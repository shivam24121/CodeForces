import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s=br.readLine();
        String[] arr=s.split(",");
        Set<Integer>set=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            int num=Integer.parseInt(arr[i]);
            set.add(num);
        }
        ArrayList<Integer>list=new ArrayList<>(set);
        Collections.sort(list);
        
        StringBuilder sb=new StringBuilder();
        int st=list.get(0);
        int prev=list.get(0);
        
        for(int i=1;i<list.size();i++){
            int curr=list.get(i);
            if(curr==prev+1){
                prev=curr;
            }
            else{
                solve(sb,st,prev);
                sb.append(",");
                prev=curr;
                st=curr;
            }
        }
        solve(sb,st,prev);
        System.out.println(sb.toString());
        
    }
    public static void solve(StringBuilder sb,int l,int r){
        if(l==r)sb.append(l);
        else sb.append(l).append("-").append(r);
    }
}
