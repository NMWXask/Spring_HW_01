package org.example.Service;
import org.example.Domain.Question;
import java.util.List;

public class ConsolePrinterServiceImpl implements PrinterService {

    @Override
    public void printFileToConsole(List<Question> questions) {
        for(Question q:questions){
            System.out.println(q);
        }
    }
}
