package org.nakul;


import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Quiz quiz = new Quiz();
        quiz.addquestion(new Question("Which is the part of a computer that one can touch and feel ?", Arrays.asList("Hardware" ,"Software"," Programs"," Output"), 0));
        quiz.addquestion(new Question("Which of the following is hardware and not software ?", Arrays.asList("Excel ", "Printer driver ", "Power Point", "CPU"), 3));
        quiz.addquestion(new Question("What is the largest ocean?", Arrays.asList("Atlantic", "Indian", "Arctic", "Pacific"), 3));
        quiz.addquestion(new Question("A device for changing the connection on a connector to a different configuration is ?", Arrays.asList("a converter ", "a component ", "an attachment ", "an adapter "), 3));


        quiz.startquiz();
    }
}