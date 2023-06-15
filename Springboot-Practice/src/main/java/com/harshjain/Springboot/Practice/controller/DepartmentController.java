package com.harshjain.Springboot.Practice.controller;

import com.harshjain.Springboot.Practice.entity.Department;
import com.harshjain.Springboot.Practice.service.DepartmentService;
import com.harshjain.Springboot.Practice.service.DepartmentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;
    @PostMapping("/departments")
    public Department saveDepartment(@RequestBody  Department department){
            return departmentService.saveDepartment(department);
    }
    @GetMapping("/departments")
    public List<Department> fetchDepartmentList()
    {
        return departmentService.fetchDepartmentList();
    }
    @GetMapping("/departments/{id}")
    public Department fetchDepartmentById(@PathVariable("id") Long departmentId)
    {
        return departmentService.fetchDepartmentById(departmentId);
    }
    @PutMapping("/departments/{id}")
    public Department fetchDepartmentById(@PathVariable("id") Long departmentId,@RequestBody Department department)
    {
        return departmentService.putDepartment(departmentId,department);
    }
    @DeleteMapping("/departments/{id}")
    public String deleteDepartmentById(@PathVariable("id") Long departmentId)
    {
        departmentService.deleteDepartmentById(departmentId);
        return "Item Deleted";
    }
    @GetMapping("/departments/name/{name}")
    public  Department findByDepartmentName(@PathVariable("name") String departmentName){
        return departmentService.findByDepartmentName(departmentName);
    }

}
