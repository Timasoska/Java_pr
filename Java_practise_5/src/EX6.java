//Дано натуральное число n>1. Проверьте, является ли оно простым.
//Программа должна вывести слово YES, если число простое и NO, если число
//составное.
public class EX6 {
    public static boolean func6(int n, int i){
        if(n < 2) //Базовый случай
            return false;
        else if(n == 2)
            return true;
        else if (n % 2 == 0)
            return false;
        else if (2 < n / i) // Шаг рекурсии
            return func6(n, i + 1);
        else
            return true;
    }

    public static void main(String[] args) {
        System.out.println(func6(5,2));
    }

}
