import java.util.*;
import java.io.*;
public class Reactange {
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        while(t-->0){
            int n=Integer.parseInt(br.readLine());
            ArrayList<Integer>x=new ArrayList<>();
            ArrayList<Integer>y=new ArrayList<>();
            StringTokenizer st;

            for(int i=0;i<n;i++){
                st=new StringTokenizer(br.readLine());
                int x_cod=Integer.parseInt(st.nextToken());
                int y_cod=Integer.parseInt(st.nextToken());
                x.add(x_cod);
                y.add(y_cod);
            }
            if(n<=1){
                System.out.println("1");
                continue;
            }
            int xMin=Integer.MAX_VALUE,sxMin=Integer.MAX_VALUE;
            int xMax=Integer.MIN_VALUE,sxMax=Integer.MIN_VALUE;
            int yMax=Integer.MIN_VALUE,syMin=Integer.MAX_VALUE;
            int yMin=Integer.MAX_VALUE,syMax=Integer.MIN_VALUE;
            int ctXmin=0,ctXmax=0;
            int ctYmin=0,ctYmax=0;

            for(int i:x){
                if(i>xMax){
                    sxMax=xMax;
                    xMax=i;
                    ctXmax=1;
                }
                else if(i==xMax){
                    ctXmax++;
                }
                else if(i>sxMax){
                    sxMax=i;
                }

                if(i<xMin){
                    sxMin=xMin;
                    xMin=i;
                    ctXmin=1;
                }
                else if(i==xMin){
                    ctXmin++;
                }
                else if(i<sxMin){
                    sxMin=i;
                }
            }

            for(int i:y){
                if(i>yMax){
                    syMax=yMax;
                    yMax=i;
                    ctYmax=1;
                }
                else if(i==yMax){
                    ctYmax++;
                }
                else if(i>syMax){
                    syMax=i;
                }

                if(i<yMin){
                    syMin=yMin;
                    yMin=i;
                    ctYmin=1;
                }
                else if(i==yMin){
                    ctYmin++;
                }
                else if(i<syMin){
                    syMin=i;
                }
            }
            long res=Long.MAX_VALUE;

            for(int i=0;i<n;i++){
                int x_cod=x.get(i);
                int y_cod=y.get(i);

                int xh=(x_cod==xMax && ctXmax==1)?sxMax:xMax;
                int xl=(x_cod==xMin && ctXmin==1)?sxMin:xMin;
                int yh=(y_cod==yMax && ctYmax==1)?syMax:yMax;
                int yl=(y_cod==yMin && ctYmin==1)?syMin:yMin;

                long area=1L*(xh-xl+1)*(yh-yl+1);

                if(area>n-1){
                    res=Math.min(res,area);
                }
                else{
                    if((xh-xl)>(yh-yl)){
                        res=Math.min(res,area+(yh-yl+1));
                    }
                    else{
                        res=Math.min(res,area+(xh-xl+1));
                    }
                }
            }
            System.out.println(res);
        }
    }
}
