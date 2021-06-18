package shape;
import supergraphic.MyPoint;
public class Circle extends Shape{
    protected double radius;
    public Circle(String color,MyPoint shapePoint,double radius){
        super(color,shapePoint);
        this.radius=radius;
    }
    public Circle(double radius){
        this.radius=radius;
    }
    public Circle(){
        radius=1;
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
    public double round(){
        return 2*Math.PI*radius;
    }
    public String shapeType(){
        return "形状：圆形"+" 颜色："+color+" 顶点坐标：("+shapePoint.getX()+" "+shapePoint.getY()+")";
    }
}
