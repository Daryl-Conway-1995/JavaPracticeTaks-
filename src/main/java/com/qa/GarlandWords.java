package com.qa;

public class GarlandWords {
    public String isThisAGarlandWord(String inputWord) {
        if (isPossibleGarland(inputWord)) {
            int position = calculateGarland(inputWord);
            String chain = createChain(inputWord, position);
            return chain;
        }
        return inputWord;
    }

    private boolean isPossibleGarland(String inputWord) {
        char frontLetter = inputWord.charAt(0), backLetter;
        int length = inputWord.length();

        for (int currentPossition = 1; currentPossition < length; currentPossition++) {
            backLetter = inputWord.charAt(currentPossition);
            if (frontLetter == backLetter) {
                return true;
            }
        }
        return false;
    }

    private int calculateGarland(String inputWord) {
        int length = inputWord.length(), highestResults = 0;
        String frontEnd = "", backEnd = "";

        for (int i = 0; i < length - 1; i++) {
            frontEnd = frontEnd + inputWord.charAt(i);
            backEnd = inputWord.charAt((length - 1) - i) + backEnd;
            if (frontEnd.equals(backEnd)) {
                highestResults = (i + 1);
            }
        }
        return highestResults;
    }

    private String createChain(String input, int endPosition) {
        String outputString = "";

        if (endPosition != 0) {
            for (int currentPosition = 0; currentPosition < (input.length() - endPosition); currentPosition++) {
                outputString = outputString + input.charAt(currentPosition);
            }
            for (int j = 0; j < 3; j++) {
                outputString = outputString + outputString;
            }
        }
        outputString = outputString + input;
        return outputString;
    }
}
