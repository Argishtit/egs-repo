package com.hackerrank;
import java.util.ArrayList;
import java.util.List;

/**
 * Description: HackerLand University has the following grading policy:
 *
 *              Every student receives a grade in the inclusive range from 0 to 100.
 *              Any grade less than 40 is a failing grade.
 *              Sam is a professor at the university and likes to round each student's grade according to
 *              these rules:
 *
 *              If the difference between the grade and the next multiple of 5 is less than 3, round grade
 *              up to the next multiple of 5.
 *              If the value of grade is less than 38, no rounding occurs as the result will still be a
 *              failing grade.
 *
 * @author Argishti_Tigranyan
 */

public class Exercise12 {
    public static List<Integer> gradingStudents(List<Integer> grades) {

        List<Integer> roundedGrades = new ArrayList<>();

        for(int i = 0; i < grades.size(); i++){
            if(grades.get(i) > 37){
                if((grades.get(i)+1) % 5 == 0){
                    roundedGrades.add(grades.get(i)+1);
                }
                else if((grades.get(i)+2) % 5 == 0){
                    roundedGrades.add(grades.get(i)+2);
                }
                else{
                    roundedGrades.add(grades.get(i));
                }
            }
            else{
                roundedGrades.add(grades.get(i));
            }
        }

        return roundedGrades;

    }
}
