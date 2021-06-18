import octagon.*;
public class Main{

public static void main(String[] args) throws CloneNotSupportedException{
		// TODO 自动生成的方法存根
		Octagon v1=new Octagon(1,1,5);
		System.out.println(v1);
		Octagon v2=(Octagon)v1.clone();
		System.out.println(v2);
		Octagon v3=new Octagon(0,0,6);
		if(v1.compareTo(v3)==0)System.out.println("两个形状相等");
		else if(v1.compareTo(v3)==1)System.out.println("v1比v3大");
		else System.out.println("v3比v1大");
	}

}
