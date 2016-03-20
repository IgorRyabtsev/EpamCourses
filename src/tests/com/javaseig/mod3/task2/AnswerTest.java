package tests.com.javaseig.mod3.task2;

import com.javaseig.mod3.task2.Answer;
import com.javaseig.mod3.task2.Question;
import org.junit.Before;
import org.junit.Test;

import java.util.Locale;

import static org.junit.Assert.*;

/**
 * Created by igor on 20.03.16.
 */
public class AnswerTest {
    String[] quE, quR;
    String[] anE, anR;
    @Before
    public void putQandA() {
        quE = new String[3];
        anE = new String[3];
        quR = new String[3];
        anR = new String[3];
        quE[0] = "how much tooth has an adult person?";
        quE[1] = "Capital of Russia?";
        quE[2] = "A and B were sitting on the tube, A dropped B lost what was left on the tube?";
        quR[0] = "\u0421\u043a\u043e\u043b\u044c\u043a\u043e \u0437\u0443\u0431\u043e\u0432 \u0443 \u0432\u0437\u0440\u043e\u0441\u043b\u043e\u0433\u043e \u0447\u0435\u043b\u043e\u0432\u0435\u043a\u0430?";
        quR[1] = "\u041d\u0430\u0437\u043e\u0432\u0438\u0442\u0435 \u0441\u0442\u043e\u043b\u0438\u0446\u0443 \u0420\u043e\u0441\u0441\u0438\u0438?";
        quR[2] = "\u0410 \u0438 \u0411 \u0441\u0438\u0434\u0435\u043b\u0438 \u043d\u0430 \u0442\u0440\u0443\u0431\u0435, \u0410 \u0443\u043f\u0430\u043b\u043e \u0411 \u043f\u0440\u043e\u043f\u0430\u043b\u043e \u0447\u0442\u043e \u043e\u0441\u0442\u0430\u043b\u043e\u0441\u044c \u043d\u0430 \u0442\u0440\u0443\u0431\u0435?";

        anE[0] = "Thirty two";
        anE[1] = "Moscow";
        anE[2] = "And";
        anR[0] = "\u0442\u0440\u0438\u0434\u0446\u0430\u0442\u044c \u0434\u0432\u0430";
        anR[1] = "\u041c\u043e\u0441\u043a\u0432\u0430";
        anR[2] = "\u0418";
    }

    @Test
    public void ruQuest() {
        Locale l = new Locale("ru","RU");
        Answer ans = new Answer(l);
        Question ques = new Question(l);
        //for questions
        for (int i = 1; i <= 3; i++) {
            assertTrue( ques.getValue(""+i).equals(quR[i-1]));
        }
    }

    @Test
    public void ruAnsw() {
        Locale l = new Locale("ru","RU");
        Answer ans = new Answer(l);
        Question ques = new Question(l);
        //for answers
        for (int i = 1; i <= 3; i++) {
            assertTrue( ans.getValue(""+i).equals(anR[i-1]));
        }
    }

    @Test
    public void enQuest() {
        Locale l = new Locale("en","US");
        Answer ans = new Answer(l);
        Question ques = new Question(l);
        //for questions
        for (int i = 1; i <= 3; i++) {
            assertTrue( ques.getValue(""+i).equals(quE[i-1]));
        }
    }

    @Test
    public void enAnsw() {
        Locale l = new Locale("en","US");
        Answer ans = new Answer(l);
        Question ques = new Question(l);
        //for answers
        System.out.println(ans.getValue(""+3) + " = " + anE[2]);
        for (int i = 1; i <= 3; i++) {
            assertTrue( ans.getValue(""+i).equals(anE[i-1]));
        }
    }


}