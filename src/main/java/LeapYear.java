public class LeapYear {
    public boolean leapYear;

    public boolean isLeapYear(int year) {

        if (year < 1700) {
            System.err.println("Year below 1700 is not valid");
        } else {
            if (year % 4 == 0){
                if (year % 100 == 0) {
                    if (year % 400 == 0) {
                        leapYear = true;
                    } else leapYear = false;
                } else leapYear = true;
            } else leapYear = false;

        }
        return leapYear;

    }

}

