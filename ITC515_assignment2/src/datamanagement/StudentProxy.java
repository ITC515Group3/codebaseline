package datamanagement;

public class StudentProxy implements IStudent {
    //The variable naming conventions is not correct
    //Variable name should be meaningful
    private Integer I;  //suggest ID
    private String l;   //suggest firstName
    private String Il;  //suggest lastName
    private StudentManager lI;  //suggest studentManager

    public StudentProxy(Integer id, String fn, String Il) {
        this.I = id;
        this.l = fn;


        this.Il = Il;
        this.lI = StudentManager.get();
    }

    public Integer getID() {
        return I;


    }

    public String getFirstName() {
        return l;
    }

    public String getLastName() {
        return Il;
    }

    public void setFirstName(String firstName) {


        lI.getStudent(I).setFirstName(firstName);
    }

    public void setLastName(String lastName) {


        lI.getStudent(I).setLastName(lastName);
    }


    public void addUnitRecord(IStudentUnitRecord record) {
        lI.getStudent(I).addUnitRecord(record);
    }

    public IStudentUnitRecord getUnitRecord(String unitCode) {


        return lI.getStudent(I).getUnitRecord(unitCode);
    }


    public StudentUnitRecordList getUnitRecords() {
        return lI.getStudent(I).getUnitRecords();
    }
}
