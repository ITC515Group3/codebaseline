package datamanagement;

public class ListStudentsCTL {
    //The variable naming conventions is not correct
    //Variable name should be meaningful
    //suggest studentManager
    private StudentManager sm;

    public ListStudentsCTL() {
        sm = StudentManager.get();
    }

    public void listStudents (IStudentLister lister, String unitCode ) {
        lister.clearStudents();
        StudentMap students = sm.getStudentsByUnit( unitCode );
        //for loop should add brace
        for (Integer id : students.keySet())
            lister.addStudent(students.get(id));
    }
}
