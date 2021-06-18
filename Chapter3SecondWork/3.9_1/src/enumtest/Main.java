package enumtest;

public class Main {
    public static void main(String[] args){
        Color c1=Color.BLUE;
        Color c2=Color.valueOf("RED");
        Color c3=Enum.valueOf(Color.class, "WHITE");
        Color[] c4=Color.values();
        for(Color w:c4)System.out.println(w.ordinal()+w.toString()+w.name());
        System.out.println(c1.equals(c2));
        System.out.println(c3);
    }
}
