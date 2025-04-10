package com.ss.sys.entity;

import cn.hutool.core.annotation.Alias;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Getter;

import java.io.Serializable;
@Getter
@TableName("stu_lesson")
public class StuLesson implements Serializable {
    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    @Alias("ID")
    private String id;

    @Alias("sno")
    private String sno;
    @Alias("课程名")
    private String lessonName;

    @Alias("课程性质")
    private String quality;
    @Alias("课程名")
    private int lessonScore;

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

    public String getLessonName() {
        return lessonName;
    }

    public void setLessonName(String lessonName) {
        this.lessonName = lessonName;
    }

    public String getQuality() {
        return quality;
    }

    public void setQuality(String quality) {
        this.quality = quality;
    }

    public int getLessonScore() {
        return lessonScore;
    }

    public void setLessonScore(int lessonScore) {
        this.lessonScore = lessonScore;
    }

    @Override
    public String toString() {
        return "StuLesson{" +
                "id='" + id + '\'' +
                ", sno='" + sno + '\'' +
                ", lessonName='" + lessonName + '\'' +
                ", quality='" + quality + '\'' +
                ", lessonScore='" + lessonScore + '\'' +
                '}';
    }
}
