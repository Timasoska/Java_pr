import java.util.Comparator;

public class StudentComp implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        return ((Student) o1).GPA - ((Student) o2).GPA;
    }
}