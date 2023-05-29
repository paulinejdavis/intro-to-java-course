package com.cbfacademy;

public class StringExercises {

    public String fromCharacters(char[] inputCharacters) {
        return new String(inputCharacters);
    }

    public Long howMany(String text, Character character) {
        long count = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == character) {
                count++;
            }
        }
        return count;
    }

    public Boolean isPalindrome(String word) {
        int i = 0;
        int j = word.length() - 1;
        while (i < j) {
            if (word.charAt(i) != word.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public String getName() {
        return "String Exercises";
    }

    public static void main(String... args) {
        StringExercises exercises = new StringExercises();
        char[] characters = {'h', 'e', 'l', 'p'};
        String result = exercises.fromCharacters(characters);
        System.out.println(result);
    }
}

//    This might help:
//
//        1) "Build" menu -> "Rebuild Project". Sometimes Intellij doesn't rewrite the classes because they already exist, this way you ask Intellij to rewrite everything.
//
//        2) "Run" menu -> "Edit configuration" -> delete the profile -> add back the profile ("Application" if it's a Java application), choose your main class from the "Main Class" dropdown menu.
//
//        3)"Build" menu -> "Rebuild Project".