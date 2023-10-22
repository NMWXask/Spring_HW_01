package org.example.Service;
import org.example.Dao.QuestionDao;
import org.example.Domain.Question;
import java.util.List;

public class QuestionServiceImpl implements QuestionService{
    private final QuestionDao dao;
    private final PrinterService printerService;

    public QuestionServiceImpl(QuestionDao dao, PrinterService printerService) {
        this.dao = dao;
        this.printerService = printerService;
    }

    @Override
    public void printQuestions() {
        List<Question> questions = dao.returnQuestion();
        printerService.printFileToConsole(questions);
    }
}
