import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Student[] iDNumber = {
                new Student("Иванов", 2),
                new Student("Петров", 8),
                new Student("Сидоров", 4),
                new Student("Федотов", 435),
                new Student("Еще кто-то", 67)
        };
        System.out.println("ДО");
        for (Student student: iDNumber){
            System.out.println(student);
        }

        //vstvakaSort(iDNumber);
        Arrays.sort(iDNumber, new SortingStudentsByGPA());

        System.out.println("\nПОСЛЕ");
        for (Student student: iDNumber){
            System.out.println(student);
        }
    }

    public static void vstvakaSort(Student[] arr) {
        for (int i = 1; i < arr.length; i++){
            Student tmp = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j].getId() > tmp.getId()){
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = tmp;
        }
    }
}
