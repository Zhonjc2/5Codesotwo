package shape;
import supergraphic.MyPoint;
public class Shape{
    protected String color;
    protected MyPoint shapePoint;
    public Shape(String color,MyPoint shapePoint){
        this.color=color;
        this.shapePoint=shapePoint;
    }
    public Shape(){}
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color=color;
    }
    public MyPoint getMyPoint(){
        return shapePoint;
    }
    public void setShapePoint(MyPoint shapePoint){
        this.shapePoint=shapePoint;
    }
    public String shapeType(){
        return "形状：不规则"+" 颜色："+color+" 顶点坐标：("+shapePoint.getX()+" "+shapePoint.getY()+")";
    }
}
