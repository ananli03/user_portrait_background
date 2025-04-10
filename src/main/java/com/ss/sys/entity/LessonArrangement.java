package com.ss.sys.entity;

import cn.hutool.core.annotation.Alias;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Getter;

import java.io.Serializable;
@Getter
@TableName("lesson_arrange")
public class LessonArrangement implements Serializable {
    private static final long serialVersionUID = 1L;
    @TableId(value = "id", type = IdType.AUTO)
    @Getter
    @Alias("ID")
    private String id;

    @Getter
    @Alias("学号")
    private String sno;

    @Alias("学年学期")
    private String time;

    @Alias("课程属性")
    private String attribute;

    @Alias("课程名称")
    private String lessonName;

    @Alias("课程性质")
    private String quality;

    @Alias("课程类别")
    private String type;

    @Alias("学分")
    private Float credit;

    @Alias("总学时")
    private int  period;

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

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getAttribute() {
        return attribute;
    }

    public void setAttribute(String attribute) {
        this.attribute = attribute;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Float getCredit() {
        return credit;
    }

    public void setCredit(Float credit) {
        this.credit = credit;
    }

    public int getPeriod() {
        return period;
    }

    public void setPeriod(int period) {
        this.period = period;
    }

    @Override
    public String toString() {
        return "LessonArrangement{" +
                "id='" + id + '\'' +
                ", sno='" + sno + '\'' +
                ", time='" + time + '\'' +
                ", attribute='" + attribute + '\'' +
                ", lessonName='" + lessonName + '\'' +
                ", quality='" + quality + '\'' +
                ", type='" + type + '\'' +
                ", credit=" + credit +
                ", period=" + period +
                '}';
    }
}
