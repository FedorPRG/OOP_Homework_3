
import java.util.ArrayList;

import Figure.* ;

public class Program {

    public static void main(String[] args) {

        Square sq = new Square();
        sq.setSide(7);
        System.out.printf("Площадь квадрата со стороной %.1f = %.1f\n",sq.getSide(), sq.getArea());

        Square sq1 = new Square(9);
        System.out.printf("Площадь квадрата со стороной %.1f = %.1f\n",sq1.getSide(), sq1.getArea());

        Rectangle re = new Rectangle();
        re.setHeight(2);
        re.setWidth(4);
        System.out.printf("Площадь прямоугольника со сторонами %.1f и %.1f = %.1f\n",
        re.getHeight(), re.getWidth(), re.getArea());

        Rectangle re1 = new Rectangle(8, 2);
        System.out.printf("Площадь прямоугольника со сторонами %.1f и %.1f = %.1f\n",
        re1.getHeight(), re1.getWidth(), re1.getArea());

        ArrayList<Figure> figures = new ArrayList<>();
        figures.add(sq);
        figures.add(sq1);
        figures.add(re);
        figures.add(re1);
        System.out.println("Площади всех фигур:");
        for (Figure fig : figures) {
            System.out.println(fig.getArea());
        }
    }
}
