public class Rectangle {
    int length;
    int breadth;

    Rectangle(int length, int breadth){
        this.length=length;
        this.breadth=breadth;

    }
   int area(){
        return length*breadth;
    }
   int perimeter(){
        return 2*(length+breadth);
   }
}
class Main{
    public static void main(String[] args){
        Rectangle r= new Rectangle(3,2);
        System.out.println(r.area());
        System.out.println(r.perimeter());

    }
}
