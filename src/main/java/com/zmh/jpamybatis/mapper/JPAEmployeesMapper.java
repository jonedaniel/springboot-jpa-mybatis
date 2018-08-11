package com.zmh.jpamybatis.mapper;

import com.zmh.jpamybatis.domain.Employees;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface JPAEmployeesMapper extends JpaRepository<Employees,Long> {
}
