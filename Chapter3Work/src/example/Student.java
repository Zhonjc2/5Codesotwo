package example;
public class Student extends Person{
    private String department;
    private String id;
    public Student(String name,int age,String id,String department){
        super(name,age,"此处为身份证号");
        this.id=id;
        this.department=department;
    }
    public Student(){}
    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public void show(){
        System.out.println("姓名："+super.getName()+" 专业："+department+" 年龄："+getAge()+" 学号："+id+" 身份证号："+super.getId());
    }
}

