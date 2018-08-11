package com.zmh.jpamybatis.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Employees {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long    id;
    @Column
    private String  name;
    @Column
    private Integer age;

}