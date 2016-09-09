package datamanagement;

public interface IStudent {
    //The modifier public is redundant
    //Because the methods are using within package suggest make it protect
    public Integer getID();

    String getFirstName();

    void setFirstName(String firstName);

    String getLastName();

    void setLastName(String lastName);

    void addUnitRecord(IStudentUnitRecord record);

    IStudentUnitRecord getUnitRecord(String unitCode);

    StudentUnitRecordList getUnitRecords();

}
