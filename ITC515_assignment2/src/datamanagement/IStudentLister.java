package datamanagement;

/**
 * @author jtulip
 */

public interface IStudentLister {
    //There should be single blank line  between methods
    //The modifier public is redundant
    //public can be removed
    public void clearStudents();
    public void addStudent(IStudent student);
    
}
