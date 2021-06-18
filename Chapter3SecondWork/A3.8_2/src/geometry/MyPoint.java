package geometry;
public class MyPoint {
    private double x;
    private double y;
    private static int numberOfObjects;
    public MyPoint(double x,double y){
        this.x=x;
        this.y=y;
        numberOfObjects++;
    }
    public MyPoint(){
        this(0,0);
    }
    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }
    public static int getNumberOfObjects() {
        return numberOfObjects;
    }
    public double distance(double x,double y){
        return Math.sqrt((this.x-x)*(this.x-x)+(this.y-y)*(this.y-y));
    }
    public double distance(MyPoint secondPoint){
        return this.distance(secondPoint.getX(),secondPoint.getY());
    }
    public static double distance(MyPoint first,MyPoint second){
        return first.distance(second);
    }
    public static double distance(double x1,double y1,double x2,double y2){
        return MyPoint.distance(new MyPoint(x1,y1),new MyPoint(x2,y2));
    }
}
