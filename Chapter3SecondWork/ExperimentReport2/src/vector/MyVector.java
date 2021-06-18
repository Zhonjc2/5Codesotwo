package vector;
public abstract class MyVector {
    protected MyPoint locationOfVector;
    protected MyVector(MyPoint locationOfVector){
        this.locationOfVector=locationOfVector;
    }
    protected MyVector(){}
    public abstract double lengthOfVector();
    public abstract double multiplyVector(MyVector v2);
    public abstract MyVector plusVector(MyVector v2);
    public abstract void showVector();
}
