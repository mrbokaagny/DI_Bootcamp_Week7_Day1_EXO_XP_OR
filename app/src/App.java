import com.di.exoxpor.classes.Rectangle;
import com.di.exoxpor.classes.Square;

public class App {
    public static void main(String[] args) throws Exception {

        Rectangle rect = new Rectangle(15.5, 16.2);
        rect.getArea();

        Square sq = new Square(5.2, 7.8);
        sq.surface();
    }
}
