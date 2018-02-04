package ru.fjfalcon.model;

import java.util.List;

public class Employee {
    private String name;
    private Integer age;
    private Department department;
    private List<WorkDay> workDayList;

    public Employee(String name,
                    Integer age,
                    Department department,
                    List<WorkDay> workDayList) {
        this.name = name;
        this.age = age;
        this.department = department;
        this.workDayList = workDayList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public List<WorkDay> getWorkDayList() {
        return workDayList;
    }

    public void setWorkDayList(List<WorkDay> workDayList) {
        this.workDayList = workDayList;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Employee employee = (Employee) o;

        if (name != null ? !name.equals(employee.name) : employee.name != null) return false;
        if (age != null ? !age.equals(employee.age) : employee.age != null) return false;
        if (department != null ? !department.equals(employee.department) : employee.department != null)
            return false;
        return workDayList != null ? workDayList.equals(employee.workDayList) : employee.workDayList == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (age != null ? age.hashCode() : 0);
        result = 31 * result + (department != null ? department.hashCode() : 0);
        result = 31 * result + (workDayList != null ? workDayList.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", department=" + department +
                ", workDayList=" + workDayList +
                '}';
    }
}
