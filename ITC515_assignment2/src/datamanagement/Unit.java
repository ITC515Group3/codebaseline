/**
 * This class do not have a block commnet which explain all process that undertaken by this class.
 * Plus this needs to include copy rightlaw of the Sunjava From Oracle
 * @(#) Unit.java
 *
 * Copyright (c) 1994-2016 Sun Microsystems, Inc.
 * 901 San Antonio Road, Palo Alto, California, 94303, U.S.A.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of Sun
 * Oracle, Inc. ("Confidential Information").  You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into
 * with Sun.
 *
 * This java class have not practied following java stardards.
 *
 * 1- Block of comment, individual comment for different method and comments for if condition are not praticed.
 * 2- Under Indention - Wrapping Lines - If statments should generally use 8 space rules indented makes seeing the body
 *    much more difficult.
 * 3- Unclear variable name , this does not give a clear picture what do that variable does. Need to user useful
 *    information that helps others when they go through the code.
 * 4- Variable defined as private int a1, a2, ex; This is not a best practice.
 * 5- Two method in this class are not been used. It's advice able to comment or may remove it not needed.
 */
package datamanagement;


public class Unit implements IUnit {
    private String uc; // Unclear variable defined / Do not explain why its created from the variable it self
    private String UN; // Unclear variable defined / Do not explain why its created from the variable it self
    private float co2; // Unclear variable defined / Do not explain why its created from the variable it self
    private float co1; // Unclear variable defined / Do not explain why its created from the variable it self
    private float co4; // Unclear variable defined / Do not explain why its created from the variable it self
    private float co3;// Unclear variable defined / Do not explain why its created from the variable it self
    private float co5; // Unclear variable defined / Do not explain why its created from the variable it self
    private int a1, a2, ex; // Unclear variable defined / Do not explain why its created from the variable it self
    // private int a1, a3, ex is not best practice.

    private StudentUnitRecordList rs;

