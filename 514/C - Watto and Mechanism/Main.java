import java.io.*;
import java.util.*;

public class Trie {

    static class Node{
        Node[] child;
        boolean eow;

        Node(){
            child=new Node[3];
        }
    }
    static Node top=new Node();

    public static void built(String s){
        Node root=top;

        for(int i=0;i<s.length();i++){
            int idx=s.charAt(i)-'a';

            if(root.child[idx]==null){
                root.child[idx]=new Node();
            }
            root=root.child[idx];
        }
        root.eow=true;
    }
    public static boolean search(String s,boolean fl,int idx,Node root){
        if(root==null)return false;

        if(idx==s.length()){
            return fl && root.eow;
        }
        int pos=s.charAt(idx)-'a';

        if(search(s,fl,idx+1,root.child[pos])){
            return true;
        }
        if(!fl){
            for(int i=0;i<3;i++){
                if(i==pos)continue;
                if(root.child[i]!=null){
                    if(search(s,!fl,idx+1,root.child[i])){
                        return true;
                    }
                }
            }
        }
        return false;
    }
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        StringBuilder sb=new StringBuilder();

        int n=Integer.parseInt(st.nextToken());
        int m=Integer.parseInt(st.nextToken());

        for(int i=0;i<n;i++){
            String s=br.readLine();
            built(s);
        }
        for(int i=0;i<m;i++){
            String s=br.readLine();
            if(search(s,false,0,top)){
                sb.append("YES"+" \n");
            }
            else{
                sb.append("NO"+"\n");
            }
        }
        System.out.println(sb.toString());
    }
}
