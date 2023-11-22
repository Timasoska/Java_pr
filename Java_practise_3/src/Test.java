public class Test {
    public static void main(String[] args) {
        Shape s1 = new Circle("RED", false, 5.5); // Upcast Circle to
        System.out.println(s1); // which version?
        System.out.println(s1.getArea()); // which version?
        System.out.println(s1.Perimeter()); // which version?
        System.out.println(s1.getColor());
        System.out.println(s1.isFilled());
        //System.out.println(s1.getRadius()); // Не можем вызвать тк это не метод класса shape

        Circle c1 = (Circle) s1; // downcast back to Circle
        System.out.println(c1);
        System.out.println(c1.getArea());
        System.out.println(c1.Perimeter());
        System.out.println(c1.getColor());
        System.out.println(c1.isFilled());
        System.out.println(c1.getRadius());
        //Shape s2 = new Shape(); //Не моежм создать тк это абстрактный класс

        Shape s3 = new Rectangle(1.0, 2.0, "RED", false); // upcast
        System.out.println(s3);
        System.out.println(s3.getArea());
        System.out.println(s3.Perimeter());
        System.out.println(s3.getColor());
        //System.out.println(s3.Length()); //Такого метода нет в Shape

        Rectangle r1 = (Rectangle) s3; // downcast (уменьшаем форму s3 до прямоугольника)
        System.out.println(r1);
        System.out.println(r1.getArea());
        System.out.println(r1.getColor());
        System.out.println(r1.getLength());

        Shape s4 = new Square(6.6); // Upcast
        System.out.println(s4);
        System.out.println(s4.getArea());
        System.out.println(s4.getColor());
        //System.out.println(s4.getSide()); // В классе Shape нет метода getSide

// Take note that we downcast Shape s4 to Rectangle,
// which is a superclass of Square, instead of Square
        Rectangle r2 = (Rectangle) s4;
        System.out.println(r2);
        System.out.println(r2.getArea());
        System.out.println(r2.getColor());
        //System.out.println(r2.getSide()); //В классе Rectangle нет метода getSide
        System.out.println(r2.getLength());
// Downcast Rectangle r2 to Square
        Square sq1 = (Square) r2;
        System.out.println(sq1);
        System.out.println(sq1.getArea());
        System.out.println(sq1.getColor());
        System.out.println(sq1.getSide());
        System.out.println(sq1.getLength());
    }
}