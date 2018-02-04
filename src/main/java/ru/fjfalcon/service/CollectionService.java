package ru.fjfalcon.service;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

import ru.fjfalcon.model.Department;
import ru.fjfalcon.model.Employee;

public interface CollectionService {
    Map<Department, List<Employee>> generateDepartmentMap(List<Employee> employees);

    Map<Integer, Map<Department, List<Employee>>> countByWorkDaysDepartmentAndEmployee(List<Employee> employees);

    Map<Department, BigDecimal> departmentsSalary(List<Employee> employees);

    Map<Department, Map<Employee, BigDecimal>> groupByDepartmentWithEmployeeAndSalary(List<Employee> employees);

    Map<String, Map<String, BigDecimal>> groupByDepartmentNameWithEmployeeNameAndSalayMap(List<Employee> employees);

    Map<Department, BigDecimal> departmentSalaryForAgeMoreThan30(List<Employee> employees);
}
