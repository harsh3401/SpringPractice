package com.harshjain.Springboot.Practice.service;

import com.harshjain.Springboot.Practice.entity.Department;
import com.harshjain.Springboot.Practice.error.DepartmentNotFoundException;

import java.util.List;

public interface DepartmentService {
    public Department saveDepartment(Department department);

   public  List<Department> fetchDepartmentList();

    public Department fetchDepartmentById(Long departmentId) throws DepartmentNotFoundException;

    public Department putDepartment(Long departmentId, Department department);

    public void deleteDepartmentById(Long departmentId);


   public  Department findByDepartmentName(String departmentName);
}
