package geometry;
public abstract class Geometry {
    private MyPoint center;
    protected Geometry(double x,double y){
        center=new MyPoint(x,y);
    }
    protected Geometry(MyPoint center){
        this.center=center;
    }
    protected MyPoint getCenter() {
        return center;
    }
    public abstract double perimeter();
    public abstract double area();
    public static double sumArray(Geometry[] g){//此方法显示了向上转型的一个作用???
        double sum=0;
        for(Geometry w:g){
            sum=sum+w.area();
        }
        return sum;
    }

}
