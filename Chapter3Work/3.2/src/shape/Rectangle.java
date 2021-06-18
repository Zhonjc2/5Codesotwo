package shape;
import supergraphic.MyPoint;
public class Rectangle extends Shape{
   protected double a;
   protected double b;
   public Rectangle(String color,MyPoint shapePoint,double a,double b){
      super(color,shapePoint);
      this.a=a;
      this.b=b;
   }
   public Rectangle(double a,double b){
      this(null,null,a,b);
   }
   public Rectangle(){
      this(1,1);
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
   public double round(){
      return 2*a+2*b;
   }
   public String shapeType(){
      return "形状：矩形"+" 颜色："+color+" 顶点坐标：("+shapePoint.getX()+" "+shapePoint.getY()+")";
   }
}
