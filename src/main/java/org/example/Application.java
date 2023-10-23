package org.example;

import org.example.Service.QuestionService;
import org.example.Service.QuestionServiceImpl;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-context.xml");

        QuestionService service = context.getBean("QuestionService", QuestionServiceImpl.class);
        service.printQuestions();

        context.close();
    }
}