public static long solve(int n,int rk, int ck, int rd, int cd){
        long time=0;
        if(ck==cd){
            time=(rk<rd)?rd:n-rd;
        }
        else if(rk==rd){
            time=(ck>cd)?n-cd:cd;
        }
        else{
            if(rk<=rd)time=Math.max(time,rd);
            if(rk>=rd)time=Math.max(time,n-rd);
            if(ck<=cd)time=Math.max(time,cd);
            if(ck>=cd)time=Math.max(time,n-cd);
        }
        return time;
    }
}
