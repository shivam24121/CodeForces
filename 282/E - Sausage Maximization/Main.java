import java.util.*;
import java.io.*;
public class Sausage {
    static class Node{
        Node left;
        Node right;
    }
    static void insert(Node temp,long n){
        Node root=temp;
        for(int i=42;i>=0;i--){
            int bit=(int)((n>>i)&1);

            if(bit==1){
                if(root.right==null){
                    root.right=new Node();
                }
                root=root.right;
            }
            else{
                if(root.left==null){
                    root.left=new Node();
                }
                root=root.left;
            }
        }
    }
    public static long search(Node temp,long n){
        Node root=temp;
        long res=0;

        for(int i=42;i>=0;i--){
            int bit=(int)((n>>i)&1);
            if(bit==1){
                if(root.left!=null){
                    root=root.left;
                    res+=(1L<<i);
                }
                else{
                    root=root.right;
                }
            }
            else{
                if(root.right!=null){
                    root=root.right;
                    res+=(1L<<i);
                }
                else{
                    root=root.left;
                }
            }
        }
        return res;
    }
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        StringTokenizer st=new StringTokenizer(br.readLine());
        long[] a=new long[n];
        for(int i=0;i<n;i++){
            a[i]=Long.parseLong(st.nextToken());
        }
        Node root=new Node();
        insert(root,0L);

        long[] prefix=new long[n];
        prefix[0]=a[0];
        for(int i=1;i<n;i++){
            prefix[i]=prefix[i-1]^a[i];
        }
        long res=0;
        long suffix=0;
        for(int i=0;i<n;i++){
            insert(root,prefix[i]);
        }
        for(int i=n-1;i>=0;i--){
            suffix^=a[i];
            res=Math.max(search(root,suffix),res);
        }
        System.out.println(res);
    }
}
