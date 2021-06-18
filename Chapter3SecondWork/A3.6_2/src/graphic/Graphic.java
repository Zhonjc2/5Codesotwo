package graphic;
public abstract class Graphic {
    protected String color;
    public Graphic(String color){
        this.color=color;
    }
    public abstract double area();
    public abstract double perimeter();
}