    public Unit(String UC, String un, float f1, float f2, float f3, float f4,
                float f5, int i1, int i2, int i3, StudentUnitRecordList rl) // The variable should be in understandable wordform
    {

        uc = UC;
        UN = un;
        co2 = f1;
        co1 = f2;
        this.co4 = f3;
        co3 = f4;
        this.co5 = f5;
        this.setAssessmentWeights(i1, i2, i3);
        rs = rl == null ? new StudentUnitRecordList() : rl;
    }
/**Description of method in one line
 * Plus need comment on each line
 *
 * Also method parttern is not in a proper standard.
 * */
    public String getUnitCode() {
        return this.uc;
    }
    /**Description of method in one line
     * Plus need comment on each line
     * */
    public String getUnitName() {

        return this.UN;
    }
    /**Description of method in one line
     * Plus need comment on each line
     * */
    public void setPsCutoff1(float cutoff) {
        this.co2 = cutoff;
    }
    /**Description of method in one line
     * Plus need comment on each line.
     * Also method parttern is not in a proper standard.
     * */
    public float getPsCutoff() {
        return this.co2;
    }
    /**Description of method in one line
     * Plus need comment on each line.
     * Also method parttern is not in a proper standard.
     * */
    public void setCrCutoff(float cutoff) {
        this.co1 = cutoff;
    }
    /**Description of method in one line
     * Plus need comment on each line.
     * Also method parttern is not in a proper standard.
     * */
    public float getCrCutoff() {
        return this.co1;
    }
    /**Description of method in one line
     * Plus need comment on each line.
     * Also method parttern is not in a proper standard.
     * */
    public void setDiCutoff(float cutoff) {
        this.co4 = cutoff;
    }
    /**Description of method in one line
     * Plus need comment on each line.
     * Also method parttern is not in a proper standard.
     * */
    public float getDiCuttoff() {
        return this.co4;
    }
    /**Description of method in one line
     * Plus need comment on each line.
     * Also method parttern is not in a proper standard.
     * */
    public void HDCutoff(float cutoff) {
        this.co3 = cutoff;
    } // this method not been used
    /**Description of method in one line
     * Plus need comment on each line.
     * Also method parttern is not in a proper standard.
     * */
    public void setHdCutoff(float cutoff) {
        this.co3 = cutoff;
    }
    /**Description of method in one line
     * Plus need comment on each line.
     * */
    public float getHdCutoff() {
        return this.co3;

    }
    /**Description of method in one line
     * Plus need comment on each line.
     * Also method parttern is not in a proper standard.
     * */
    public void setAeCutoff(float cutoff) {
        this.co5 = cutoff;
    }
    /**Description of method in one line
     * Plus need comment on each line.
     * Also method parttern is not in a proper standard.
     * */
    public float getAeCutoff() {
        return this.co5;
    }
    /**Description of method in one line
     * Plus need comment on each line.
     * Also method parttern is not in a proper standard.
     * */
    public void addStudentRecord(IStudentUnitRecord record) {
        rs.add(record);
    }
    /**Description of method in one line
     * Plus need comment on each line.
     *
     * */
    public IStudentUnitRecord getStudentRecord(int studentID) {
        for (IStudentUnitRecord r : rs) {
            if (r.getStudentID() == studentID)
                return r;
        }
        return null;
    }
    /**Description of method in one line
     * Plus need comment on each line.
     * Also method parttern is not in a proper standard.
     * */
    public StudentUnitRecordList listStudentRecords() {
        return rs;
    }
    /**Description of method in one line
     * Plus need comment on each line.
     * Also method parttern is not in a proper standard.
     * */
    @Override
    public int getAsg1Weight() {
        return a1;
    }
    /**Description of method in one line
     * Plus need comment on each line.
     * Also method parttern is not in a proper standard.
     * */
    @Override
    public int getAsg2Weight() {
        return a2;
    }
    /**Description of method in one line
     * Plus need comment on each line.
     * Also method parttern is not in a proper standard.
     * */
    @Override
    public int getExamWeight() {
        return ex;
    }
    /**Description of method in one line
     * Plus need comment on each line.
     *
     * If condition missing proper standard.
     * */
    @Override
    public void setAssessmentWeights(int a1, int a2, int ex) {
        /**
         * Line :- 207 Boolean expression complexity is 5 (max allowed is 3).
         * Restricts nested boolean operators (&&, || and ^) to a specified depth (default = 3).
         * */
            if (a1 < 0 || a1 > 100 ||
                a2 < 0 || a2 > 100 ||
                ex < 0 || ex > 100) {
            throw new RuntimeException("Assessment weights cant be less than zero or greater than 100");
        }
        if (a1 + a2 + ex != 100) {
            throw new RuntimeException("Assessment weights must add to 100");
        }
        this.a1 = a1;
        this.a2 = a2;
        this.ex = ex;
    }
    /**Description of method in one line
     * Plus need comment on each line.
     * Due to complexity for this one method is rather high. Developer needs to, split up the method in smaller method.
     * */
    private void setCutoffs(float ps, float cr, float di, float hd, float ae) { // this method not been used
/**
 * Line :- 221 Boolean expression complexity is 9 (max allowed is 3).
 * Restricts nested boolean operators (&&, || and ^) to a specified depth (default = 3).
 * */
        if (ps < 0 || ps > 100 ||
                cr < 0 || cr > 100 ||
                di < 0 || di > 100 ||
                hd < 0 || hd > 100 ||
                ae < 0 || ae > 100) {
            throw new RuntimeException("Assessment cutoffs cant be less than zero or greater than 100");
        }
        if (ae >= ps) {
            throw new RuntimeException("AE cutoff must be less than PS cutoff");
        }
        if (ps >= cr) {
            throw new RuntimeException("PS cutoff must be less than CR cutoff");
        }
        if (cr >= di) {
            throw new RuntimeException("CR cutoff must be less than DI cutoff");
        }
        if (di >= hd) {
            throw new RuntimeException("DI cutoff must be less than HD cutoff");
        }

    }
    /**Description of method in one line
     * Plus need comment on each line.
     * if condition missing cruly brackets and proper standard.
     * Due to complexity for this one method is rather high. Developer needs to, split up the method in smaller method.
     * */
    public String getGrade(float f1, float f2, float f3) {
        float t = f1 + f2 + f3;
/**
 * Line :- 249 Boolean expression complexity is 5 (max allowed is 3).
 * Restricts nested boolean operators (&&, || and ^) to a specified depth (default = 3).
 * */
        if (f1 < 0 || f1 > a1 ||
                f2 < 0 || f2 > a2 ||
                f3 < 0 || f3 > ex) {
            throw new RuntimeException("marks cannot be less than zero or greater than assessment weights");
        }

        if (t < co5) {
            return "FL";
        } else if (t < co2)
            return "AE";
        else if (t < co1)
            return "PS";
        else if (t < co4)
            return "CR";
        else if (t < co3)
            return "DI";
        else
            return "HD";
    }
}
