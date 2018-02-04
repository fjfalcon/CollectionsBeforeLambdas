package ru.fjfalcon.model;

import java.math.BigDecimal;

public class WorkDay {
    private BigDecimal salary;

    public BigDecimal getSalary() {
        return salary;
    }

    public WorkDay(BigDecimal salary) {
        this.salary = salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        WorkDay workDay = (WorkDay) o;

        return salary != null ? salary.equals(workDay.salary) : workDay.salary == null;
    }

    @Override
    public int hashCode() {
        return salary != null ? salary.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "WorkDay{" +
                "salary=" + salary +
                '}';
    }
}
