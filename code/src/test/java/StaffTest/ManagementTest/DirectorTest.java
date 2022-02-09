package StaffTest.ManagementTest;

import Staff.Managment.Director;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void before(){
        director = new Director("Jeff","124BN23", 80000.00, "Tech", 1000000.00);
    }

    @Test
    public void hasBudget(){
        assertEquals(1000000.00, director.getBudget(), 0.00);
    }

    @Test
    public void hasDeptName(){
        assertEquals("Tech", director.getDeptName());
    }
}
