package com.max.helloworld.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.max.helloworld.HelloApi;

public class HelloTest {  
    @Test  
    public void testHelloWorld() {  
          //1����ȡ�����ļ�ʵ����һ��IoC����  
          ApplicationContext context = new ClassPathXmlApplicationContext("helloworld.xml");  
          //2���������л�ȡBean��ע��˴���ȫ������ӿڱ�̣�����������ʵ�֡�  
           HelloApi helloApi = context.getBean("hello", HelloApi.class); 
           HelloApi helloApi2 = context.getBean("hello2",HelloApi.class);
           helloApi2.sayHello();
           //3��ִ��ҵ���߼�  
           helloApi.sayHello();

    }  
}