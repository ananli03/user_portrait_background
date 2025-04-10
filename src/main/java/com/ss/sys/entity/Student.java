package com.ss.sys.entity;

import cn.hutool.core.annotation.Alias;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Getter;

import java.io.Serializable;


@TableName("stu_information")
public class Student implements Serializable {

    private static final long serialVersionUID = 1L;

   @Getter
    @TableId(value = "id", type = IdType.AUTO)
    @Alias("ID")
    private String id;

    @Alias("sno")
    private String sno;
    @Alias("姓名")
    private String name;
    @Alias("密码")
    private String password;
    @Alias("性别")
    private String sex;

    @Alias("年龄")
    private Integer age;

    @Alias("政治面貌")
    private String politics;

    @Alias("籍贯")
    private String snative;
    @Alias("民族")
    private String nation;
    @Alias("出生日期")
    private String birth;
    @Alias("家庭住址")
    private String address;
    @Alias("电子邮箱")
    private String email;
    @Alias("电话号码")
    private String phone;
    @Alias("每月消费")
    private int consumption;
    @Alias("家庭年收入")
    private int householdIncome;
    @Alias("心理健康分数")
    private int mentalHealth;
    @Alias("学院")
    private String college;

    @Alias("专业")
    private String major;

    @Alias("年级")
    private String grade;
    @Alias("班级")
    private String sclass;
    @Alias("入学年份")
    private String enrollment;
    @Alias("学制")
    private String schoolLength;
    @Alias("住宿信息")
    private String accommodation;

    @Alias("培养层次")
    private String status;
    @Alias("绩点")
    private float GPA;

    @Alias("四级成绩")
    private Integer levelfour;

    @Alias("六级成绩")
    private Integer levelsix;

    @Alias("综合测评分数")
    private Integer synthesisScore;

    @Alias("综合测评班级排名")
    private Integer synthesisClassranking;

    @Alias("综合测评专业排名")
    private Integer synthesisMajorranking;
    @Alias("德育")
    private Integer moral;
    @Alias("知识与学习能力")
    private Integer study;
    @Alias("实践与创新能力")
    private Integer innovate;
    @Alias("体育美育劳育")
    private Integer sport;
    @Alias("职业技能类")
    private Integer career;
    @Alias("学科与问题竞赛")
    private Integer competition;
    @Alias("著作及论文作品")
    private Integer production;
    @Alias("社会工作")
    private Integer work;
    @Alias("社会实践")
    private Integer practice;

    @Alias("测评年份")
    private Integer assessmentYear;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSno() {
        return sno;
    }

    public void setSno(String sno) {
        this.sno = sno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getPolitics() {
        return politics;
    }

    public void setPolitics(String politics) {
        this.politics = politics;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public String getAddress() {
        return address;
    }

    public String getEnrollment() {
        return enrollment;
    }

    public void setEnrollment(String enrollment) {
        this.enrollment = enrollment;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getConsumption() {
        return consumption;
    }

    public void setConsumption(int consumption) {
        this.consumption = consumption;
    }

    public int getHouseholdIncome() {
        return householdIncome;
    }

    public void setHouseholdIncome(int householdIncome) {
        this.householdIncome = householdIncome;
    }

    public int getMentalHealth() {
        return mentalHealth;
    }

    public void setMentalHealth(int mentalHealth) {
        this.mentalHealth = mentalHealth;
    }

    public String getSclass() {
        return sclass;
    }

    public void setSclass(String sclass) {
        this.sclass = sclass;
    }

    public String getSchoolLength() {
        return schoolLength;
    }

    public void setSchoolLength(String schoolLength) {
        this.schoolLength = schoolLength;
    }

    public String getAccommodation() {
        return accommodation;
    }

    public void setAccommodation(String accommodation) {
        this.accommodation = accommodation;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public float getGPA() {
        return GPA;
    }

    public void setGPA(float GPA) {
        this.GPA = GPA;
    }

    public Integer getLevelfour() {
        return levelfour;
    }

    public void setLevelfour(Integer levelfour) {
        this.levelfour = levelfour;
    }

    public Integer getLevelsix() {
        return levelsix;
    }

    public void setLevelsix(Integer levelsix) {
        this.levelsix = levelsix;
    }

    public Integer getSynthesisScore() {
        return synthesisScore;
    }

    public void setSynthesisScore(Integer synthesisScore) {
        this.synthesisScore = synthesisScore;
    }

    public Integer getSynthesisClassranking() {
        return synthesisClassranking;
    }

    public void setSynthesisClassranking(Integer synthesisClassranking) {
        this.synthesisClassranking = synthesisClassranking;
    }

    public Integer getSynthesisMajorranking() {
        return synthesisMajorranking;
    }

    public void setSynthesisMajorranking(Integer synthesisMajorranking) {
        this.synthesisMajorranking = synthesisMajorranking;
    }

    public String getSnative() {
        return snative;
    }

    public void setSnative(String snative) {
        this.snative = snative;
    }

    public Integer getMoral() {
        return moral;
    }

    public void setMoral(Integer moral) {
        this.moral = moral;
    }

    public Integer getStudy() {
        return study;
    }

    public void setStudy(Integer study) {
        this.study = study;
    }

    public Integer getInnovate() {
        return innovate;
    }

    public void setInnovate(Integer innovate) {
        this.innovate = innovate;
    }

    public Integer getSport() {
        return sport;
    }

    public void setSport(Integer sport) {
        this.sport = sport;
    }

    public Integer getCareer() {
        return career;
    }

    public void setCareer(Integer career) {
        this.career = career;
    }

    public Integer getCompetition() {
        return competition;
    }

    public void setCompetition(Integer competition) {
        this.competition = competition;
    }

    public Integer getProduction() {
        return production;
    }

    public void setProduction(Integer production) {
        this.production = production;
    }

    public Integer getWork() {
        return work;
    }

    public void setWork(Integer work) {
        this.work = work;
    }

    public Integer getPractice() {
        return practice;
    }

    public void setPractice(Integer practice) {
        this.practice = practice;
    }

    public Integer getAssessmentYear() {
        return assessmentYear;
    }

    public void setAssessmentYear(Integer assessmentYear) {
        this.assessmentYear = assessmentYear;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", sno='" + sno + '\'' +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", politics='" + politics + '\'' +
                ", snative='" + snative + '\'' +
                ", nation='" + nation + '\'' +
                ", birth='" + birth + '\'' +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", consumption=" + consumption +
                ", householdIncome=" + householdIncome +
                ", mentalHealth=" + mentalHealth +
                ", college='" + college + '\'' +
                ", major='" + major + '\'' +
                ", grade='" + grade + '\'' +
                ", sclass='" + sclass + '\'' +
                ", enrollment='" + enrollment + '\'' +
                ", schoolLength='" + schoolLength + '\'' +
                ", accommodation='" + accommodation + '\'' +
                ", status='" + status + '\'' +
                ", GPA=" + GPA +
                ", levelfour=" + levelfour +
                ", levelsix=" + levelsix +
                ", synthesisScore=" + synthesisScore +
                ", synthesisClassranking=" + synthesisClassranking +
                ", synthesisMajorranking=" + synthesisMajorranking +
                ", moral=" + moral +
                ", study=" + study +
                ", innovate=" + innovate +
                ", sport=" + sport +
                ", career=" + career +
                ", competition=" + competition +
                ", production=" + production +
                ", work=" + work +
                ", practice=" + practice +
                ", assessmentYear=" + assessmentYear +
                '}';
    }
}