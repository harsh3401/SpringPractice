package com.harshjain.Springboot.Practice.controller;

import com.harshjain.Springboot.Practice.entity.Department;
import com.harshjain.Springboot.Practice.error.DepartmentNotFoundException;
import com.harshjain.Springboot.Practice.service.DepartmentService;
import com.harshjain.Springboot.Practice.service.DepartmentServiceImpl;
import jakarta.validation.Valid;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    private final Logger LOGGER = LoggerFactory.getLogger(DepartmentController.class);
    @PostMapping("/departments")
    public Department saveDepartment(@Valid @RequestBody  Department department){
        LOGGER.info("Inside save department endpoint");
            return departmentService.saveDepartment(department);
    }
    @GetMapping("/departments")
    public List<Department> fetchDepartmentList()
    {
        return departmentService.fetchDepartmentList();
    }
    @GetMapping("/departments/{id}")
    public Department fetchDepartmentById(@PathVariable("id") Long departmentId) throws DepartmentNotFoundException {
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
