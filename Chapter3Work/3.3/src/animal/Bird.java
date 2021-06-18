package animal;
public class Bird extends Animal{
    public Bird(String color,String name,int age){
        super(color,name,"qiuqiu",age);
    }
    public Bird(){}
    public void play(){
        System.out.print(super.voice);
        System.out.println("我叫"+name+" 我是"+color+"色的一只鸟 "+"我"+age+"岁了");
    }
}
