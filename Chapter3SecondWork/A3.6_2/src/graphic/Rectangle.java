package graphic;
public class Rectangle extends Graphic{
    protected double a,b;
    public Rectangle(String color,double a,double b){
        super(color);
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
