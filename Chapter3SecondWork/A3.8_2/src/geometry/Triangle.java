package geometry;
public class Triangle extends Geometry{
    protected double a,b,c;
    public Triangle(double x,double y,double a,double b,double c){
        super(x,y);
        if(((a+b)>c)&&((a+c)>b)&&((b+c)>a)){
            this.a=a;
            this.b=b;
            this.c=c;
        }else System.out.println("这不是三角形");
    }
    public Triangle(MyPoint center,double a,double b,double c){
        this(center.getX(),center.getY(),a,b,c);
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
    public double getC() {
        return c;
    }
    public void setC(double c) {
        this.c = c;
    }
    public double perimeter(){
        return a+b+c;
    }
    public double area(){
        double p=0.5*(perimeter());
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }
}
