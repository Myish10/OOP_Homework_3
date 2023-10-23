/**
 * Менеджер (оклад + % от продаж)
 */
public class Manager extends Employee {

    private int salesVolum;

    public Manager(String surName, String name, String age, double salary, int salesVolum) {
        super(surName, name, age, salary);
        this.salesVolum = salesVolum;
    }

    @Override
    public double calculateSalary() {
        return salary + Math.round(salesVolum *1.5/100);
    }

    @Override
    public String toString() {
        return String.format("%s %s %s лет; Менеджер; Средняя заработная плата в месяц: %.2f руб.",
                surName, name, age, calculateSalary());
    }
}
