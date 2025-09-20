import java.util.*;
import java.io.*;
public class Main{
    public static void main (String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s=br.readLine();
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(!st.isEmpty() && st.peek()==c){
                st.pop();
            }
            else{
                st.push(c);
            }
        }
        StringBuilder sb=new StringBuilder();
        for(char c:st){
            sb.append(c);
        }
        System.out.println(sb.toString());
    }
}
