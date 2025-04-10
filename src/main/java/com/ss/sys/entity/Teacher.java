package com.ss.sys.entity;

import cn.hutool.core.annotation.Alias;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Getter;

import java.io.Serializable;

@Getter
@TableName("teacher")
public class Teacher implements Serializable {
    private static final long serialVersionUID = 1L;

    @TableId(value = "tno", type = IdType.AUTO)
    @Alias("工号")
    private String tno;
    @Getter
    @Alias("姓名")
    private String name;

    @Alias("性别")
    private String sex;

    @Alias("职位")
    private String position;

    @Alias("所管理班级")
    private String sclass;

    @Alias("电话号码")
    private String phone;

    @Alias("所属学院")
    private String college;

    public String getTno() {
        return tno;
    }

    public void setTno(String tno) {
        this.tno = tno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getSclass() {
        return sclass;
    }

    public void setSclass(String sclass) {
        this.sclass = sclass;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "tno='" + tno + '\'' +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", position='" + position + '\'' +
                ", sclass='" + sclass + '\'' +
                ", phone='" + phone + '\'' +
                ", college='" + college + '\'' +
                '}';
    }
}
