import vector.*;
public class Main {
    public static void main(String[] args){
        MyVector v1=new My2DVector(2,5);
        My2DVector v2=new My2DVector(2,7);
        System.out.println(v1.lengthOfVector());
        System.out.println(v2.compareTo(v1));
        MyVector v3=new My3DVector(2,5,9);
        My3DVector v4=new My3DVector(2,7,2);
        System.out.println(v3.lengthOfVector());
        System.out.println(v4.compareTo(v1));
        v1.showVector();
        v2.showVector();
        v3.showVector();
        v4.showVector();
    }
}
