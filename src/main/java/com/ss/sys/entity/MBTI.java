package com.ss.sys.entity;

import cn.hutool.core.annotation.Alias;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Getter;

import java.io.Serializable;
@Getter
@TableName("mbti")
public class MBTI implements Serializable {
    private static final long serialVersionUID = 1L;
    @Getter
    @TableId(value = "sno")
    @Alias("学号")
    String sno;

    @Alias("类型")
    String type;

    @Alias("J(判断)")
    Float J;

    @Alias("T(思维)")
    Float T;

    @Alias("S(实感)")
    Float S;

    @Alias("E(外向)")
    Float E;

    @Alias("相关描述")
    String declare;

    public String getSno() {
        return sno;
    }

    public void setSno(String sno) {
        this.sno = sno;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Float getJ() {
        return J;
    }

    public void setJ(Float j) {
        J = j;
    }

    public Float getT() {
        return T;
    }

    public void setT(Float t) {
        T = t;
    }

    public Float getS() {
        return S;
    }

    public void setS(Float s) {
        S = s;
    }

    public Float getE() {
        return E;
    }

    public void setE(Float e) {
        E = e;
    }

    public String getDeclare() {
        return declare;
    }

    public void setDeclare(String declare) {
        this.declare = declare;
    }

    @Override
    public String toString() {
        return "MBTI{" +
                "sno='" + sno + '\'' +
                ", type='" + type + '\'' +
                ", J=" + J +
                ", T=" + T +
                ", S=" + S +
                ", E=" + E +
                ", declare='" + declare + '\'' +
                '}';
    }
}
