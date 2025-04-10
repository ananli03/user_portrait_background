package com.ss.sys.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ss.sys.entity.*;

import java.util.List;
import java.util.Map;

public interface IStudentService extends IService<Student> {
    List<Student> findAll();
    List<Student> getscore(String sno);
    List<MBTI> getMBTI(String sno);
    List<Map<String, Object>> getTechnique(String sno);
    List<Map<String, Object>> getClassScore(String major, String grade);
    List<Map<String, Object>> getExcellentScore(String major, String grade);
    List<Map<String, Object>> getMaxRank(String major, String grade);
    List<StuLesson> getLesson(String sno);
    int getLessonCount(String sno);
    List<LessonArrangement> getLessonArrange(String sno);
    List<Teacher> getTeacher(String sclass);
    List<Honor> getHonor(String sno);
    List<Map<String, Object>>  getHonor1(String sno);
    // 获取所有学生的成绩优秀标签
    // 根据学号获取学生的标签云数据
    List<TagCloudData> getStudentTagBySno(String sno);
    List<Map<String, Object>>  getInterestBySno(String sno);
    List<Map<String, Object>>  getAdvantageCount(String sno);
    List<Map<String, Object>>  getAdvantage(String sno);
    List<String>  getBackground(String sno);
    List<Integer> getRankingsByStudent(String  sno);
    int getReadCount(String sno);
    int getPracticeCount(String sno);
}
