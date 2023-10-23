/**
 * Рабочий (базовый тип)
 */

public abstract class Employee implements Comparable<Employee> {

//    @Override
//    public int compareTo(Employee o) {
//        int surNameRes = surName.compareTo(o.surName);
//        if (surNameRes == 0) {
//            return name.compareTo(o.name);
//        }
//        else return surNameRes;
//    }

    @Override
    public int compareTo(Employee o) {
        int ageRes = age.compareTo(o.age);
        if (ageRes == 0) {
            return surName.compareTo(o.surName);
        }
        else return ageRes;
    }

    protected String name;
    protected String surName;
    protected double salary;
    protected String age;

    public Employee(String surName, String name, String age, double salary) {
        this.surName = surName;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    /**
     * Расчет среднемесячной заработной платы
     */
    public abstract double calculateSalary();

    @Override
    public String toString() {
        return String.format("%s %s %s лет; ставка: %.2f руб.; заработная плата: %.2f руб/мес.",
                surName, name, age, salary, calculateSalary());
    }
}
