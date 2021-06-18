package graphic;
public class Square extends Graphic{
    protected double a;
    public Square(String color,double a){
        super(color);
        this.a=a;
    }
    public double getA() {
        return a;
    }
    public void setA(double a) {
        this.a = a;
    }
    public double area(){
        return a*a;
    }
    public double perimeter(){
        return 4*a;
    }
}
