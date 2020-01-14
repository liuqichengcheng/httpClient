package com.mr.ll.service.impl;


import com.mr.ll.entity.UserEntity;
import com.mr.ll.service.StudentRepository;
import com.mr.ll.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * @ClassName UserServiceImpl
 * @Description: TODO
 * @Author liuqicheng
 * @Date 2020/1/10
 * @Version V1.0
 **/
@Service
public class UserServiceImpl implements UserService{


    @Autowired
    private StudentRepository repository;

    @Override
    public UserEntity list(Integer id) {
        return repository.getOne(id);
    }

    @Override
    public List<UserEntity> getAll() {
        return repository.findAll();
    }

    @Override
    public UserEntity save(UserEntity entity) {

        return repository.save(entity);
    }

    @Override
    public List<UserEntity> seqAll(UserEntity entity) {

       PageRequest of = PageRequest.of(0, 2,Sort.by("id").descending());
//        repository.findAll(Sort.by("id").descending())
        Page<UserEntity> all = repository.findAll(of);

        return all.getContent();
    }

    @Override
    public List<UserEntity> findByNameLikeOrSex(String s, Integer sex) {

        return null;
    }
}
