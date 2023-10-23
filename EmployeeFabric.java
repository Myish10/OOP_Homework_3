import java.util.Random;

public class EmployeeFabric {

    private static Random random = new Random();

    public static Worker generateWorker() {
        String[] names = new String[]{"Анатолий", "Глеб", "Клим", "Мартин", "Лазарь", "Владлен", "Клим", "Панкратий", "Рубен", "Герман"};
        String[] surnames = new String[]{"Григорьев", "Фокин", "Шестаков", "Хохлов", "Шубин", "Бирюков", "Копылов", "Горбунов", "Лыткин", "Соколов"};
        String[] age = new String[]{"20", "25", "27", "31", "36", "39", "42", "48", "50", "56", "59", "61", "67"};

        int salary = random.nextInt(60000, 120001);
        return new Worker(surnames[random.nextInt(surnames.length)], names[random.nextInt(names.length)],
                age[random.nextInt(age.length)], salary);
    }

    public static Freelanser generateFreelanser() {
        String[] names = new String[]{"Анатолий", "Глеб", "Клим", "Мартин", "Лазарь", "Владлен", "Клим", "Панкратий", "Рубен", "Герман"};
        String[] surnames = new String[]{"Григорьев", "Фокин", "Шестаков", "Хохлов", "Шубин", "Бирюков", "Копылов", "Горбунов", "Лыткин", "Соколов"};
        String[] age = new String[]{"20", "25", "27", "31", "36", "39", "42", "48", "50", "56", "59", "61", "67"};


        int salary = random.nextInt(400, 800);
        int hours = random.nextInt(40, 201);
        return new Freelanser(surnames[random.nextInt(surnames.length)], names[random.nextInt(names.length)],
                age[random.nextInt(age.length)], salary, hours);
    }

    public static Manager generateManager() {
        String[] names = new String[]{"Анатолий", "Глеб", "Клим", "Мартин", "Лазарь", "Владлен", "Клим", "Панкратий", "Рубен", "Герман"};
        String[] surnames = new String[]{"Григорьев", "Фокин", "Шестаков", "Хохлов", "Шубин", "Бирюков", "Копылов", "Горбунов", "Лыткин", "Соколов"};
        String[] age = new String[]{"20", "25", "27", "31", "36", "39", "42", "48", "50", "56", "59", "61", "67"};


        int salary = 40000;
        int salesVolum = random.nextInt(2000000, 8000001);
        return new Manager(surnames[random.nextInt(surnames.length)], names[random.nextInt(names.length)],
                age[random.nextInt(age.length)], salary, salesVolum);
    }


    public static Employee[] generateEmployees(int count) {
        Employee[] employees = new Employee[count];
        for (int i = 0; i < count; i++) {
            int employeeRandom = random.nextInt(1, 4);
            if (employeeRandom == 1) {
                employees[i] = generateWorker();
            } else if (employeeRandom == 2) {
                employees[i] = generateManager();
            } else {
                employees[i] = generateFreelanser();
            }
        }
        return employees;
    }

}
