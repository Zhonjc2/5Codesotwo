package geometry;
public class Circle extends Geometry{
    protected double radius;
    public Circle(double x,double y,double radius){
        super(x,y);
        this.radius=radius;
    }
    public Circle(MyPoint center,double radius){
        /*this(center.getX(),center.getY(),radius);*/
        super(center);
        this.radius=radius;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double area(){
        return Math.PI*radius*radius;
    }
    public double perimeter(){
        return 2*Math.PI*radius;
    }
}
