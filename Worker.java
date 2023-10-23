/**
 * Рабочий (работает полный рабочий день)
 * Получает фиксированную заработную плату
 */

public class Worker extends Employee{

    public Worker(String surName, String name, String age, double salary) {
        super(surName, name, age, salary);
    }

    @Override
    public double calculateSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s лет; Рабочий; Средняя заработная плата в месяц: %.2f",
                surName, name, age, calculateSalary());
    }
}
