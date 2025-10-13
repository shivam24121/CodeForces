import java.util.*;
import java.io.*;
import java.util.stream.*;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        StringTokenizer st=new StringTokenizer(br.readLine());
        List<Integer>list=new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(Integer.parseInt(st.nextToken()));
        }
        
        List<Integer>even=list.stream()
                              .filter(i->(i&1)==0)
                              .collect(Collectors.toList());
        
        List<Integer>odd=list.stream()
                             .filter(i->(i&1)==1)
                             .collect(Collectors.toList());
                             
        if(odd.size()==1){
            int temp=odd.get(0);
            System.out.println(list.indexOf(temp)+1);
        }
        else{
            int temp=even.get(0);
            System.out.println(list.indexOf(temp)+1);
        }
    }
}
