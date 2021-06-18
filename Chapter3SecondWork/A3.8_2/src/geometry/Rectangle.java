package geometry;
public class Rectangle extends Geometry{
    protected double a,b;
    public Rectangle(double x,double y,double a,double b) {
        super(x, y);
        this.a = a;
        this.b = b;
    }
    public Rectangle(MyPoint center,double a,double b) {
        /*this(center.getX(), center.getY(), a,b);*/
        super(center);
        this.a=a;
        this.b=b;
    }
    public double getA() {
        return a;
    }
    public void setA(double a) {
        this.a = a;
    }
    public double getB() {
        return b;
    }
    public void setB(double b) {
        this.b = b;
    }
    public double area(){
        return a*b;
    }
    public double perimeter(){
        return 2*(a+b);
    }
}
