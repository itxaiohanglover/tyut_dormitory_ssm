package com.tyut;

import com.tyut.service.AdminService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author xh
 * @Date 2022/1/1
 */
public class TestSpring {
    @Test
    public void test1() {
        //加载配置文件
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        //获取对象
        AdminService adminService = (AdminService)ac.getBean("adminService");
    }
}
