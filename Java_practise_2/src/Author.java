public class Author {
    private String name;
    private String email;
    private char gender;

    Author(String name, String email, char gender){ // Создаём конструктор
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "Автор - " + name + "(" + getGender() + ") " + " на " + getEmail();
    }
}