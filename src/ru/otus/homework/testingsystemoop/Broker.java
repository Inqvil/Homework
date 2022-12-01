package ru.otus.homework.testingsystemoop;

public class Broker {

    private String question;
    private String answer;
    private String rightAnswer;
    private int index;
// стоит ли ставить эти методы в конструктор? или стоит добавить в toString
    Broker(int index){
        this.index = index;
        setQuestion();
        setAnswer();
        setRightAnswer();
    }

    private void setQuestion(){
        question = QuizData.getQuestion(index);
    }
    private void setAnswer(){
        answer = QuizData.getAnswer(index);
    }
    private void setRightAnswer(){
        rightAnswer = QuizData.getRightAnswers(index);
    }

    public String getRightAnswer(){
        return rightAnswer;
    }

    @Override
    public String toString() {
        return question + "\n" + answer;
    }
}
