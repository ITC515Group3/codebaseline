package datamanagement;

public interface IStudent {
    //The modifier public is redundant
    //Because the methods are using within package suggest make it protect
    public Integer getID();

    public String getFirstName();
    public void setFirstName(String firstName);

    public String getLastName();
    public void setLastName(String lastName);

    public void addUnitRecord(IStudentUnitRecord record);
    public IStudentUnitRecord getUnitRecord(String unitCode);

    public StudentUnitRecordList getUnitRecords();
}
