public class Test2 implements Priceable{
    int Price;
    Test2(int Price){this.Price = Price;}
    public void getPrice(){System.out.println(Price);}

    public static void main(String[] args) {
        Test2 test2= new Test2(125);
        test2.getPrice();
    }
}
