package com.ss.sys.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ss.sys.entity.*;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

@Mapper
public interface StudentMapper extends BaseMapper<Student> {
    public List<Student> selectAll();
    public List<Student> getscore(String sno);
    public List<MBTI> getMBTI(String sno);
    public List<Map<String, Object>> getTechnique(String sno);
    public List<Map<String, Object>> getClassScore(@Param("major") String major, @Param("grade") String grade);
    public List<Map<String, Object>> getExcellentScore(@Param("major") String major, @Param("grade") String grade);
    public List<Map<String, Object>> getMaxRank(@Param("major") String major, @Param("grade") String grade);
    public List<StuLesson> getLesson(String sno);
    int getLessonCount(@Param("sno") String sno);
    public List<LessonArrangement> getLessonArrange(String sno);
    public List<Teacher> getTeacher(String sclass);
    public List<Honor> getHonor(String sno);
    // 查询所有学生，按专业和排名排序
    List<Student> selectAllStudentsOrderByMajorAndRank();
    public List<Map<String, Object>> getInterestBySno(String sno);
    public List<Map<String, Object>> getAdvantageCount(String sno);
    public List<Map<String, Object>> getAdvantage(String sno);
    public List<String> getBackground(String sno);

    List<TagCloudData> getStudentTagBySno(String sno);
    Student selectStudentBySno(String sno);
    List<Integer> getRankingsByStudent(String sno);
    int getReadCount(@Param("sno") String sno);
    int getPracticeCount(@Param("sno") String sno);
    public List<Map<String, Object>> getHonor1(String sno);

}

