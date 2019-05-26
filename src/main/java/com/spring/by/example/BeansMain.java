package com.spring.by.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.by.example.beans.Student;


public class BeansMain {
	
      public static void main(String[] args) {
    	  
             ApplicationContext appCon = new ClassPathXmlApplicationContext ("beans.xml");
             Student factory = (Student)appCon.getBean("student");
             factory.displayInfo();
             
      }
}

