package ru.fjfalcon.service;


import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import ru.fjfalcon.model.Department;
import ru.fjfalcon.model.Employee;
import ru.fjfalcon.model.WorkDay;
import ru.fjfalcon.service.impl.CollectionServiceImpl;

class CollectionServiceTest {

    private CollectionService collectionService;

    private final Department it = new Department("IT");
    private final Department accounting = new Department("Accounting");
    private final Department sales = new Department("Sales");

    private final WorkDay workDay10 = new WorkDay(BigDecimal.TEN);
    private final WorkDay workDay1 = new WorkDay(BigDecimal.ONE);
    private final WorkDay workDay30 = new WorkDay(new BigDecimal(30));


    @Before
    void setUp() {
        collectionService = new CollectionServiceImpl();
    }

    @Test
    void generateDepartmentMap() {
        Map<Department, List<Employee>> map = collectionService.generateDepartmentMap(getEmployees());

        assert(map.size() == 3 );
        assert(map.get(it).size() > 2);
    }

    @Test
    void countByWorkDaysDepartmentAndEmployee() {
        Map<Integer, Map<Department, List<Employee>>> map = collectionService.countByWorkDaysDepartmentAndEmployee(getEmployees());

        assert(map.size() == 5);
    }

    @Test
    void departmentsSalary() {
        //TODO: finish test

    }

    @Test
    void groupByDepartmentWithEmployeeAndSalary() {
        //TODO: finish test
    }

    @Test
    void groupByDepartmentNameWithEmployeeNameAndSalayMap() {
        //TODO: finish test
    }

    @Test
    private List<Employee> getEmployees() {

        Employee antony = new Employee("Antony", 21, it, Arrays.asList(workDay1,workDay1,workDay1,workDay1,workDay1,workDay1));
        Employee philip = new Employee("Philip", 32, accounting, Arrays.asList(workDay10,workDay10,workDay10,workDay10,workDay1));
        Employee dexter = new Employee("Dexter", 29, sales, Arrays.asList(workDay10,workDay10,workDay10,workDay10,workDay30));
        Employee max = new Employee("Max", 45, sales, Arrays.asList(workDay30, workDay30));
        Employee annie = new Employee("Annie", 18, it, Collections.singletonList(workDay1));

        //TODO: ADD MORE EMPLOYEES


        return Arrays.asList(antony, philip, dexter, max, annie);


    }
}