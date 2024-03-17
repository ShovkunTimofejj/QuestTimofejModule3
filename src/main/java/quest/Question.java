package quest;

import java.util.Objects;

public class Question {
    private String question;
    private final String answerOption1;
    private final String answerOption2;
    private final String answerOption3;
    private final String answerOption4;
    private final int rightAnswer;

    public Question(String question, String answerOption1, String answerOption2, String answerOption3, String answerOption4, int rightAnswer) {
        this.question = question;
        this.answerOption1 = answerOption1;
        this.answerOption2 = answerOption2;
        this.answerOption3 = answerOption3;
        this.answerOption4 = answerOption4;
        this.rightAnswer = rightAnswer;
    }

    public String getQuestion() {
        return question;
    }

    public String getAnswerOption1() {
        return answerOption1;
    }

    public String getAnswerOption2() {
        return answerOption2;
    }

    public String getAnswerOption3() {
        return answerOption3;
    }

    public String getAnswerOption4() {
        return answerOption4;
    }

    public int getRightAnswer() {
        return rightAnswer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Question question1 = (Question) o;
        return rightAnswer == question1.rightAnswer && Objects.equals(question, question1.question) && Objects.equals(answerOption1, question1.answerOption1) && Objects.equals(answerOption2, question1.answerOption2) && Objects.equals(answerOption3, question1.answerOption3) && Objects.equals(answerOption4, question1.answerOption4);
    }

    @Override
    public int hashCode() {
        return Objects.hash(question, answerOption1, answerOption2, answerOption3, answerOption4, rightAnswer);
    }
}