package com.ss.sys.entity;

import cn.hutool.core.annotation.Alias;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Getter;

import java.io.Serializable;
@Getter
@TableName("honor")
public class Honor implements Serializable {
    private static final long serialVersionUID = 1L;
    @TableId(value = "sno", type = IdType.AUTO)
    @Getter
    @Alias("学号")
    private String sno;

    @Alias("荣誉称号")
    private String title;

    @Alias("获取时间")
    private String date;

    @Alias("类别")
    private String type;

    public String getSno() {
        return sno;
    }

    public void setSno(String sno) {
        this.sno = sno;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Honor{" +
                "sno='" + sno + '\'' +
                ", title='" + title + '\'' +
                ", date='" + date + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
