public class EX5 {
    public static int sum = 0;
    public static int func(int number){
        if(number <= 1)
            return number;
        return number + func(number / 10);
    }
    public static void main(String[] args) {
        System.out.println(func(54));
    }
}