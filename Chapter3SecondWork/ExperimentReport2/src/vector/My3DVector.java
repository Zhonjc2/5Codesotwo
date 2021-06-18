package vector;

public class My3DVector extends MyVector implements Comparable<MyVector>{
    public My3DVector(MyPoint locationOfVector){
        super(locationOfVector);
    }
    public My3DVector(double x,double y,double z){
        this(new MyPoint(x,y,z));
    }
    public My3DVector(){
        this(0,0,0);
    }
    public double lengthOfVector(){
        return locationOfVector.distance(0,0,0);
    }
    public double multiplyVector(MyVector v2){
        double x1=locationOfVector.getX();
        double x2=v2.locationOfVector.getX();
        double y1=locationOfVector.getY();
        double y2=v2.locationOfVector.getY();
        double z1=locationOfVector.getZ();
        double z2=v2.locationOfVector.getZ();
        return x1*x2+y1*y2+z1*z2;
    }
    public MyVector plusVector(MyVector v2){
        double x=locationOfVector.getX()+v2.locationOfVector.getX();
        double y=locationOfVector.getY()+v2.locationOfVector.getY();
        double z=locationOfVector.getZ()+v2.locationOfVector.getZ();
        return new My3DVector(x,y,z);
    }
    public void showVector(){
        System.out.println("The Vector is 3D: ("+locationOfVector.getX()+","+locationOfVector.getY()+","+locationOfVector.getZ()+")");
    }
    public int compareTo(MyVector v2){
        if(lengthOfVector()>v2.lengthOfVector())return -1;
        else if(lengthOfVector()<v2.lengthOfVector())return 1;
        else return 0;
    }
}
