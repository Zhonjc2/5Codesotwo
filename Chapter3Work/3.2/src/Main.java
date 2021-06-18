import shape.*;
import supergraphic.MyPoint;
public class Main {
    public static void main(String[] args){
        Shape v1=new Shape("red",new MyPoint(0,0));
        Shape v2=new Square("blue",new MyPoint(1,1),5);
        Shape v3=new Rectangle("cyan",new MyPoint(2,2),2,4);
        Shape v4=new Circle("green",new MyPoint(3,3),7);
        Square v5=new Square("blue",new MyPoint(1,1),5);
        Rectangle v6=new Rectangle("cyan",new MyPoint(2,2),2,4);
        Circle v7=new Circle("green",new MyPoint(3,3),7);
        System.out.println(v1.shapeType());
        //v2.getA();
        System.out.println(v2.shapeType());
        //v3.getA();
        System.out.println(v3.shapeType());
        //v4.getRadius();
        System.out.println(v4.shapeType());
        System.out.println(v5.getA());
        System.out.println(v6.getA());
        System.out.println(v7.getRadius());
    }
}
