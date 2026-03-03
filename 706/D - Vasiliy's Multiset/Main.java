import java.util.*;
import java.io.*;
public class Main{
    static class Node{
        Node left;
        Node right;
        int freq;
    }
    public static void insert(Node head,int n){
        Node root=head;
        for(int i=30;i>=0;i--){
            int bit=((n>>i)&1);
            if(bit==0){
                if(root.left==null){
                    root.left=new Node();
                }
                root=root.left;
            }
            else{
                if(root.right==null){
                    root.right=new Node();
                }
                root=root.right;
            }
            root.freq++;
        }
    }
    public static int find(Node head,int n){
        Node root=head;
        int res=0;
        for(int i=30;i>=0;i--){
            int bit=((n>>i)&1);
            if(bit==1){
                if(root.left!=null && root.left.freq>0){
                    root=root.left;
                    res+=(1<<i);
                }
                else{
                    root=root.right;
                }
            }
            else{
                if(root.right!=null && root.right.freq>0){
                    root=root.right;
                    res+=(1<<i);
                }
                else{
                    root=root.left;
                }
            }
        }
        return res;
    }
    public static void delete(Node head,int n){
        Node root=head;
        for(int i=30;i>=0;i--){
            int bit=((n>>i)&1);
            if(bit==1){
                root=root.right;
            }
            else{
                root=root.left;
            }
            root.freq--;
        }
    }
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        StringTokenizer st;
        Node root=new Node();
        insert(root,0);
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<n;i++){
            st=new StringTokenizer(br.readLine());
            char c=st.nextToken().charAt(0);
            int x=Integer.parseInt(st.nextToken());
            if(c=='?'){
                sb.append(find(root,x)).append("\n");
            }
            else if(c=='+'){
                insert(root,x);
            }
            else{
                delete(root,x);
            }
        }
        System.out.println(sb.toString());
    }
}
