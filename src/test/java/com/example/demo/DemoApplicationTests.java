package com.example.demo;

import com.example.demo.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import  com.example.demo.domain.User;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

// 获取启动类，加载配置，确定装载 Spring 程序的装载方法，它回去寻找 主配置启动类（被 @SpringBootApplication 注解的）
@SpringBootTest
// 让 JUnit 运行 Spring 的测试环境， 获得 Spring 环境的上下文的支持
@RunWith(SpringRunner.class)
class DemoApplicationTests {

    /**
     *
     * @author 明天的地平线
     *
     * SpringBoot 之前的版本配置单元测试类时使用 @SpringApplicationConfiguration(Application.class)
     * SpringBoot 1.5.9 改用@SpringBootTest(classes = Application.class)
     *
     */
    @Autowired
    private UserRepository userRepository;

    /**
     *
     */
//    @Test
//    public void testAddUser() throws Exception{
//        User user = new User();
//        user.setName("zhangsan");
//        user.setAge(23);
//        userRepository.save(user);
//
//        User user1 = new User();
//        user1.setName("zhfddangsan");
//        user1.setAge(233);
//        userRepository.save(user1);
//    }

    @Test
    public void testQueryUserList() throws Exception{
        List<User> list = userRepository.findAll();
        for(User user : list){
            System.out.println(user.getName());
        }
    }

    @Test
    public void testQuery() throws Exception{
        List<User> list = userRepository.findAllByAge(23);
        for(User user : list){
            System.out.println(user);
        }
    }
}
