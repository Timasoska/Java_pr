//EX8
//палиндром
public class EX8 {
    public static void main(String[] args){
        System.out.println(func("AOOA"));
    }

    public static boolean func(String str) {
        if (str.length() <= 1) return true;
        if (str.charAt(0) != str.charAt(str.length() - 1)) return false;

        return func(str.substring(1, str.length() - 1));
    }
}
