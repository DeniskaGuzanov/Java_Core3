package staff;

public class Employee {

    String surname;
    String name;
    String patronymic;
    int phone;
    double age;
    double salary;


    public Employee(String surname, String name, String patronymic, int phone, double age, double salary) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.phone = phone;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", phone=" + phone +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public int getPhone() {
        return phone;
    }

    public double getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }
}