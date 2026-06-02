import java.util.*;
import java.io.*;

public class FIFA {
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        Map<String,Integer>map=new HashMap<>();
        Map<String,Integer>gd=new HashMap<>();
        Map<String,Integer>gf=new HashMap<>();

        int n=Integer.parseInt(br.readLine());
        int match=n*(n-1)/2;

        for(int i=0;i<n;i++){
            String s=br.readLine();
            map.put(s,0);
        }
        for(int i=0;i<match;i++){

            st=new StringTokenizer(br.readLine());
            String a=st.nextToken();
            String b=st.nextToken();

            String[] team=a.split("-");
            String[] score=b.split(":");

            team[0]=team[0].trim();
            team[1]=team[1].trim();

            int[] goal=new int[score.length];
            goal[0]=Integer.parseInt(score[0]);
            goal[1]=Integer.parseInt(score[1]);

            String teamA=team[0];
            String teamB=team[1];

            int gba=goal[0];
            int gbb=goal[1];

            gd.put(teamA,gd.getOrDefault(teamA,0)+gba-gbb);
            gd.put(teamB,gd.getOrDefault(teamB,0)+gbb-gba);

            gf.put(teamA,gf.getOrDefault(teamA,0)+gba);
            gf.put(teamB,gf.getOrDefault(teamB,0)+gbb);

            if(goal[0]==goal[1]){
                map.put(team[0],map.getOrDefault(team[0],0)+1);
                map.put(team[1],map.getOrDefault(team[1],0)+1);
            }
            else if(goal[0]>goal[1]){
                map.put(team[0],map.getOrDefault(team[0],0)+3);
            }
            else{
                map.put(team[1],map.getOrDefault(team[1],0)+3);
            }
        }
        ArrayList<Map.Entry<String,Integer>>list=new ArrayList<>(map.entrySet());
        Collections.sort(list,(x,y)->{
            if(x.getValue().equals(y.getValue())){

                if(gd.get(x.getKey())==gd.get(y.getKey())){

                    return Integer.compare(gf.get(y.getKey()),gf.get(x.getKey()));
                }
                return Integer.compare(gd.get(y.getKey()),gd.get(x.getKey()));

            }
            return y.getValue()-x.getValue();
        });
        ArrayList<String>res=new ArrayList<>();

        for(int i=0;i<n/2;i++){
            res.add(list.get(i).getKey());
        }
        Collections.sort(res);

        for(String str:res){
            System.out.println(str);
        }
//        System.out.println();
//        System.out.println(map);
//        System.out.println(gd);
//        System.out.println(gf);
    }
}
