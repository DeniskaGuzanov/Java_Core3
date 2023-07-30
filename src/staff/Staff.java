package staff;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Staff {

    public static void main(String[] args) {



        staff.Employee employee1 = new staff.Employee("Ivanov", "Ivan", "Petrovich", 23598, 21, 26000 );
        staff.Employee employee2 = new staff.Employee("Petrov", "Petr", "Sergeevich", 23574, 41, 40000 );
        staff.Employee employee3 = new staff.Employee("Antonov", "Anton", "Rastislavovich", 25898, 50, 46000 );
        staff.Employee employee4 = new staff.Employee("Sergeev", "Sergey", "Antonovich", 85698, 55, 56000 );
        staff.Employee employee5 = new staff.Employee("Somov", "Oleg", "Nurlanovich", 25498, 47, 66000 );

        List<staff.Employee> employees = new ArrayList<>();

        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        employees.add(employee4);
        employees.add(employee5);

        staff.Employee director = new staff.Employee("Semenov", "Semen", "Semenovich", 123, 48, 100000);
        employees.add(director);

        System.out.println(employees);
        System.out.println();

        Staff staff = new Staff();
        staff.printStaffSalaryAge((ArrayList<staff.Employee>) employees,45, 5000 );
        System.out.println();

        Double list = employees.stream()
                .collect(Collectors.averagingDouble(Employee::getSalary));
        System.out.println("Средняя заработная плата сотрудников = " + list + " рублей");

        Double list_1 = employees.stream()
                .collect(Collectors.averagingDouble(Employee::getAge));
        System.out.println("Средний возраст сотрудников = " + list_1 + " лет");


    }





    void  printStaffSalaryAge(ArrayList<staff.Employee> employeeArrayList1, int a, int s){

        for (staff.Employee em1 : employeeArrayList1){
            if (em1.age > a && em1.surname != "Semenov"){
                em1.salary = em1.salary + 5000;

                System.out.println("Сотрудники получающие повышенную зарплату \n" + em1);
            }
        }
    }



}