package ru.fjfalcon.service.impl;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

import ru.fjfalcon.model.Department;
import ru.fjfalcon.model.Employee;
import ru.fjfalcon.service.CollectionService;

public class CollectionServiceImpl implements CollectionService {
    @Override
    public Map<Department, List<Employee>> generateDepartmentMap(List<Employee> employees) {
        return null;
    }

    @Override
    public Map<Integer, Map<Department, List<Employee>>> countByWorkDaysDepartmentAndEmployee(List<Employee> employees) {
        return null;
    }

    @Override
    public Map<Department, BigDecimal> departmentsSalary(List<Employee> employees) {
        return null;
    }

    @Override
    public Map<Department, Map<Employee, BigDecimal>> groupByDepartmentWithEmployeeAndSalary(List<Employee> employees) {
        return null;
    }

    @Override
    public Map<String, Map<String, BigDecimal>> groupByDepartmentNameWithEmployeeNameAndSalayMap(
            List<Employee> employees) {
        return null;
    }

    @Override
    public Map<Department, BigDecimal> departmentSalaryForAgeMoreThan30(List<Employee> employees) {
        return null;
    }
}
