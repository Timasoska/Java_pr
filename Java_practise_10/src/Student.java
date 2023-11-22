public class Student implements Comparable {
    int idNumber = 0;
    int GPA = 0;
    Student(int idNumber, int GPA){
        this.idNumber = idNumber;
        this.GPA = GPA;
    }

    @Override
    public String toString() {
        return "Student{" +
                "idNumber=" + idNumber +
                ", GPA=" + GPA +
                '}';
    }

    @Override
    public int compareTo(Object o) { //Если значение поля "idNumber" текущего объекта больше, чем значение поля "idNumber"
        return this.idNumber - ((Student) o).idNumber;
    }
}