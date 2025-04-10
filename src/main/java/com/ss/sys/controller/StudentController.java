package com.ss.sys.controller;

import com.ss.common.vo.Result;
import com.ss.sys.entity.*;
import com.ss.sys.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private IStudentService studentService;
    @GetMapping("/list")
    public ResponseEntity<List<Student>> listStudents() {
        List<Student> students = studentService.findAll();
        return ResponseEntity.ok(students);
    }

    @GetMapping("/chart/{id}")
    @CrossOrigin
    public Result<Map<String,String>> charts(@PathVariable("id") String id){

        Student student=studentService.getById(id);
        System.out.println(student);
        if (student==null) {
            System.out.println(id);
            return Result.fail("查找错误");
        }
        else {
            Map<String,String> information =new HashMap<>();
        information.put("score",student.getSynthesisScore().toString());
        information.put("classr",student.getSynthesisClassranking().toString());
        information.put("majorr",student.getSynthesisMajorranking().toString());
        return Result.success(information);
        }
        }
    @GetMapping("/scorecharts/{sno}")
    @CrossOrigin
    public ResponseEntity<List<Student>> scorecharts(@PathVariable String sno)  {

        List<Student> student1 = studentService.getscore(sno);

        return ResponseEntity.ok(student1);
    }
    @GetMapping("/classScore")
    public List<Map<String, Object>> getClassScore(
            @RequestParam("major") String major,
            @RequestParam("grade") String grade) {

        List<Map<String, Object>> classScores = studentService.getClassScore(major, grade);

        // 检查结果是否为空
        if (classScores == null || classScores.isEmpty()) {
            return Collections.emptyList();
        } else {
            return classScores;
        }
    }
    @GetMapping("/excellentScore")
    public List<Map<String, Object>> getExcellentScore(
            @RequestParam("major") String major,
            @RequestParam("grade") String grade) {

        List<Map<String, Object>> excellentScores = studentService.getExcellentScore(major, grade);

        // 检查结果是否为空
        if (excellentScores == null || excellentScores.isEmpty()) {
            return Collections.emptyList();
        } else {
            return excellentScores;
        }
    }
    @GetMapping("/maxRank")
    public List<Map<String, Object>> getMaxRank(
            @RequestParam("major") String major,
            @RequestParam("grade") String grade) {

        List<Map<String, Object>> maxranks = studentService.getMaxRank(major, grade);

        // 检查结果是否为空
        if (maxranks == null || maxranks.isEmpty()) {
            return Collections.emptyList();
        } else {
            return maxranks;
        }
    }
    @GetMapping("/lessonCharts/{sno}")
    @CrossOrigin
    public ResponseEntity<List<StuLesson>> lessonCharts(@PathVariable String sno)  {

        List<StuLesson> stuLesson = studentService.getLesson(sno);

        return ResponseEntity.ok(stuLesson);
    }
    @GetMapping("/lessonCount/{sno}")
    public int getStudentLessonCount(@PathVariable("sno") String sno) {
        return studentService.getLessonCount(sno); // 调用 Service 层的方法来获取选课总数
    }
    @GetMapping("/lessonArrange/{sno}")
    @CrossOrigin
    public ResponseEntity<List<LessonArrangement>> lessonArrange(@PathVariable String sno)  {

        List<LessonArrangement> lessonA = studentService.getLessonArrange(sno);

        return ResponseEntity.ok(lessonA);
    }
    @GetMapping("/getTeacher/{sclass}")
    @CrossOrigin
    public ResponseEntity<List<Teacher>> getTeacher(@PathVariable String sclass)  {

        List<Teacher> teacher = studentService.getTeacher(sclass);

        return ResponseEntity.ok(teacher);
    }
    @GetMapping("/getHonor/{sno}")
    @CrossOrigin
    public ResponseEntity<List<Honor>> getHonor(@PathVariable String sno)  {

        List<Honor> honor = studentService.getHonor(sno);

        return ResponseEntity.ok(honor);
    }
    @GetMapping("/getHonor1/{sno}")
    public List<Map<String, Object>> getHonor1(@PathVariable String sno) {
        List<Map<String, Object>> honor1 = studentService.getHonor1(sno);
        if (honor1 == null) {
            return Collections.emptyList();
        }
        return honor1;
    }
    // 根据学号获取学生的兴趣爱好
    @GetMapping("/Interest/{sno}")
    public List<Map<String, Object>> getInterestBySno(@PathVariable String sno) {
        List<Map<String, Object>> interest = studentService.getInterestBySno(sno);
        if (interest == null) {
            return Collections.emptyList();
        }
        return interest;
    }
    // 根据学号获取学生的标签云数据
    @GetMapping("/tag/{sno}")
    public ResponseEntity <List<TagCloudData>> getStudentTagBySno(@PathVariable String sno) {
        List<TagCloudData> tag = studentService.getStudentTagBySno(sno);
        if (tag == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(tag);
    }
    @GetMapping("/getMBTI/{sno}")
    @CrossOrigin
    public ResponseEntity<List<MBTI>> getMBTI(@PathVariable String sno)  {

        List<MBTI> mbti = studentService.getMBTI(sno);

        return ResponseEntity.ok(mbti);
    }

    @GetMapping("/getTechnique/{sno}")
    @CrossOrigin
    public List<Map<String, Object>> getTechnique(@PathVariable String sno)  {

        List<Map<String, Object>> technique = studentService.getTechnique(sno);
        if (technique == null) {
            return Collections.emptyList();
        }
        return technique;
    }
    // 根据学号获取学生的就业优势
    @GetMapping("/AdvantageCount/{sno}")
    public List<Map<String, Object>> getAdvantageCount(@PathVariable String sno) {
        List<Map<String, Object>> ACount = studentService.getAdvantageCount(sno);
        if (ACount == null) {
            return Collections.emptyList();
        }
        return ACount;
    }
    @GetMapping("/Advantage/{sno}")
    public List<Map<String, Object>> getAdvantage(@PathVariable String sno) {
        List<Map<String, Object>> advantage = studentService.getAdvantage(sno);
        if (advantage == null) {
            return Collections.emptyList();
        }
        return advantage;
    }

    // 根据学号获取学生的兴趣爱好
    @GetMapping("/employment/{sno}")
    public List<String> getBackground(@PathVariable String sno) {
        List<String> bg = studentService.getBackground(sno);
        if (bg == null) {
            return Collections.emptyList();
        }
        return bg;
    }
    }
