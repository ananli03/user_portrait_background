package com.ss.sys.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ss.sys.entity.*;
import com.ss.sys.mapper.StudentMapper;
import com.ss.sys.service.IStudentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class StudentServiceImpl extends ServiceImpl<StudentMapper, Student> implements IStudentService {

    @Resource
    private StudentMapper studentMapper;

    @Override
    public List<Student> findAll() {
        return studentMapper.selectAll();
    }
    @Override
    public List<Student> getscore(String sno) {
        return studentMapper.getscore(sno);
    }
    @Override
    public List<MBTI> getMBTI(String sno) {
        return studentMapper.getMBTI(sno);
    }
    @Override
    public List<Map<String, Object>> getTechnique(String sno) {
        return studentMapper.getTechnique(sno);
    }
    @Override
    public List<Map<String, Object>> getClassScore(String major, String grade) {
        return studentMapper.getClassScore(major, grade);
    }
    @Override
    public List<Map<String, Object>> getExcellentScore(String major, String grade) {
        return studentMapper.getExcellentScore(major, grade);
    }
    @Override
    public List<Map<String, Object>> getMaxRank(String major, String grade) {
        return studentMapper.getMaxRank(major, grade);
    }
    @Override
    public List<StuLesson> getLesson(String sno) {
        return studentMapper.getLesson(sno);
    }
    @Override
    public int getLessonCount(String sno) {
        return studentMapper.getLessonCount(sno); // 调用 Mapper 层的方法
    }
    @Override
    public List<LessonArrangement> getLessonArrange(String sno) {
        return studentMapper.getLessonArrange(sno);
    }
    @Override
    public List<Teacher> getTeacher(String sclass) {
        return studentMapper.getTeacher(sclass);
    }
    @Override
    public List<Honor> getHonor(String sno) {
        return studentMapper.getHonor(sno);
    }
    @Override
    public List<Map<String, Object>>  getHonor1(String sno) {
        return studentMapper.getHonor1(sno);
    }

    public List<Integer> getRankingsByStudent(String  sno) {
        return studentMapper.getRankingsByStudent(sno);
    }
    @Override
    public List<Map<String, Object>>  getInterestBySno(String sno) {
        return studentMapper.getInterestBySno(sno);
    }
    @Override
    public List<Map<String, Object>>  getAdvantageCount(String sno) {
        return studentMapper.getAdvantageCount(sno);
    }
    @Override
    public List<Map<String, Object>>  getAdvantage(String sno) {
        return studentMapper.getAdvantage(sno);
    }
    @Override
    public int getReadCount(String sno) {
        return studentMapper.getLessonCount(sno); // 调用 Mapper 层的方法
    }
    @Override
    public int getPracticeCount(String sno) {
        return studentMapper.getPracticeCount(sno); // 调用 Mapper 层的方法
    }

    //就创背景
    public List<String>  getBackground(String sno) {
        // 根据学号查询特定学生的信息
        Student student = studentMapper.selectStudentBySno(sno);
        List<String> bg=new ArrayList<>();
        bg.add(getConsumption(student));
        bg.add(getHousehold(student));
        bg.add(getSocialPractice(student));
        bg.add(getSocialWork(student));
        bg.add(getMental(student));
        return bg;
    }
    // 消费水平
    private String getConsumption(Student student) {
        if (student.getConsumption()>=2000) {
            return "高";
        }
        else if (student.getConsumption()>=1000) {
            return "中";
        }
        else if(student.getConsumption()<1000){
            return "低";
        }
        return null;

    }
    // 家庭年收入
    private String getHousehold(Student student) {
        if (student.getHouseholdIncome()>=800000) {
            return "富裕";
        }
        else if (student.getHouseholdIncome()>=300000) {
            return "中产";
        }
        else if (student.getHouseholdIncome()>=80000) {
            return "小康";
        }
        else if (student.getHouseholdIncome()<80000) {
            return "低收入";
        }
        return null;
    }
    // 社会实践经历
    private String getSocialPractice(Student student) {
        String sno=student.getSno();
        int practiceCount=studentMapper.getPracticeCount(sno);
        //System.out.println(practiceCount);
        if (student.getPractice()>=20||practiceCount>=2) {
            return "丰富";
        }
        else if (student.getPractice()>=10||practiceCount==1) {
            return "较多";
        }
        else if(student.getPractice()<10){
            return "较少";
        }
        return null;

    }
    // 团队合作能力
    private String getSocialWork(Student student) {
        if (student.getWork()>=15) {
            return "强";
        }
        else if (student.getWork()>=10) {
            return "中";
        }
        else if(student.getWork()<10){
            return "低";
        }
        return null;

    }
    // 心理健康
    private String getMental(Student student) {
        if (student.getMentalHealth()>=85) {
            return "健康";
        }
        else if (student.getMentalHealth()>=60) {
            return "亚健康";
        }
        else if(student.getConsumption()<60){
            return "不健康";
        }
        return null;

    }

    //词云标签
    @Override
    public List<TagCloudData> getStudentTagBySno(String sno) {
        // 根据学号查询特定学生的信息
        Student student = studentMapper.selectStudentBySno(sno);
        List<Honor> honors = studentMapper.getHonor(sno);
        List<Integer> rankings = studentMapper.getRankingsByStudent(sno);
        int lessonCount= studentMapper.getLessonCount(sno);
        int readCount= studentMapper.getReadCount(sno);
        if (student == null) {
            return null; // 如果没有找到学生，返回 null
        }
        // 获取所有学生的列表，并按专业和排名排序
        List<Student> students = studentMapper.selectAllStudentsOrderByMajorAndRank();
        // 计算每个专业的最大排名数
        Map<String, Integer> majorToMaxRank = calculateMaxRanksByMajor(students);
        // 生成标签列表
        List<TagCloudData> tags = new ArrayList<>();

        // 添加成绩优秀标签
        tags.add(generateTagForStudent(student, majorToMaxRank));

        // 添加英语达人标签
        tags.add(generateEnglishProTags(student));

        // 添加个人荣誉标签
        List<TagCloudData> honorTags = generateHonorProTags(honors);
        tags.addAll(honorTags);
        // 添加稳定输出标签
        tags.add(generateStableProTagsProTags(rankings));
        // 添加养分汲取机标签
        tags.add(generateNutrienyProTags(lessonCount));
        // 添加阅读标签
        tags.add(generateReadProTags(readCount));

        return tags;
    }
    // 计算每个专业的最大排名数
    private Map<String, Integer> calculateMaxRanksByMajor(List<Student> students) {
        Map<String, Integer> majorToMaxRank = new HashMap<>();
        for (Student student : students) {
            String major = student.getMajor();
            int rank = student.getSynthesisMajorranking();
            majorToMaxRank.put(major, Math.max(majorToMaxRank.getOrDefault(major, 0), rank));
        }
        return majorToMaxRank;
    }
    // 根据学生的专业、排名和最大排名数生成标签
    private TagCloudData generateTagForStudent(Student student, Map<String, Integer> majorToMaxRank) {
        String major = student.getMajor();
        int rank = student.getSynthesisMajorranking();
        int maxRank = majorToMaxRank.get(major);
        // 计算value值，排名越高，value值越高
        int value = 100 - (int) ((rank - 1) * (100.0 / (maxRank - 1)));
        // 创建标签
        String tag = "成绩优秀";
        return new TagCloudData(tag, value);
    }
    // 生成英语达人标签
    private TagCloudData generateEnglishProTags(Student student) {
        if (student == null) {
            // Handle the null case appropriately.
            // For example, you could return null or throw an IllegalArgumentException.
            throw new IllegalArgumentException("Student object cannot be null");
        }
        if (student.getLevelfour()>=425&&student.getLevelfour()<550) {
            String tag = "英语达人";
            int value = 70; // 可以根据实际情况调整这个值
            return new TagCloudData(tag, value);
        }
        else if (student.getLevelfour()>=550) {
            String tag = "英语达人";
            int value = 80; // 可以根据实际情况调整这个值
            return new TagCloudData(tag, value);
        }
        return null;
    }
    // 生成个人荣誉标签
    public List<TagCloudData> generateHonorProTags(List<Honor> honors) {
        List<TagCloudData> tags = new ArrayList<>();
        for (Honor honor : honors) {
            if ("personal".equals(honor.getType())) {
                String tag = honor.getTitle();
                // 可以根据实际情况调整 value 值
                int value = 85;
                tags.add(new TagCloudData(tag, value));
            }
        }
        return tags;
    }
    // 生成稳定输出标签
    private TagCloudData generateStableProTagsProTags(List<Integer> rankings) {
            if (rankings != null && rankings.size() > 1) {
                boolean isStable = true;
                for (int i = 1; i < rankings.size(); i++) {
                    if (Math.abs(rankings.get(i) - rankings.get(i - 1)) > 10) {
                        isStable = false;
                        break;
                    }
                }
                if (isStable) {
                    String tag = "稳定输出";
                    int value = 80; // 可以根据实际情况调整这个值
                    return new TagCloudData(tag, value);
                }
            }
        return null;
    }
    // 生成养分汲取机标签
    private TagCloudData generateNutrienyProTags(int lessonCount) {
        String tag = "养分汲取机";
        if (lessonCount>=30&&lessonCount<40) {
            int value = 70; // 可以根据实际情况调整这个值
            return new TagCloudData(tag, value);
        }
        else if(lessonCount>=40&&lessonCount<50){
            int value = 80; // 可以根据实际情况调整这个值
            return new TagCloudData(tag, value);
        }
        else if(lessonCount>=50){
            int value = 90; // 可以根据实际情况调整这个值
            return new TagCloudData(tag, value);
        }
        return null;
    }
    // 生成阅读标签
    private TagCloudData generateReadProTags(int readCount) {

        if (readCount>=1&&readCount<3) {
            String tag = "阅读佛系爱好者";
            int value = 70; // 可以根据实际情况调整这个值
            return new TagCloudData(tag, value);
        }
        else if(readCount>=3&&readCount<5){
            String tag = "阅读爱好者";
            int value = 80; // 可以根据实际情况调整这个值
            return new TagCloudData(tag, value);
        }
        else if(readCount>=5){
            String tag = "阅读狂热爱好者";
            int value = 90; // 可以根据实际情况调整这个值
            return new TagCloudData(tag, value);
        }
        return null;
    }

}
