package com.example.demo.domain;

import lombok.Data;

import javax.persistence.*;


/**
 * 创建了一个实体类。
 * 如何持久化呢？
 * 1、使用@Entity进行实体类的持久化操作，当JPA检测到我们的实体类当中有
 * @Entity 注解的时候，会在数据库中生成对应的表结构信息。
 *
 * 如何指定主键以及主键的生成策略？
 * 2、使用@Id指定主键.
 */
@Data
@Entity
@Table(name = "User")
public class User{
    @Id
    @GeneratedValue
    private Long id;

    @Column
    private  String name;

    @Column
    private Integer age;
}