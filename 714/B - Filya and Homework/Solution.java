import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        int[] a=new int[n];
        Set<Integer>set=new HashSet<>();
        StringTokenizer st=new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
            a[i]=Integer.parseInt(st.nextToken());
            set.add(a[i]);
        }
        if(set.size()<=2){
            System.out.println("YES");
            return;
        }
        if(set.size()>3){
            System.out.println("NO");
            return;
        }
        ArrayList<Integer>list=new ArrayList<>(set);
        Collections.sort(list);
        if((list.get(1)-list.get(0))==(list.get(2)-list.get(1))){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
    
}
