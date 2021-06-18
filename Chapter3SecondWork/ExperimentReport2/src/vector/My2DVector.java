package vector;

public class My2DVector extends MyVector implements Comparable<MyVector>{
    public My2DVector(MyPoint locationOfVector){
        super(locationOfVector);
        locationOfVector.setZ(0);
    }
    public My2DVector(double x,double y){
        this(new MyPoint(x,y,0));
    }
    public My2DVector(){
        this(0,0);
    }
    public double lengthOfVector(){
        return locationOfVector.distance(0,0,0);
    }
    public double multiplyVector(MyVector v2){
        double x1=locationOfVector.getX();
        double x2=v2.locationOfVector.getX();
        double y1=locationOfVector.getY();
        double y2=v2.locationOfVector.getY();
        return x1*x2+y1*y2;
    }
    public MyVector plusVector(MyVector v2){
        double x=locationOfVector.getX()+v2.locationOfVector.getX();
        double y=locationOfVector.getY()+v2.locationOfVector.getY();
        return new My2DVector(x,y);
    }
    public void showVector(){
        System.out.println("The Vector is 2D: ("+locationOfVector.getX()+","+locationOfVector.getY()+")");
    }
    public int compareTo(MyVector v2){
        if(lengthOfVector()>v2.lengthOfVector())return -1;
        else if(lengthOfVector()<v2.lengthOfVector())return 1;
        else return 0;
    }
}
