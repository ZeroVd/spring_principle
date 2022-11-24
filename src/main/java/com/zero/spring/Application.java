package com.zero.spring;

import com.zero.spring.bean.A;
import com.zero.spring.bean.B;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Auther Zero
 * @Date: 2022/11/23 22:16
 */

public class Application {
    public static void main(String[] args) {
        BeanFactory context = new ClassPathXmlApplicationContext("bean.xml");
        A a = context.getBean("a", A.class);
        B b = context.getBean("b", B.class);
        System.out.println(a);
        System.out.println(b);
    }
}


/**
 * 杏花营农场
 * 杏花营镇
 * 大兴街道
 * 水稻乡
 * 西郊乡
 * 城西街道
 * 河南开封经济开发区 X
 * 西湖街道
 * 午朝门街道
 * 梁苑街道 X
 * 北道门街道 X
 * 北郊乡
 * 新城街道 晖达新世界紫檀 4.3
 *
 */