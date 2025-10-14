import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        List<Integer>list=new ArrayList<>();
        StringTokenizer st=new StringTokenizer(br.readLine());
        while(st.hasMoreTokens()){
            list.add(Integer.parseInt(st.nextToken()));
        }
        int res=0;
        for(int i=0;i<list.size();i++){
            res+=list.get(i)*i;
        }
        System.out.println(res);
    }
}

