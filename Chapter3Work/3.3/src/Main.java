import animal.*;
public class Main {
    public static void main(String[] args){
        Animal v1=new Animal("white","hehe","pi",9);
        Animal v2=new Bird("black","smallbird",7);
        Animal v3=new Fish("red","smallfish",5);
        Bird v4=new Bird("grey","bigbird",4);
        Fish v5=new Fish("gold","bigfish",9);
        v1.play();
        v2.play();//引用父类中被子类重写的方法
        v3.play();//引用父类中被子类重写的方法
        v2.getAge();
        v3.getAge();
        v4.play();
        v5.play();
    }
}
