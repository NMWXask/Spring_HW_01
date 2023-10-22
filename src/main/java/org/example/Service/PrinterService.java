package org.example.Service;

import org.example.Domain.Question;

import java.util.List;

public interface PrinterService {
    void printFileToConsole(List<Question>questions);
}
