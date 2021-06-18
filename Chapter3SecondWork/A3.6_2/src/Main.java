import graphic.*;
public class Main {
    public static void main(String[] args) {
        Graphic v1 = new Rectangle("red", 2.5, 4.0);
        System.out.println(v1.area());//父类引用子类变量，访问权限看父类方法
        System.out.println(v1.perimeter());
        Graphic v2 = new Circle("blue", 2.5);
        System.out.println(v2.area());
        System.out.println(v2.perimeter());
        Graphic v3 = new Square("white", 4.5);
        System.out.println(v3.area());
        System.out.println(v3.perimeter());
        Graphic v4 = new Triangle("black", 3,4,5);
        System.out.println(v4.area());
        System.out.println(v4.perimeter());
    }
}
