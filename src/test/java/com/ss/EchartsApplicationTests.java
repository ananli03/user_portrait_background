package com.ss;

import com.ss.sys.entity.Student;
import com.ss.sys.mapper.StudentMapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
class EchartsApplicationTests {

    @Resource
    private StudentMapper studentMapper;
    @Test
    void testMapper() {
        List<Student> sc = studentMapper.selectList(null);
        //alt+enter 导入接收值
        sc.forEach(System.out::println);
    }

}
