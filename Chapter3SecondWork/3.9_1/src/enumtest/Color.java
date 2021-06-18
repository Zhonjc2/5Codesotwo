package enumtest;

public enum Color {
    RED("红"),GREEN("绿"),YELLOW("黄"),BLUE("蓝"),WHITE("白"),BLACK("黑");
    public String chColor;
    private Color(String chColor){
        this.chColor=chColor;
    }
    public String toString(){
        return chColor;
    }
}
