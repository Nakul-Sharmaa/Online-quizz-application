package org.nakul;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Quiz {

    private List<Question> questions;
    private int score;
    private int currentquestionindex;


    public Quiz() {
        questions =new ArrayList<>();
        score =0;
        currentquestionindex =0;
    }
    public void addquestion(Question question){
        questions.add(question);
    }
    public Question getnextquestion(){
        if (currentquestionindex <questions.size() ) {
            return questions.get(currentquestionindex++);
        }
        return null;
    }
    public boolean checkAnswer(int questionindex,int useranswerindex){
        return questions.get(questionindex).getCorrectanswerindex()==useranswerindex;
    }

    public void updatescore(boolean iscorrect){
        if (iscorrect){
            score++;
        }
    }
    public void displayscore(){
        System.out.println("your score"+ score+"/"+questions.size());
    }

    public void startquiz(){
        Scanner sc =new Scanner(System.in);
        Question question;
        while((question =getnextquestion())!=null){
        presentquestion(question);
        int useranswer = getuserinput(sc ,question.getOptions().size());
        boolean iscorrect =checkAnswer(currentquestionindex-1, useranswer-1);
        provideFeedback(iscorrect);
        updatescore(iscorrect);
        }
        displayscore();
        sc.close();
    }


    private void presentquestion(Question question) {
        System.out.println(question.getQuestiontext());
        List<String> options = question.getOptions();
        for (int i = 0; i < options.size(); i++) {
            System.out.println((i + 1) + ". " + options.get(i));
        }
    }

    private int getuserinput(Scanner scanner, int numberOfOptions) {
        int userInput = -1;
        while (userInput < 1 || userInput > numberOfOptions) {
            System.out.print("Your answer (1-" + numberOfOptions + "): ");
            if (scanner.hasNextInt()) {
                userInput = scanner.nextInt();
            } else {
                scanner.next(); // consume invalid input
            }
        }
        return userInput;
    }
    private void provideFeedback(boolean isCorrect) {
        if (isCorrect) {
            System.out.println("Correct!");
        } else {
            System.out.println("Incorrect.");
        }
    }
}



