/**
 * Фрилансер (работник с почасовой оплатой)
 */

public class Freelanser extends Employee {

    private int hours;

    public Freelanser(String surName, String name, String age, double salary, int hours) {
        super(surName, name, age, salary);
        this.hours = hours;
    }

    @Override
    public double calculateSalary() {
        return salary * hours;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s лет; Фрилансер; Средняя заработная плата в месяц: %.2f руб.",
                surName, name, age, calculateSalary());
    }
}
