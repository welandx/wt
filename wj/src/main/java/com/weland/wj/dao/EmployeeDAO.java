package com.weland.wj.dao;

import com.weland.wj.pojo.Employee;
import com.weland.wj.pojo.Category;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
public interface EmployeeDAO extends JpaRepository<Employee, Integer> {
    List<Employee> findAllByCategory(Category category);
    List<Employee> findAllByEp_name(String keyword1);
}
