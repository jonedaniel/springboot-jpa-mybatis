package com.zmh.jpamybatis;

import com.zmh.jpamybatis.mapper.EmployeesMapper;
import com.zmh.jpamybatis.mapper.JPAEmployeesMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JpaMybatisApplicationTests {
    @Autowired
    private EmployeesMapper    employeesMapper;
    @Autowired
    private JPAEmployeesMapper jpaEmployeesMapper;

    @Test
    public void contextLoads() {
        System.out.println(employeesMapper.selectAll());
    }

    @Test
    public void test2() {
        System.out.println(jpaEmployeesMapper.findAll());
    }
}
