package com.ss.sys.entity;

import cn.hutool.core.annotation.Alias;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Getter;

import java.io.Serializable;
@Getter
@TableName("reading")
public class Reading implements Serializable {
    @Getter
    @TableId(value = "sno")
    @Alias("学号")
    String sno;

    @Alias("书籍名称")
    String bookName;

    @Alias("借阅时间")
    String borrowTime;

    public String getSno() {
        return sno;
    }

    public void setSno(String sno) {
        this.sno = sno;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBorrowTime() {
        return borrowTime;
    }

    public void setBorrowTime(String borrowTime) {
        this.borrowTime = borrowTime;
    }

    @Override
    public String toString() {
        return "Reading{" +
                "sno='" + sno + '\'' +
                ", bookName='" + bookName + '\'' +
                ", borrowTime='" + borrowTime + '\'' +
                '}';
    }
}
