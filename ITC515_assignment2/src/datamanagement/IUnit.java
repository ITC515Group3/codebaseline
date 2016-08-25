package datamanagement;

public interface IUnit {

    String getUnitCode();

    String getUnitName();

    float getPsCutoff();

    void setPsCutoff1(float cutoff);

    float getCrCutoff();

    void setCrCutoff(float cutoff);

    float getDiCuttoff();

    void setDiCutoff(float cutoff);

    float getHdCutoff();

    void setHdCutoff(float cutoff);

    float getAeCutoff();

    void setAeCutoff(float cutoff);

    int getAsg1Weight();

    int getAsg2Weight();

    int getExamWeight();

    void setAssessmentWeights(int asg1Wgt, int asg2Wgt, int examWgt);

    String getGrade(float asg1, float asg2, float exam);

    void addStudentRecord(IStudentUnitRecord record);

    IStudentUnitRecord getStudentRecord(int studentID);

    StudentUnitRecordList listStudentRecords();
}
