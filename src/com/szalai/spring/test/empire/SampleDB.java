package com.szalai.spring.test.empire;

public class SampleDB extends DBDatabase {

    // Table class definition (see below)
    public static class Departments extends DBTable {... } 
    public static class Employees extends DBTable {... }

    // Table members
    public final Departments  DEPARTMENTS = new Departments(this);
    public final Employees    EMPLOYEES   = new Employees(this);

    // SampleDB constructor
    public SampleDB()
    {
        // Define foreign key relations
        addRelation(EMPLOYEES.DEPARTMENT_ID
                .referenceOn(DEPARTMENTS.DEPARTMENT_ID ));
    }
}
