package school.mjc.stage0.conditions.task3;

public class SalaryCalculator {
    public void calculateSalary(int salary) {

        double salaryOut;

        if(salary != 0 && salary > 0) {

            if(salary <= 10000) {

                salaryOut = (double)salary - ((double)salary )* 0.15;

                System.out.println(salaryOut);

            } else if ( 10000 < salary && salary <= 20000) {

                salaryOut = (double)salary - ((double)salary )* 0.18;

                System.out.println(salaryOut);

            } else if (salary > 20000) {

                salaryOut = (double)salary - ((double)salary )* 0.2;

                System.out.println(salaryOut);

            }

        } else {

            System.out.println("wrong input!");

        }

    }
}
