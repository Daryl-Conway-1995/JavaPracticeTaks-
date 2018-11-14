package com.qa;

public class MissingPlace {
    public String missThisPlace(int place) {
        String outputString = "";
        int currentPlace;
        for (currentPlace = 1; currentPlace <= 20; currentPlace++) {
            if (currentPlace != place) {
                outputString += currentPlace;
                if (currentPlace / 10 == 1) {
                    outputString += "th,";
                } else {
                    switch (currentPlace % 10) {
                        case 1:
                            outputString += "st,";
                            break;
                        case 2:
                            outputString += "nd,";
                            break;
                        case 3:
                            outputString += "rd,";
                            break;
                        default:
                            outputString += "th,";
                            break;
                    }
                }
            }
        }
        return outputString;
    }
}
