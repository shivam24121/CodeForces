import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        Map<String,Integer> map=new HashMap<>();
        map.put("Tetrahedron",4);
        map.put("Cube",6);
        map.put("Octahedron",8);
        map.put("Dodecahedron",12);
        map.put("Icosahedron",20);
        int n=Integer.parseInt(br.readLine());
        int res=0;
        for(int i=0;i<n;i++){
            String s=br.readLine();
            res+=map.get(s);
        }
        System.out.println(res);
    }
}
