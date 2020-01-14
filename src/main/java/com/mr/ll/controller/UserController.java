package com.mr.ll.controller;

import com.mr.ll.entity.UserEntity;
import com.mr.ll.service.UserService;
import org.springframework.data.domain.Example;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.persistence.criteria.Root;
import java.util.List;

/**
 * @ClassName UserController
 * @Description: TODO
 * @Author liuqicheng
 * @Date 2020/1/10
 * @Version V1.0
 **/
@RestController
@RequestMapping(value = "user")
public class UserController{

    @Resource
    private UserService service;

    @GetMapping//根据id查询
    public UserEntity List(Integer id){
        return service.list(id);
    }

    @GetMapping(value = "list")//查询所有
    public List<UserEntity> getAll(){
        return service.getAll();
    }

    @PostMapping//新增
    public UserEntity save(@RequestBody UserEntity entity){
        return service.save(entity);
    }

    @GetMapping(value = "seq")//参数的排序
    public List<UserEntity> seqAll(UserEntity entity){
        return service.seqAll(entity);
    }

    @GetMapping(value = "findByNameLike")
    public List<UserEntity> findByNameLikeOrSex(@RequestBody UserEntity entity){
        Example<UserEntity> example = Example.of(entity);//用Example查询，会忽略null值
        return service.findByNameLikeOrSex("%" +  example.getProbe().getName() + "%",  example.getProbe().getSex());
    }
}
