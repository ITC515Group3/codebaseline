package datamanagement;

import org.jdom.*;
import java.util.List;

public class StudentManager {
    private static StudentManager self = null;
    //The variable naming conventions is not correct
    //Variable name should be meaningful
    //suggest studentMap;
    private StudentMap sm;
    //java.util.HashMap should import before use, also the variable name should be meaningful
    //suggest import java.util.HashMap;
    //          HashMap<String, StudentMap> unitMap;
    private java.util.HashMap<String, StudentMap> um;

    public static StudentManager get() {
        if (self == null)
            self = new StudentManager();
        return self;
    }

    private StudentManager() {
        sm = new StudentMap();
        um = new java.util.HashMap<>();
    }

    public IStudent getStudent(Integer id) {
        IStudent is = sm.get(id);
        return is != null ? is : createStudent(id);
    }

    private Element getStudentElement(Integer id) {
        //for and if should add braces
        //Variable name should be meaningful
        for (Element el : (List<Element>) XMLManager.getXML().getDocument().getRootElement().getChild("studentTable").getChildren("student"))
            if (id.toString().equals(el.getAttributeValue("sid")))
                return el;
        return null;
    }

    private IStudent createStudent(Integer id) {
        //Variable name should be meaningful iStudent, element, recordList.
        IStudent is;
        Element el = getStudentElement(id);
        if (el != null) {
            StudentUnitRecordList rlist = StudentUnitRecordManager.instance().getRecordsByStudent(id);
            is = new Student(new Integer(el.getAttributeValue("sid")),el.getAttributeValue("fname"),el.getAttributeValue("lname"),rlist);

            sm.put(is.getID(), is);
            return is;
        }
        throw new RuntimeException("DBMD: createStudent : student not in file");
    }

    private IStudent createStudentProxy(Integer id) {
        Element el = getStudentElement(id);
        if (el != null)
            return new StudentProxy(id, el.getAttributeValue("fname"), el.getAttributeValue("lname"));
        throw new RuntimeException("DBMD: createStudent : student not in file");
    }

    public StudentMap getStudentsByUnit(String uc) {
        //Variable name should be meaningful
        // studentMap, iStudent
        StudentMap s = um.get(uc);
        if (s != null) {
            return s;
        }

        s = new StudentMap();
        IStudent is;
        StudentUnitRecordList ur = StudentUnitRecordManager.instance().getRecordsByUnit(uc);

        for (IStudentUnitRecord S : ur) {
            is = createStudentProxy(new Integer(S.getStudentID()));
            s.put(is.getID(), is);
        }

        um.put(uc, s);
        return s;
    }
}
