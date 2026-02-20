public class happy {
    public static void main(String[] args){
        int num=19;
        int temp=num;
        while(temp!=1 && temp!=4){
            int sum=0;
            while(temp>0){
                int digit=temp%10;
                sum=sum+ digit*digit;
                temp=temp/10;
            }
            temp=sum;
            if(sum==1)
                System.out.println("happy");
            else
                System.out.println("not happy");
        }

    }
}
