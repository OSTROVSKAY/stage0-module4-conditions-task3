package school.mjc.stage0.conditions.task3;

public class DaysInMonthPrinter {
    public void amountOfDays(int month) {

        boolean checkOne = month > 0 &&  month < 13;

        boolean checkTwo = month == 2;

        boolean checkThree = month == 4 || month == 6 || month == 9 || month == 11;

        boolean checkFour = month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12;

        if(checkOne) {

            if(checkTwo) {

                System.out.println(28);

            } else if (checkThree) {

                System.out.println(30);

            } else if (checkFour) {

                System.out.println(31);

            }

        } else {

           System.out.println("wrong number!");

        }
    }
}
