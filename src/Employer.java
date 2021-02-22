public class Employer {

    String fio;
    String position;
    String email;
    String phone;
    int salary;
    int age;

    Employer(String fio, String position, String email, String phone, int salary, int age) {
        this.fio = fio;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    void showEmployerInformation () {
        System.out.println("\nФИО: " + this.fio +
                "\nДолжность: " + this.position +
                "\nemail: " + this.email +
                "\nТелефон: " + this.phone +
                "\nЗарплата: " + this.salary +
                "\nВозраст: " + this.age);
    }

}
