package geco;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class LoginServiceTest {
    LoginService log1,log2;

    @Before
    public void setUp() {

        log1 = new LoginService(new String[] {"JROL","BPER","CGUR","JDU","JRAL"});
        log2 = new LoginService(new String[] {});
    }

    @Test
    public void  isEmptyTest() {

        assertEquals(log2.findAllLogins().size(),0);
    }

    @Test
    public void  addTest() {

        log1.addLogin("JRAL1");
        assertTrue(log1.loginExists("JRAL1"));
    }

    @Test
    public void  loginExistTest() {

        assertFalse(log1.loginExists("AJDU"));
    }

    @Test
    public void  loginStartwithTest() {

        assertEquals(1,log1.findAllLoginsStartingWith("C").size());
    }

    @Test
    public void  allLoginTest() {
        List<String> list= new ArrayList<>(Arrays.asList("JDU",
                "JRAL","JROL"));
        assertEquals(log1.findAllLoginsStartingWith("J"),list);

    }

}