package StaffTest.TechStaffTest;

import Staff.TechStaff.Developer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;


    @Before
    public void before(){
        developer = new Developer("Jim", "1234NB23", 35000.00);
    }

    @Test
    public void hasName(){
        assertEquals("Jim", developer.getName());
    }

    @Test
    public void hasNI_Number(){
        assertEquals("1234NB23", developer.getNI_Number());
    }

    @Test
    public void hasSalary(){
        assertEquals(35000, developer.getSalary(), 0.00);
    }

}
