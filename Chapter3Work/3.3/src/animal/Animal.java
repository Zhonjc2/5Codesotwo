package animal;
public class Animal {
    //颜色、名字、年龄、叫声
    //play自我介绍方法、get、set
    protected String color,name,voice;
    protected int age;
    public Animal(String color,String name,String voice,int age){
        this.age=age;
        this.name=name;
        this.voice=voice;
        this.color=color;
    }
    public Animal(){}
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getVoice() {
        return voice;
    }
    public void setVoice(String voice) {
        this.voice = voice;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void play(){
        System.out.print(voice);
        System.out.println("我叫"+name+" 我是"+color+"色的 "+"我"+age+"岁了");
    }
}
