package vector;

public class MyPoint {
    private double x;
    private double y;
    private double z;
    private static int numberOfObjects;
    public MyPoint(double x, double y,double z){
        this.x=x;
        this.y=y;
        this.z=z;
        numberOfObjects++;
    }
    public MyPoint(){
        this(0,0,0);
    }
    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }
    public double getZ() {
        return z;
    }
    public void setZ(double z) {
        this.z = z;
    }
    public static int getNumberOfObjects() {
        return numberOfObjects;
    }
    public double distance(double x,double y,double z){
        return Math.sqrt((this.x-x)*(this.x-x)+(this.y-y)*(this.y-y)+(this.z-z)*(this.z-z));
    }
    public double distance(MyPoint secondPoint){
        return this.distance(secondPoint.getX(),secondPoint.getY(),secondPoint.getZ());
    }
    public static double distance(MyPoint first,MyPoint second){
        return first.distance(second);
    }
    public static double distance(double x1,double y1,double z1,double x2,double y2,double z2){
        return MyPoint.distance(new MyPoint(x1,y1,z1),new MyPoint(x2,y2,z2));
    }
}
