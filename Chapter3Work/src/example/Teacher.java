package example;
public class Teacher extends Person{
    public String subject;
    private String id;
    public Teacher(String name,int age,String subject,String id){
        super(name,age,"此处为身份证号");
        this.subject=subject;
        this.id=id;
    }
    public Teacher(){}
    public String getSubject() {
        return subject;
    }
    public void setSubject(String subject) {
        this.subject = subject;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public void show(){
        System.out.println("姓名："+getName()+" 所教科目："+subject+" 教职工号："+id+" 身份证号："+super.getId());
    }
}
