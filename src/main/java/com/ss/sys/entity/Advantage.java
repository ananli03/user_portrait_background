package com.ss.sys.entity;

import cn.hutool.core.annotation.Alias;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Getter;

import java.io.Serializable;
@Getter
@TableName("advantage")
public class Advantage implements Serializable {
    private static final long serialVersionUID = 1L;
    @Getter
    @TableId(value = "sno")
    @Alias("学号")
    String sno;

    @Alias("项目名称")
    String projectName;

    @Alias("成就")
    String achievement;

    @Alias("类别")
    String type;

    public String getSno() {
        return sno;
    }

    public void setSno(String sno) {
        this.sno = sno;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getAchievement() {
        return achievement;
    }

    public void setAchievement(String achievement) {
        this.achievement = achievement;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Advantage{" +
                "sno='" + sno + '\'' +
                ", projectName='" + projectName + '\'' +
                ", achievement='" + achievement + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
