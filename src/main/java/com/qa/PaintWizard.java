package com.qa;

public class PaintWizard {

    private int cheapOMax = 10;
    private int averageJoes = 11;
    private int duluxourousPaints = 20;
    private float cheapPrice = 199.9f;
    private float averagePrice = 17.99f;
    private float duluxPrice = 25.00f;

    public String findBestPaint(int roomSize) {

        int cheapCounter = roomSize / cheapOMax;
        int averageCounter = roomSize / averageJoes;
        int duluxCounter = roomSize / duluxourousPaints;

        if (roomSize % cheapOMax != 0) cheapCounter++;
        if (roomSize % averageJoes != 0) averageCounter++;
        if (roomSize % duluxourousPaints != 0) duluxCounter++;

        float cheapCost = (cheapCounter * cheapPrice);
        float averageCost = (averageCounter * averagePrice);
        float duluxCost = (duluxCounter * duluxPrice);

        if (cheapCost < averageCost && cheapCost < duluxCost)
            return "CheapOMax at " + cheapCost + " for " + cheapCounter + " cans with waste amount of " +
                    (cheapOMax - roomSize % cheapOMax);
        if (averageCost < cheapCost && averageCost < cheapCost)
            return "AverageJoes at " + averageCost + " for " + averageCounter + " cans with waste amount of " +
                    (averageJoes - roomSize % averageJoes);
        if (duluxCost < cheapCost && duluxCost < averageCost)
            return "DuluxPaints at " + duluxCost + "for " + duluxCounter + " cans with waste amount of  +" +
                    (duluxourousPaints - roomSize % duluxourousPaints);

        return "could not find a best paint";
    }
}
