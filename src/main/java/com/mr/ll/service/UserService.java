package com.mr.ll.service;

import com.mr.ll.entity.UserEntity;
import java.util.List;

public interface UserService{

    UserEntity list(Integer id);

    List<UserEntity> getAll();

    UserEntity save(UserEntity entity);

    List<UserEntity> seqAll(UserEntity entity);

    List<UserEntity> findByNameLikeOrSex(String s, Integer sex);
}
