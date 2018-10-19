package com.libf.dao;

import com.libf.model.Student;

public interface StudentMapper {
    int insert(Student record);

    int insertSelective(Student record);
}