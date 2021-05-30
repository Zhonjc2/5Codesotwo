package javafxtest5;
import javafx.scene.text.Font;
import java.util.List;
public class AllFonts {
    public static void main(String[] args) {
        List<String> l=Font.getFamilies();
        for(String w:l)System.out.println(w);
    }
}
