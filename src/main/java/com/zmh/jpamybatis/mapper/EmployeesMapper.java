package com.zmh.jpamybatis.mapper;

import com.zmh.jpamybatis.domain.Employees;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface EmployeesMapper  {
    List<Employees> selectAll();
}