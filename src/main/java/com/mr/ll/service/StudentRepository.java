package com.mr.ll.service;

import com.mr.ll.entity.UserEntity;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface StudentRepository extends JpaRepository<UserEntity, Integer> {

    //自定义修改语句
    @Modifying(clearAutomatically = true)
    @Query(value = "update t_student set name = ?1,sex =?2 where id = ?3",nativeQuery = true)
    void updateNameById(String name,Integer sex,Integer id);

}
