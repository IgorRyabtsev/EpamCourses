package tests.com.javaseig.mod2.task67;

import com.javaseig.mod2.task67.NuclearBoat;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by igor on 08.03.16.
 */
public class NuclearBoatTest {

    @Test
    public void toSail() {
        NuclearBoat nb = new NuclearBoat(500,true,550,"Admiral",20);
        assertTrue(nb.getName()=="Admiral" && nb.isSwimming()==true && nb.getImmensionDepth()==550 && nb.getSpeed()==20);
    }

    @Test
    public void changeSpeed() {
        NuclearBoat nb = new NuclearBoat(500,true,550,"Admiral",20);
        nb.setImmensionDepth(300);
        nb.setSpeed(25);
        assertTrue(nb.getName()=="Admiral" && nb.isSwimming()==true && nb.getImmensionDepth()==300 && nb.getSpeed()==25);
    }

}