package animal;
public class Fish extends Animal{
    public Fish(String color,String name,int age){
        super(color,name,"",age);
    }
    public Fish(){}
    public void play(){
        System.out.print(super.voice);
        System.out.println("我叫"+name+" 我是"+color+"色的一条鱼 "+"我"+age+"岁了");
    }
}
