  public static void solve(int a,int b){
        if(a==b){
            System.out.println(0);
            return;
        }
        int aa=Integer.highestOneBit(a);
        int bb=Integer.highestOneBit(b);
        
        if(bb>aa){
            System.out.println(-1);
            return;
        }
        // max operation is 2
        
        // calc leading zeros
        else{
            int temp=a^b;
            if(temp<=a){
                System.out.println(1);
                System.out.println(temp);
            }
            
            else{
                int zero=31-Integer.numberOfLeadingZeros(a);
                int ops=(1<<(zero+1))-1;
                
                int step1=a^ops;
                int step2=b^ops;
                System.out.println(2);
                System.out.println(step1+" "+step2);
            }
        }
    }
}
