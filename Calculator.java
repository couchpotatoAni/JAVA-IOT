public class Calculator {
    static int add(int a, int b){
        return a+b;
    }
    static int sub(int a , int b){
        return a-b;
    }
    static int mul(int a, int b){
        return a*b;
    }
    static int div(int a, int b){
        return a/b;
    }
    public static void main(String[] args){
        int a=10;
        int b=5;
        int res=add(a,b);
        int res1=sub(a,b);
        int res2=mul(a,b);
        int res3=div(a,b);
        System.out.println(res);
        System.out.println(res1);
        System.out.println(res2);
        System.out.println(res3);
    }
}
