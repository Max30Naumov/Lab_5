import java.util.ArrayList;
import java.util.Collections;

public class Quadrilaterals {
    ArrayList<Quadrilateral> quadrilaterals = new ArrayList<Quadrilateral>();

    public Quadrilaterals() {
    }

    public void add(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4) {
        quadrilaterals.add(new Quadrilateral(
                new Quadrilateral.Point(x1, y1),
                new Quadrilateral.Point(x2, y2),
                new Quadrilateral.Point(x3, y3),
                new Quadrilateral.Point(x4, y4))
        );
    }

    public void printExtremest() { // Вывести наименьший и наибольший
        Collections.sort(quadrilaterals);
        System.out.println("Наименьший прямоугольник: ");
        System.out.println(quadrilaterals.get(0));
        System.out.println("Наибольший прямоугольник: ");
        System.out.println(quadrilaterals.get(quadrilaterals.size() - 1));
    }
}
