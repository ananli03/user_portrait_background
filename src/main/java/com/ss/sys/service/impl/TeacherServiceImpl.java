package com.ss.sys.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ss.sys.entity.Student;
import com.ss.sys.entity.Teacher;
import com.ss.sys.mapper.StudentMapper;
import com.ss.sys.mapper.TeacherMapper;
import com.ss.sys.service.ITeacherService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TeacherServiceImpl extends ServiceImpl<TeacherMapper, Teacher> implements ITeacherService {
    @Resource
    private TeacherMapper teacherMapper;

    @Override
    public List<Teacher> findAll() {
        return teacherMapper.findAll();
    }
}
