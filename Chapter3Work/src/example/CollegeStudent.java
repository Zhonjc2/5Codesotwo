package example;
public class CollegeStudent extends Student{
    protected int level;
    public CollegeStudent(String name,int age,String department,int level){
        super(name,age,"此处为学号",department);
        this.level=level;
    }
    public CollegeStudent(){}
    public int getLevel() {
        return level;
    }
    public void setLevel(int level) {
        this.level = level;
    }
    public void show(){
        System.out.println("姓名："+getName()+" 年龄："+getAge()+" 年级："+level);
    }
}
