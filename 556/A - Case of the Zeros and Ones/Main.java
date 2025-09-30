import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        String s=br.readLine();
        Stack<Character>st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(!st.isEmpty() && c!=st.peek()){
                st.pop();
            }
            else{
                st.push(c);
            }
        }
        System.out.println(st.size());
    }
}
