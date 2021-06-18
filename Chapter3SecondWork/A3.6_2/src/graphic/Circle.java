package graphic;
public class Circle extends Graphic{
    protected double radius;
    public Circle(String color,double radius){
        super(color);
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
