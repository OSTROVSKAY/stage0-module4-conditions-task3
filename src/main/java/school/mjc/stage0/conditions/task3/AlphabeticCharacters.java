package school.mjc.stage0.conditions.task3;

public class AlphabeticCharacters {
    public void vowelDeterminer(char character) {

        int characterOne = (int) character;

        boolean check = characterOne == 65 || characterOne == 97 ||  characterOne == 69|| characterOne == 101 || characterOne == 73 || characterOne == 105 || characterOne == 79 || characterOne == 111 ||characterOne == 85 || characterOne == 117 || characterOne == 89 || characterOne == 121;

        if( characterOne >= 65 && characterOne <= 122 ) {

            if(check) {

                System.out.println("Vowel");

            } else {

                System.out.println("Consonant");

            }

        } else {

            System.out.println("wrong alphabet!");

        }

    }
}
