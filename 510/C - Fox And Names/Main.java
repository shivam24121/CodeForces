import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        
        int n=Integer.parseInt(br.readLine());
        String[] str=new String[n];
        
        for(int i=0;i<n;i++){
            str[i]=br.readLine();
        }
        Integer temp=null;
        boolean fl=true;
        
        ArrayList<ArrayList<Integer>>adj=new ArrayList<>();
        for(int i=0;i<26;i++){
            adj.add(new ArrayList<>());
        }
        for(int x=1;x<n;x++){
            
            String a=str[x-1];
            String b=str[x];
            
            int i=0;
            int j=0;
            
            while(i<a.length() && j<b.length() && a.charAt(i)==b.charAt(j)){
                i++;
                j++;
            }
            
            // if(x==1){
            //     temp=a.charAt(i)-'a';
            // }
            
            if(a.length()>b.length() && j==b.length()){
                fl=false;
                break;
            }
            if(i<a.length() && j<b.length()){
                adj.get(a.charAt(i)-'a').add(b.charAt(j)-'a');
            }
        }
    
        if(!fl){
            System.out.println("Impossible");
            return;
        }
        
        ArrayList<Character>res=new ArrayList<>();
        boolean[] vis=new boolean[26];
        boolean[] inRec=new boolean[26];
        
        boolean cycle=solve(temp,vis,adj,inRec,res);
        for(int i=0;i<26;i++){
            if(vis[i]==false){
                if(solve(i,vis,adj,inRec,res)){
                    System.out.println("Impossible");
                    return;
                }
            }
        }
        Collections.reverse(res);
        for(int i=0;i<26;i++){
            System.out.print(res.get(i));
        }
        System.out.println();
 
    }
    public static boolean solve(int u,boolean[] vis,ArrayList<ArrayList<Integer>>adj,boolean[] inRec,ArrayList<Character>res){
        
        vis[u]=true;
        inRec[u]=true;
        
        for(int neigh:adj.get(u)){
            if(!vis[neigh]){
                if(solve(neigh,vis,adj,inRec,res)){
                    return true;
                }
            }
            else if(inRec[neigh]){
                return true;
            }
        }
        
        inRec[u]=false;
        res.add((char)(u+'a'));
        return false;
    }
}
