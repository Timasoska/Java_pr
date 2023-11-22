public class Rectangle extends Shape{
    protected double length;
    protected double width;

    Rectangle(){
        super();
    }

    Rectangle(double width, double length){
        super();
    }

    Rectangle(double width, double length, String color, boolean filled){
        super(color, filled);
        this.width = width;
        this. length = length;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double getArea(){
        return width * length;
    }

    @Override
    public double Perimeter(){
        return ((width + length) * 2);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                ", color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}