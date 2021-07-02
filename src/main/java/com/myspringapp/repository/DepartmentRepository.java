package com.myspringapp.repository;

import com.myspringapp.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Sushil M S Karki
 * @version 0.1
 * @quote "Did you code today?"
 * @Date
 */
public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
