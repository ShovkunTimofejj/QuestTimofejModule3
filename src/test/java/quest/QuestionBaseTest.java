package quest;

import org.junit.Test;


import static org.junit.Assert.*;

public class QuestionBaseTest {
    @Test
    public void testSingletonInstance() {
        QuestionBase instance1 = QuestionBase.getInstance();
        QuestionBase instance2 = QuestionBase.getInstance();
        assertEquals(instance1, instance2);
    }
    @Test
    public void testQuestionsListNotNull() {
        QuestionBase questionBase = QuestionBase.getInstance();
        assertNotNull(questionBase.getQuestions());
    }
    @Test
    public void testQuestionsListPopulated() {
        QuestionBase questionBase = QuestionBase.getInstance();
        assertFalse(questionBase.getQuestions().isEmpty());
    }
    @Test
    public void testMultipleGetInstanceCalls() {
        QuestionBase instance1 = QuestionBase.getInstance();
        QuestionBase instance2 = QuestionBase.getInstance();
        assertEquals(instance1, instance2);
    }
}