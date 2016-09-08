/**
 * Summary of the IUnit.java
 *
 * This class does not contain any comments on get and set method that to be used.
 *
 * Exoected Summary From The Developer :-
 *
 *
 * This class is an interface for Unit.java. IUnit.java contain getter and setter method which
 * collect  the marks from assignments , exam to produce the results.
 *
 * This helps to calculation minimum marks / grades / scores for assessments on the selected
 * units. To calculate the grades from the selected subjects / course / units add to students
 * records or filing calculated information for the future use.
 *
 *
 * Some of the naming convensation not up to the standard / the methods that named is not clear.
 *
 *     float getPsCutoff();  /  void setPsCutoff1(float cutoff); /  float getCrCutoff(); /  void setCrCutoff(float cutoff);
 *     float getDiCuttoff(); /  void setDiCutoff(float cutoff);  /  float getHdCutoff(); /  void setHdCutoff(float cutoff);
 *     float getAeCutoff();  /  void setAeCutoff(float cutoff);  /  int getAsg1Weight(); /  int getAsg2Weight();
 *     int getExamWeight();  /  void setAssessmentWeights(int asg1Wgt, int asg2Wgt, int examWgt);
 *     String getGrade(float asg1, float asg2, float exam);      /
 *
 *     This method is not been used by the developer :-
 *     String getUnitName(); // This method is not used in any of the class.
 *
 *     Suggestion :- Access can be package private due to This inspection reports all fields, methods or classes,
 *                  found in the specified inspection scope, that may have their access modifier narrowed down.
 *
 * Example :-
 *
 * float getPsCutoff();   // Bad practice
 *
 * public float getPassCutoff(); // Correct practice
 *
 * Developer / Code Responsible to IUnit.java need to proper format structure .
 *
 * Requested for Change :-
 *
 * Requesting coder to review this code and use proper naming convensation,
 * this will help other coders what you have done
 *
 *  */
package datamanagement;
public interface IUnit {

    String getUnitCode();

    String getUnitName(); // This method is not used in any of the class.

    float getPsCutoff(); // need to change into proper format
    // Correct format :- public float getPassCutoff();

    void setPsCutoff1(float cutoff); // need to change into proper format
    // Correct format :- public void setPassCutoff(float cutoff);

    float getCrCutoff();// need to change into proper format
    // Correct format :- public float getCreditCutoff();

    void setCrCutoff(float cutoff);// need to change into proper format
    // Correct format :- public void setCreditCutoff(float cutoff);

    float getDiCuttoff();// need to change into proper format
    // Correct format :- public float getDistinctionCuttoff();

    void setDiCutoff(float cutoff);// need to change into proper format
    // Correct format :- public void setDistinctionCutoff(float cutoff);

    float getHdCutoff();// need to change into proper format
    // Correct format :- public float getHighDistinctionCutoff();

    void setHdCutoff(float cutoff);// need to change into proper format
    // Correct format :- public void setHighDistinctionCutoff(float cutoff);

    float getAeCutoff();// need to change into proper format
    // Correct format :- public float getAeCutoff();

    void setAeCutoff(float cutoff);// need to change into proper format
    // Correct format :- public void setAeCutoff(float cutoff);

    int getAsg1Weight();// need to change into proper format
    // Correct format :- public int getAssignment1Weight();

    int getAsg2Weight();// need to change into proper format
    // Correct format :- public int getAssignment2Weight();

    int getExamWeight();// need to change into proper format
    // Correct format :- public int getExamWeight();

    void setAssessmentWeights(int asg1Wgt, int asg2Wgt, int examWgt);// need to change into proper format
    // Correct format :- public void setAssessmentWeights(int assignmentGrade1Weight, int assignmentGrade2Weight, int examWeigt);

    String getGrade(float asg1, float asg2, float exam);// need to change into proper format
    // Correct format :- public String getGrade(float assignmentGrade1, float assignmentGrade2, float exam);

    void addStudentRecord(IStudentUnitRecord record);// need to change into proper format
    // Correct format :- public void addStudentRecord(IStudentUnitRecord record);

    IStudentUnitRecord getStudentRecord(int studentID); // need to change into proper format
    // Correct format :- public IStudentUnitRecord getStudentRecord(int studentID);

    StudentUnitRecordList listStudentRecords(); // need to change into proper format
    // Correct format :- public StudentUnitRecordList listStudentRecords();
}
