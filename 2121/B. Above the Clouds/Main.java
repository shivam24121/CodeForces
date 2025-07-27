import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        int t=obj.nextInt();
        obj.nextLine();
        while(t-->0){
            int n=obj.nextInt();
            obj.nextLine();
            String s=obj.nextLine();
            boolean[] visited=new boolean[26];
            visited[s.charAt(0)-'a']=true;
            visited[s.charAt(n-1)-'a']=true;
            boolean fl=false;
            for(int i=1;i<n-1;i++){
                int ch=s.charAt(i)-'a';
                if(visited[ch]){
                    fl=true;
                    break;
                }
                visited[ch]=true;
            }
            System.out.println(fl?"YES":"NO");
        }
    }
}
