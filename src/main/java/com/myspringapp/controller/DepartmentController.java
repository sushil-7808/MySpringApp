package com.myspringapp.controller;

import com.myspringapp.entity.Department;
import com.myspringapp.service.DepartmentService;
import com.myspringapp.service.DepartmentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Sushil M S Karki
 * @version 0.1
 * @quote "Did you code today?"
 * @Date 07/28/2021
 */
@RestController
public class DepartmentController {


    /**
     * Creating a reference of departmentService which is not possible since it is an interface
     * so here the this reference is pointing to the class which implements departmentService
     * which is DepartmentServiceImp class. When there are multiple classes implementing same interface
     * we use @Qualifies("className") annotation.
     * */

    @Qualifier("DepartmentServiceImpl")
    private DepartmentService departmentService;

    @PostMapping("/departments")
    public Department saveDepartment(@RequestBody Department department){
        return departmentService.saveDepartment(department);

    }

    /**
     * @GET request to get all data .
     * we have interface departmentService which have method body for CRUD API in service layer
     * interface implementation calls our DepartmentRepository class method where
     * DepartmentRepository extends JpaRepository which provides all CRUD method we need.
     *
     * **/
    @GetMapping("/departments")
    public List<Department> fetchDepartmentList(){
        return departmentService.fetchDepartmentList();
    }

    /**
     * @GET request to get data by ID.
     * **/
    @GetMapping("/departments/{id}")
    public Department getDepartmentById(@PathVariable("id") Long departmentId){
        return departmentService.getDepartmentById(departmentId);
    }


    /**
     * @DELETE request to delete data by ID.
     * We can use void implementation for this method also.
     * **/
    @DeleteMapping("/departments/{id}")
    public String deleteDepartmentbyId(@PathVariable("id") Long departmentId){
         departmentService.deleteDepartmentById(departmentId);
       return "Id deleted successfully" ;
    }


    /**
     * @UPDATE request to update data by ID
     *
     * ***/
    @PutMapping("/departments/{id}")
    public Department updateDepartment(@PathVariable("id") Long departmentId,
                                       @RequestBody Department department){
        return departmentService.updateDepartment(departmentId, department);
    }
}
