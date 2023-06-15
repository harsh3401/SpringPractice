package com.harshjain.Springboot.Practice.service;

import com.harshjain.Springboot.Practice.entity.Department;
import com.harshjain.Springboot.Practice.error.DepartmentNotFoundException;
import com.harshjain.Springboot.Practice.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class DepartmentServiceImpl implements DepartmentService{
    @Autowired
    private DepartmentRepository departmentRepository;
    @Override
    public Department saveDepartment(Department department) {
        return departmentRepository.save(department);
    }

    @Override
    public List<Department> fetchDepartmentList() {
        return departmentRepository.findAll();
    }

    @Override
    public Department fetchDepartmentById(Long departmentId) throws DepartmentNotFoundException {
        Optional<Department> department =departmentRepository.findById(departmentId);
        if(department.isEmpty())
        {
            throw new DepartmentNotFoundException("Department Not available");

        }
        return department.get();

    }

    @Override
    public Department putDepartment(Long departmentId, Department department) {
        Department dbDep= departmentRepository.findById(departmentId).get();
        if(Objects.nonNull(department.getDepartmentName())&&!"".equalsIgnoreCase(department.getDepartmentName()))
        {
            System.out.println("Here");
            dbDep.setDepartmentName(department.getDepartmentName());
        }
        if(Objects.nonNull(department.getDepartmentAddress())&&!"".equalsIgnoreCase(department.getDepartmentAddress()))
        {
            System.out.println("Here1");
            dbDep.setDepartmentAddress(department.getDepartmentAddress());
        }
        if(Objects.nonNull(department.getDepartmentCode())&&!"".equalsIgnoreCase(department.getDepartmentCode()))
        {
            System.out.println("Here2");
            dbDep.setDepartmentCode(department.getDepartmentCode());
        }
        System.out.println(dbDep);
        return departmentRepository.save(dbDep);

    }

    @Override
    public void deleteDepartmentById(Long departmentId) {
        departmentRepository.deleteById(departmentId);
    }

    @Override
    public Department findByDepartmentName(String departmentName) {
        return  departmentRepository.findByDepartmentName(departmentName);
    }


}
