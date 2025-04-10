package com.ss.sys.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ss.sys.entity.Student;
import com.ss.sys.entity.Teacher;

import java.util.List;

public interface ITeacherService extends IService<Teacher> {
    List<Teacher> findAll();
}
