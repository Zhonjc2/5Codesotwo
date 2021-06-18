package octagon;
public abstract class Geometry {
    private MyPoint center;
    protected Geometry(double x, double y){
        center=new MyPoint(x,y);
    }
    protected Geometry(MyPoint center){
        this.center=center;
    }
    protected Geometry() {}
    protected MyPoint getCenter() {
        return center;
    }
    public abstract double perimeter();
    public abstract double area();
    public static double sumArray(Geometry[] g){//此方法显示了向上转型的一个作用???这个方法要求将不同子类中的area加起来，但是由于子类不同，因此加起来比较麻烦，而如果向上转型，子类转化为父类，并且子类都有重写过的area方法，这个时候就可以父类相加代替子类，引用时子类转化为父类，并引用子类的方法，便可以达到目的。
        double sum=0;
        for(Geometry w:g){
            sum=sum+w.area();
        }
        return sum;
    }
}
