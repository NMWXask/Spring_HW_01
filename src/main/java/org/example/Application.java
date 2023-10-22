package org.example;

import org.example.Dao.QuestionDao;
import org.example.Service.PrinterService;
import org.example.Service.QuestionService;
import org.example.Service.QuestionServiceImpl;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-context.xml");
        QuestionDao questionDao = context.getBean("QuestionDao", QuestionDao.class);
        PrinterService printerService = context.getBean("PrinterService", PrinterService.class);
        QuestionService service = context.getBean("QuestionService", QuestionServiceImpl.class);
        service.printQuestions();
        context.close();
    }
}