package geco;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LoginGeneratorTest {

    LoginService log1,log2;
    LoginGenerator lg1,lg2;

    @Before
    public void setUp() {

        log1 = new LoginService(new String[] {"JROL","BPER","CGUR","JDU","JRAL","JRAL1"});
        log2 = new LoginService(new String[] {});

        lg1 = new LoginGenerator(log1);
        lg2 = new LoginGenerator(log2);
    }

    @Test
    public void cT1() {

        assertEquals(lg1.generateLoginForNomAndPrenom("Durant","Paul"),"PDUR");

    }

    @Test
    public void ct() {

        assertEquals(lg1.generateLoginForNomAndPrenom("Ralling","John"),"JRAL2");

    }

    @Test
    public void ct2() {

        assertEquals(lg1.generateLoginForNomAndPrenom("Rolling","Jean"),"JROL1");

    }

    @Test
    public void ct3() {

        assertEquals(lg1.generateLoginForNomAndPrenom("Dùrand","Paul"),"PDUR");

    }

}