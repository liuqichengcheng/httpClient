package com.mr.ll.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.GeneratorType;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * @ClassName UserEntity
 * @Description: TODO
 * @Author liuqicheng
 * @Date 2020/1/10
 * @Version V1.0
 **/
@Entity
@Table(name = "t_user")
@JsonIgnoreProperties(value = {"hibernateLazyInitializer"})
public class UserEntity {

    @Id
    @GenericGenerator(name = "id",strategy = "native")
    @GeneratedValue(generator = "id")
    @Column(name = "id")
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "sex")
    private Integer sex;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

}
