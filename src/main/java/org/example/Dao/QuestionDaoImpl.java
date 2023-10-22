package org.example.Dao;
import org.example.Domain.Answer;
import org.example.Domain.Question;
import org.example.Exceptions.QuestionReadException;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.*;
public class QuestionDaoImpl implements QuestionDao {
    public List<Question> returnQuestion() {
        List<Question>questions = new ArrayList<>();
        String fileName = "QA.csv";
        InputStream inStream = getClass().getClassLoader().getResourceAsStream(fileName);
        try(InputStreamReader csvStream = new InputStreamReader(inStream,StandardCharsets.UTF_8);
        BufferedReader reader = new BufferedReader(csvStream)){
            String line;
            while((line = reader.readLine())!=null){
            String[]words = line.split(";");
            Question questionFromFile = new Question(words[0],new Answer(words[1],true));
            questions.add(questionFromFile);
            }
        } catch (IOException e) {
            throw new QuestionReadException();
        }
        return questions;
    }
}
