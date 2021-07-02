package com.myspringapp.service;

import com.myspringapp.entity.Department;

import java.util.List;

/**
 * @author Sushil M S Karki
 * @version 0.1
 * @quote "Did you code today?"
 * @Date 07/28/2021
 */
public interface DepartmentService {


   public Department saveDepartment(Department department);

   public List<Department> fetchDepartmentList();

   public Department getDepartmentById(Long departmentId);

   public void deleteDepartmentById(Long departmentId);

   public Department updateDepartment(Long departmentId, Department department);
}
