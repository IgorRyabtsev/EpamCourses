package tests.com.javaseig.mod3.task1;

import com.javaseig.mod3.task1.CrazyLogger;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by igor on 20.03.16.
 */
public class CrazyLoggerTest {

    @Test
    public void findLogs() {
        CrazyLogger cl=new CrazyLogger();
        cl.addLog("Add new message");
        cl.addLog("Strange log");
        cl.addLog("Unbelievable log");
        System.out.println(cl.fingLog("ssss").toString());
        assertTrue(cl.fingLog("Add").toString().contains("Add new message")
                    && cl.fingLog("log").toString().contains("Strange log")
                    && cl.fingLog("log").toString().contains("Unbelievable log")
                    && cl.fingLog("sdasdasd").toString().contains(""));
    }

}