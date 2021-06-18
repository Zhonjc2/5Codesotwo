import example.*;
public class Main {
    public static void main(String[] args){
        Person v1=new Student("Jeb",18,"123456789","Information Technology");
        Person v2=new Teacher("Pak",38,"Advanced Mathematics","987654321");
        Student v3=new CollegeStudent("Obey",19,"Economy",2);
        System.out.println(v1.id);//此处说明父类做引用变量时，对象引用的是父类属性
        System.out.println(v1.getId());//此处说明父类引用子类对象时，当子类中重写了父类的方法时，引用的是子类的方法
        v1.show();
        System.out.println(v3.getId());
        v2.show();
        //v2.subject此处说明父类引用子类对象时，不能引用子类定义的变量，只有方法拥有重写/多态，变量没有
        v3.
    }
}
