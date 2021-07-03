package physicalexperiment;

import java.util.Scanner;

class PhysicalCalculation{
    protected static final int R1=100;
    protected static final int R2=300;
    protected static final int R3=100;
    protected static final int E=10;
    protected int RL;
    public PhysicalCalculation(int RL){
        this.RL=RL;
    }
    public static int getR1() {
        return R1;
    }
    public static int getR2() {
        return R2;
    }
    public static int getR3() {
        return R3;
    }
    public int getRL() {
        return RL;
    }
    public void setRL(int RL) {
        this.RL = RL;
    }
    public double getI(){
        return E/((R3*R2+R3*RL+R1*R3+R1*R2+R1*RL)/((double)R3+R2+RL));
    }
    public double getIL(){
        return getI()*((double)R3/(RL+R2+R3));
    }
    public double getUAB(){
        return getIL()*RL;
    }
    public double getP(){
        return getIL()*1000*getUAB();
    }
}
public class Main {
    public static void main(String[] args){
        Scanner sc1=new Scanner(System.in);
        while(true) {
            PhysicalCalculation pc1 = new PhysicalCalculation(sc1.nextInt());
            System.out.println("UAB=" + pc1.getUAB());
            System.out.println("IL=" + 1000 * pc1.getIL());
            System.out.println("P=" + pc1.getP());
        }
    }
}