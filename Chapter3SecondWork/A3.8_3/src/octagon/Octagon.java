package octagon;
public class Octagon extends Geometry implements Comparable<Octagon>,Cloneable{
    protected double a;
    public Octagon(double x,double y,double a) {
    	super(x,y);
    	this.a=a;
    }
	public double getA() {
		return a;
	}
	public void setA(double a) {
		this.a = a;
	}
    public double perimeter() {
    	return 8*a;
    }
    public double area() {
    	return (2+4/Math.sqrt(2))*a*a;
    }
    public int compareTo(Octagon a) {
    	if(this.area()>a.area())return 1;
    	else if(this.area()<a.area())return -1;
    	else return 0;
    }
    public Object clone() throws CloneNotSupportedException{
    	return super.clone();
    }
    public String toString() {
    	return "此正八边形边长为"+a+" 周长为"+perimeter()+" 面积为"+area();
    }
    public static void main(String[] args) throws CloneNotSupportedException{
    	Octagon v1=new Octagon(1,1,1);
    	Octagon v2=(Octagon)v1.clone();
    	System.out.println(v2.area());
    }
}