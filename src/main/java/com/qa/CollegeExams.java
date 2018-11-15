package com.qa;


public class CollegeExams {
    private int biology = 0;
    private int chemistry = 0;
    private int physics = 0;
    private int totalPionts = 0;
    private double percentage = 0.00;

    public void setBiology(int biology) {
        if (biology <= 150) this.biology = biology;
        updateTotal();
    }

    public void setChemistry(int chemistry) {
        if (chemistry <= 150) this.chemistry = chemistry;
        updateTotal();
    }

    public void setPhysics(int physics) {
        if (physics <= 150) this.physics = physics;
        updateTotal();
    }

    private void updateTotal() {
        totalPionts = biology + chemistry + physics;
        percentage = ((100.00 * totalPionts) / 450);
    }

    public String getAllExams() {
        String outputString = "biology: ";
        outputString += String.valueOf(biology) + ", chemisty: ";
        outputString += String.valueOf(chemistry) + ", physics: ";
        outputString += String.valueOf(physics);
        return outputString;
    }

    public String getTotalResults() {
        int outputCondition = checkForFails();
        String outputString = "";
        switch (outputCondition) {
            case 1:
                outputString += "failed on one subject";
                break;
            case 2:
                outputString += "failed on two subjects";
                break;
            case 3:
                outputString += "failed on three subjects";
                break;
            case 11:
                outputString += "overall grade was too low, failed on one subject";
                break;
            case 12:
                outputString += "overall grade was too low, failed on two subjects";
                break;
            case 13:
                outputString += "overall grade was too low, failed on two subjects";
                break;
            default:
                outputString += "passed all test";
                break;
        }
        outputString += ". overall grades: " +totalPionts + ", percentage total: " +percentage;
        return outputString;
    }

    private int checkForFails() {
        int failCounter = 0;
        if (percentage < 60) failCounter += 10;
        if (checkMark(biology, 150)) failCounter += 1;
        if (checkMark(chemistry, 150)) failCounter += 1;
        if (checkMark(physics, 150)) failCounter += 1;
        return failCounter;
    }

    private boolean checkMark(int examName, int maxPoints) {
        return ((100.00* examName) / maxPoints < 60);
    }
}
