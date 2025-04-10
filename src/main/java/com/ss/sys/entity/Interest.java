package com.ss.sys.entity;

import cn.hutool.core.annotation.Alias;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Getter;

import java.io.Serializable;
@Getter
@TableName("interest")
public class Interest implements Serializable {
    private static final long serialVersionUID = 1L;
    @Getter
    @TableId(value = "sno")
    @Alias("学号")
    String sno;

    @Alias("活动名称")
    String project;

    @Alias("类别")
    String type;

    public String getSno() {
        return sno;
    }

    public void setSno(String sno) {
        this.sno = sno;
    }

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Interest{" +
                "sno='" + sno + '\'' +
                ", project='" + project + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
