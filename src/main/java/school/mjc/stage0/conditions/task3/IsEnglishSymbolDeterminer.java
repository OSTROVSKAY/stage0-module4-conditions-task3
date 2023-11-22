package school.mjc.stage0.conditions.task3;

public class IsEnglishSymbolDeterminer {
    public void isEnglishSymbol(char symbol) {

        int symbolOne = (int) symbol;

        if(symbolOne >= 65 && symbolOne <= 122) {

            System.out.println("English");

        } else {

            System.out.println("Non English");

        }
    }
}
