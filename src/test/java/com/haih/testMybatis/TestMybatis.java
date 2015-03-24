package com.haih.testMybatis;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;
import com.haih.pojo.User;
import com.haih.service.IUserService;

@RunWith(SpringJUnit4ClassRunner.class)
// 表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = { "classpath:spring-mybatis.xml" })
public class TestMybatis {
    private static Logger LOG = Logger.getLogger(TestMybatis.class);
    // private ApplicationContext ac = null;

    @Resource
    private IUserService userService = null;

    // @Before
    // public void before() {
    // ac = new ClassPathXmlApplicationContext("applicationContext.xml");
    // userService = (IUserService) ac.getBean("userService");
    // }
    @Test
    public void test1() {
        User user = userService.getUserById(1);
        System.out.println(user.getUserName());
        LOG.info("值：" + user.getUserName());
        LOG.info(JSON.toJSONString(user));
    }
}
