package quest;

import java.util.ArrayList;
import java.util.List;

public class QuestionBase {
    private static QuestionBase instance;
    private List<Question> questions;
    private int currentQuestionIndex = 0;

    private QuestionBase() {
        questions = new ArrayList<>();
        questions.add(new Question("img/1.png",
                "BMW",
                "Bentley",
                "Lexus",
                "Audi", 2));
        questions.add(new Question("img/2.png",
                "Brilliance",
                "Skoda",
                "Lexus",
                "Dodge", 1));
        questions.add(new Question("img/3.png",
                "Skoda",
                "Alfa Romeo",
                "Acura",
                "Dodge", 4));
        questions.add(new Question("img/4.png",
                "Mazda",
                "Audi",
                "Brilliance",
                "Dodge", 2));
        questions.add(new Question("img/5.png",
                "Daihatsu",
                "Bentley",
                "BMW",
                "Jaguar", 1));
        questions.add(new Question("img/6.png",
                "Alfa Romeo",
                "Acura",
                "Citroen",
                "Lexus", 2));
        questions.add(new Question("img/7.png",
                "Alfa Romeo",
                "Porsche",
                "Mercedes",
                "Volkswagen", 1));
        questions.add(new Question("img/8.png",
                "Volkswagen",
                "Citroen",
                "Jaguar",
                "BMW", 4));
        questions.add(new Question("img/9.png",
                "Chevrolet",
                "Porsche",
                "Lexus",
                "BMW", 1));
        questions.add(new Question("img/10.png",
                "Alfa Romeo",
                "Porsche",
                "Daewoo",
                "Acura", 3));
        questions.add(new Question("img/11.png",
                "BMW",
                "Mercedes",
                "Ford",
                "Aston Martin", 2));
        questions.add(new Question("img/12.png",
                "Ford",
                "Citroen",
                "Jaguar",
                "Cadillac", 4));
        questions.add(new Question("img/13.png",
                "Ferrari",
                "Acura",
                "Porsche",
                "Mercedes", 1));
        questions.add(new Question("img/14.png",
                "Ferrari",
                "BMW",
                "Chevrolet",
                "Aston Martin", 4));
        questions.add(new Question("img/15.png",
                "Daewoo",
                "Volkswagen",
                "Citroen",
                "BMW", 3));

        currentQuestionIndex = 0;
    }
    public static synchronized QuestionBase getInstance(){
        if (instance == null){
            instance = new QuestionBase();
        }
        return instance;
    }

    public List<Question> getQuestions() {
        return questions;
    }
}