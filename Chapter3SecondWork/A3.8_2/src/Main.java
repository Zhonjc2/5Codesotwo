import geometry.*;
public class Main {
    public static void main(String[] args){
        Geometry v1=new Circle(2,3,5);
        Geometry v2=new Rectangle(new MyPoint(5,7),8,9);
        Geometry v3=new Triangle(3,1,3,4,5);
        Geometry v4=new Triangle(1,0,6,8,10);
        System.out.print(Geometry.sumArray(new Geometry[]{v1, v2, v3, v4}));
    }
}
