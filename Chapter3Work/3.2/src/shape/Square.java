package shape;
import supergraphic.MyPoint;
public class Square extends Shape{
	protected double a;
	public Square(String color, MyPoint shapePoint, double a){
		super(color,shapePoint);
		this.a=a;
	}
	public Square(double a){
		this.a=a;
	}
	public Square(){}
	public double getA(){
		return a;
	}
	public void setA(double a){
		this.a=a;
	}
	public double area(){
		return a*a;
	}
	public static double area(double a){
		return a*a;
	}
	public double round(){
		return 4*a;
	}
	public static double round(double a){
		return 4*a;
	}
	public String shapeType(){
		return "形状：正方形"+" 颜色："+color+" 顶点坐标：("+shapePoint.getX()+" "+shapePoint.getY()+")";
	}
}