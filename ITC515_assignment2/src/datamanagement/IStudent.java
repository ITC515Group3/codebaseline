package datamanagement;

public interface IStudent {

    Integer getID();

    String getFirstName();

    void setFirstName(String firstName);

    String getLastName();

    void setLastName(String lastName);

    void addUnitRecord(IStudentUnitRecord record);

    IStudentUnitRecord getUnitRecord(String unitCode);

    StudentUnitRecordList getUnitRecords();

}
