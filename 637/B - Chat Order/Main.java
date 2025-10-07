import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] atgs)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        List<String>l=new ArrayList<>();
        for(int i=0;i<n;i++){
            String s=br.readLine();
            l.add(s);
        }
        LinkedHashSet<String>set=new LinkedHashSet<>();
        for(String s:l){
            if(set.contains(s)){
                set.remove(s);
            }
            set.add(s);
        }
        ArrayList<String>res=new ArrayList<>(set);
        for(int i=res.size()-1;i>=0;i--){
            System.out.println(res.get(i));
        }
    }
}
