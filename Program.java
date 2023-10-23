import java.sql.Array;
import java.util.Arrays;

public class Program {

    public static void main(String[] args) {

        Worker worker = new Worker("Сидоров", "Иван", "35", 60000);
        System.out.println(worker);
        System.out.println("-".repeat(20));

        Freelanser freelanser = new Freelanser("Иванов", "Петр", "27", 450, 50);
        System.out.println(freelanser);
        System.out.println("-".repeat(20));

        Manager manager = new Manager("Петров", "Николай", "43", 40000, 5000000);
        System.out.println(manager);
        System.out.println("-".repeat(20));


        Employee[] employees = EmployeeFabric.generateEmployees(20);
        for (Employee e: employees) {
            System.out.println(e);
        }
        System.out.println("-".repeat(20));

        Arrays.sort(employees, new SalaryComparator());
        for (Employee e: employees) {
            System.out.println(e);
        }
        System.out.println("-".repeat(20));

        Arrays.sort(employees);
        for (Employee e: employees) {
            System.out.println(e);
        }

    }


}
