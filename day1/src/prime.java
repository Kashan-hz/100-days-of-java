public class prime {
    public static void main(String[] args){
        int i ;
        int num;

        for(i=1;i<100;i++){
            int c=0;
            for(num=i;num>=1;num--){
                if(i%num==0){
                    c+=1;
                }
            }
            if(c==2){
                System.out.println(i);

            }
        }

    }
}