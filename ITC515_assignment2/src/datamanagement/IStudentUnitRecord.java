package datamanagement;

public interface IStudentUnitRecord {

    Integer getStudentID();

    String getUnitCode();

    void setAsg1(float mark);

    float getAsg1();

    void setAsg2(float mark);

    float getAsg2();

    void setExam(float mark);

    float getExam();

    float getTotal();
}
