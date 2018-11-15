package com.qa;

import org.junit.Test;

import static org.junit.Assert.*;

public class CollegeExamsTest {
    private CollegeExams collegeExams = new CollegeExams();

    @Test
    public void getAllExams() {
        collegeExams.setBiology(70);
        collegeExams.setChemistry(60);
        collegeExams.setPhysics(80);
        assertEquals(collegeExams.getAllExams(),"biology: 70, chemisty: 60, physics: 80");
    }

    @Test
    public void getTotalResults() {
        collegeExams.setBiology(140);
        collegeExams.setChemistry(130);
        collegeExams.setPhysics(135);
        assertEquals(collegeExams.getTotalResults(),"passed all test. overall grades: 405, percentage total: 90.0");
    }

    @Test
    public void lowExamScores() {
        collegeExams.setBiology(20);
        collegeExams.setChemistry(60);
        collegeExams.setPhysics(40);
        assertEquals(collegeExams.getAllExams(),"biology: 20, chemisty: 60, physics: 40");
        assertEquals(collegeExams.getTotalResults(),"overall grade was too low, failed on two subjects. overall grades: 120, percentage total: 26.666666666666668");

    }


}