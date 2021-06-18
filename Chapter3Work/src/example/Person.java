package example;
public class Person {
    private String name;
    private int age;
    public String id;
    public Person(String name,int age,String id){
        this.name=name;
        this.age=age;
        this.id=id;
    }
    public Person(){}
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public void show(){
        System.out.println("姓名："+name+" 年龄："+age+" 身份证号："+id);
    }
}
