public class Test implements Nameable{
    public static String name;
    Test(String name){this.name = name;}
        public void getName () {
            System.out.println(name);
    }
    public static void main(String[] args) {
            Test test = new Test("NAME");
            test.getName();
    }
}
