package school.mjc.stage0.conditions.task3;

public class AliquotNumbers {
    public void isFirstAliquot(int first, int second) {

        double firstOne = (double)first;

        double secondOne = (double)second;

        if(second % first == 0) {

            System.out.println("Aliquot");

        }

        else {

            System.out.println("Not aliquot");

        }

    }
}
