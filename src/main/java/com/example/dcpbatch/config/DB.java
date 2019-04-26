package com.example.dcpbatch.config;

import org.springframework.batch.item.ItemProcessor;

import com.example.dcpbatch.entity.Employee;
 
public class DB implements ItemProcessor<Employee, Employee>
{
    public Employee process(Employee employee) throws Exception
    {
        System.out.println("Inserting into table employee : " + employee);
        return employee;
    }
}