/**
 * @(#) UnitProxy. THIS CLASS CONTAIN OF CALCULATING THE GRADE BASED ON THE STUDENT
 * ACHIVED MARKS IN ASSIGNMENTGRADE1, ASSIGNMENTGRADE2,QUIZ AND FINAL EXAM
 * Copyright (c) 1994-2016 Sun Microsystems, Inc.
 * 901 San Antonio Road, Palo Alto, California, 94303, U.S.A.
 * All rights reserved.
 *
 *
 * This software is the confidential and proprietary information of Sun
 * Oracle, Inc. ("Confidential Information").  You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into
 * with Sun.
 * Problem found in this code :-
 *
 * 1) Due to no comments on methods that is been implemented. Plus the variable that is created by the developer have
 * failed to justify java standards in naming convensation.
 * 2) This class act as a Interface of UnitProxy , if all the interface classes in one unitClass it would good.
 *
 */
package datamanagement;

/**
 * First the public class variables, then the protected, then package level (no access modifier), and then the private.
 * */
public class UnitProxy implements IUnit {
    private String UC; // Unclear variable name plus should match a pattern . Example :- universityMarks / unitCode.
    private String un; // Unclear variable name .


    UnitManager um; // Thid does not explain what is um and where is UnitManagee is from. Need comment about the code.
/**
 * Following code do not contain basic comment what does it do.
 * */
    public UnitProxy(String unitCode, String unitName) {
        this.UC = unitCode;
        this.un = unitName;
        um = UnitManager.UM();
    }
    /**
     * Following code do not contain basic comment what does it do.
     * The method should follow proper pattern of creating a method.
     * It should be
     * public int methodName()
     *  {
     *      return x;
     *  }
     * */
    public String getUnitCode() {
        return this.UC;
    }
    /**
     * Following code do not contain basic comment what does it do.
     * The method should follow proper pattern of creating a method.
     * It should be
     * public int methodName()
     *  {
     *      return x;
     *  }
     * */
    public String getUnitName() {
        return this.un;
    }
    /**
     * Following code do not contain basic comment what does it do.
     * The method should follow proper pattern of creating a method.
     * It should be
     * public int methodName()
     *  {
     *      return x;
     *  }
     * */
    public void setPsCutoff1(float cutoff) {
        um.getUnit(UC).setPsCutoff1(cutoff);
    }
    /**
     * Following code do not contain basic comment what does it do.
     * The method should follow proper pattern of creating a method.
     * It should be
     * public int methodName()
     *  {
     *      return x;
     *  }
     * */
    public float getPsCutoff() {
        return um.getUnit(UC).getPsCutoff();
    }
    /**
     * Following code do not contain basic comment what does it do.
     * The method should follow proper pattern of creating a method.
     * It should be
     * public int methodName()
     *  {
     *      return x;
     *  }
     * */
    public void setCrCutoff(float cutoff) {
        um.getUnit(UC).setCrCutoff(cutoff);
    }
    /**
     * Following code do not contain basic comment what does it do.
     * The method should follow proper pattern of creating a method.
     * It should be
     * public int methodName()
     *  {
     *      return x;
     *  }
     * */
    public float getCrCutoff() {
        return um.getUnit(UC).getCrCutoff();
    }
    /**
     * Following code do not contain basic comment what does it do.
     * The method should follow proper pattern of creating a method.
     * It should be
     * public int methodName()
     *  {
     *      return x;
     *  }
     * */
    public void setDiCutoff(float cutoff) {
        um.getUnit(UC).setDiCutoff(cutoff);
    }
    /**
     * Following code do not contain basic comment what does it do.
     * The method should follow proper pattern of creating a method.
     * It should be
     * public int methodName()
     *  {
     *      return x;
     *  }
     * */
    public float getDiCuttoff() {
        return um.getUnit(UC).getDiCuttoff();
    }
    /**
     * Following code do not contain basic comment what does it do.
     * The method should follow proper pattern of creating a method.
     * It should be
     * public int methodName()
     *  {
     *      return x;
     *  }
     * */
    public void setHdCutoff(float cutoff) {
        um.getUnit(UC).setHdCutoff(cutoff);
    }
    /**
     * Following code do not contain basic comment what does it do.
     * The method should follow proper pattern of creating a method.
     * It should be
     * public int methodName()
     *  {
     *      return x;
     *  }
     * */
    public float getHdCutoff() {
        return um.getUnit(UC).getHdCutoff();
    }
    /**
     * Following code do not contain basic comment what does it do.
     * The method should follow proper pattern of creating a method.
     * It should be
     * public int methodName()
     *  {
     *      return x;
     *  }
     * */
    public void setAeCutoff(float cutoff) {
        um.getUnit(UC).setAeCutoff(cutoff);
    }
    /**
     * Following code do not contain basic comment what does it do.
     * The method should follow proper pattern of creating a method.
     * It should be
     * public int methodName()
     *  {
     *      return x;
     *  }
     * */
    public float getAeCutoff() {
        return um.getUnit(UC).getAeCutoff();
    }
    /**
     * Following code do not contain basic comment what does it do.
     * The method should follow proper pattern of creating a method.
     * It should be
     * public int methodName()
     *  {
     *      return x;
     *  }
     * */
    public String getGrade(float f1, float f2, float f3) {
        return um.getUnit(UC).getGrade(f1, f2, f3);
    }
    /**
     * Following code do not contain basic comment what does it do.
     * The method should follow proper pattern of creating a method.
     * It should be
     * public int methodName()
     *  {
     *      return x;
     *  }
     * */
    public void addStudentRecord(IStudentUnitRecord record) {
        um.getUnit(UC).addStudentRecord(record);
    }
    /**
     * Following code do not contain basic comment what does it do.
     * The method should follow proper pattern of creating a method.
     * It should be
     * public int methodName()
     *  {
     *      return x;
     *  }
     * */
    public IStudentUnitRecord getStudentRecord(int s) {
        return um.getUnit(UC).getStudentRecord(s);
    }
    /**
     * Following code do not contain basic comment what does it do.
     * The method should follow proper pattern of creating a method.
     * It should be
     * public int methodName()
     *  {
     *      return x;
     *  }
     * */
    public StudentUnitRecordList listStudentRecords() {
        return um.getUnit(UC).listStudentRecords();
    }
    /**
     * Following code do not contain basic comment what does it do.
     * The method should follow proper pattern of creating a method.
     * It should be
     * public int methodName()
     *  {
     *      return x;
     *  }
     * */
    public int getAsg1Weight() {
        return um.getUnit(UC).getAsg1Weight();
    }
    /**
     * Following code do not contain basic comment what does it do.
     * The method should follow proper pattern of creating a method.
     * It should be
     * public int methodName()
     *  {
     *      return x;
     *  }
     * */
    public int getAsg2Weight() {
        return um.getUnit(UC).getAsg2Weight();
    }
    /**
     * Following code do not contain basic comment what does it do.
     * The method should follow proper pattern of creating a method.
     * It should be
     *  public int getExamWeight()
     *  {
     *      return um.getUnit(UC).getExamWeight();
     *  }
     * */
    public int getExamWeight() {
        return um.getUnit(UC).getExamWeight();
    }
    /**
     * Following code do not contain basic comment what does it do.
     * The variable needs to be clearly define. int asg1Wgt, int asg2Wgt, int examWgt.
     * More understandable manner example :- int assignment1Weight
     * */
    public void setAssessmentWeights(int asg1Wgt, int asg2Wgt, int examWgt) {
        um.getUnit(UC).setAssessmentWeights(asg1Wgt, asg2Wgt, examWgt);
    }
}
