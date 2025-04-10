package com.ss.sys.entity;

import cn.hutool.core.annotation.Alias;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Getter;

import java.io.Serializable;
@Getter
@TableName("techniqueInfo")
public class Technique implements Serializable {
    private static final long serialVersionUID = 1L;
    @Getter
    @TableId(value = "sno")
    @Alias("学号")
    String sno;

    @Alias("擅长技术")
    String technique;

    public String getSno() {
        return sno;
    }

    public void setSno(String sno) {
        this.sno = sno;
    }

    public String getTechnique() {
        return technique;
    }

    public void setTechnique(String technique) {
        this.technique = technique;
    }
}
