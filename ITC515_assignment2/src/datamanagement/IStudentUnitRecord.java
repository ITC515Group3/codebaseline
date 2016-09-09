package datamanagement;

public interface IStudentUnitRecord {
    /*
    The modifier public is redundant
    public can be removed
    */
    public Integer getStudentID();
    public String getUnitCode();

    /* Setter and getter method should group*/
    void setAsg1(float mark);
    float getAsg1();

    void setAsg2(float mark);
    float getAsg2();

    void setExam(float mark);
    float getExam();

    float getTotal();
}
