public class magic {
    public static void main(String[] args){
        int n=64;
        int sum=n;
        while (sum>9){
            int temp=sum;
            sum=0;
            while(n>0){
                sum=sum+n%10;
                temp=temp/10;
            }
        }
        if (sum==1)
            System.out.println("magic");
        else
            System.out.println("not magic");
    }
}
