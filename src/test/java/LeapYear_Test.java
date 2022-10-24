import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LeapYear_Test {
    LeapYear testLeapYear = new LeapYear();

    @Test
    public void Is_divisible_with_4_not_100(){
        assertTrue(testLeapYear.isLeapYear(1996));
        //1996 is a leap year divisible with 4 but not 100
    }

    @Test
    public void Is_divisible_by_400(){

        assertTrue(testLeapYear.isLeapYear(2000));
        //2000 is divisible by 400
    }

    @Test
    public void not_divisible_by_4(){

        assertFalse(testLeapYear.isLeapYear(2001));
        //not divisible by 4, not a leap year
    }

    @Test
    public void divisible_by_100_but_not_400(){

        assertFalse(testLeapYear.isLeapYear(1900));
        //divisible by 100 but not 400, not a leap year
    }



}
