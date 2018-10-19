package com.libf.dao;

import com.libf.model.StudentTest;

public interface StudentTestMapper {
    int insert(StudentTest record);

    int insertSelective(StudentTest record);
}