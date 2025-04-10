package com.ss.sys.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ss.sys.entity.*;
import com.ss.sys.entity.Teacher;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TeacherMapper extends BaseMapper<Teacher> {
    public List<Teacher> findAll();
}
