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

    @Test
    public void canRaiseSalary(){
        director.raiseSalary(10.00);
        assertEquals(88000.00, director.getSalary(), 0.00);
    }

    @Test
    public void cantSetNegetiveRaiseSalary(){
        director.raiseSalary(-10.00);
        assertEquals(80000.00, director.getSalary(), 0.00);
    }

    @Test
    public void cantSetNullName(){
        director.setName(null);
        assertEquals("Jeff", director.getName());
    }

    @Test
    public void canPayBonus(){
        assertEquals(1600.00, director.payBonus(),0.00);
    }

}
