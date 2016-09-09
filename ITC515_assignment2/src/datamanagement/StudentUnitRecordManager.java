/**
 *
 * Mainly this class does not any block comment plus method comments through out the class. Also some methods
 * long logic which goes beyond the limited line in one code. Plus some comment provided by the developer is not clear.
 *
 * If the certain methods are directly effected to the system . It have to be private and kept more and clear comments
 *
 *
 * */

package datamanagement;

import java.util.List;

import org.jdom.*;

public class StudentUnitRecordManager {

    private static StudentUnitRecordManager s = null;
    private StudentUnitRecordMap rm;
    private java.util.HashMap<String, StudentUnitRecordList> ur;
    private java.util.HashMap<Integer, StudentUnitRecordList> sr;

    /**
     * Need to make this method   public static StudentUnitRecordManager instance()
     * as private, due to This inspection reports all fields, methods or classes,-
     * found in the specified inspection scope, that may have their access modifier narrowed down.
     *
     * Correct Form :-
     *  static StudentUnitRecordManager instance() {
     * */

    public static StudentUnitRecordManager instance() {
        if (s == null) s = new StudentUnitRecordManager();
        return s;
    }

    private StudentUnitRecordManager() {
        rm = new StudentUnitRecordMap();
        ur = new java.util.HashMap<>();
        sr = new java.util.HashMap<>();
    }

    /**
     * Need to make this method  public IStudentUnitRecord getStudentUnitRecord(Integer studentID, String unitCode)
     * as private, due to This inspection reports all fields, methods or classes,-
     * found in the specified inspection scope, that may have their access modifier narrowed down.
     *
     * Correct Form :- IStudentUnitRecord getStudentUnitRecord(Integer studentID, String unitCode) {
     * */

    public IStudentUnitRecord getStudentUnitRecord(Integer studentID, String unitCode) {
        IStudentUnitRecord ir = rm.get(studentID.toString() + unitCode);
        return ir != null ? ir : createStudentUnitRecord(studentID, unitCode);
    }

    /**
     * Too much code in one line. This have to break down to smaller version.
     * Wrong practice:-
     *
     * ir = new StudentUnitRecord(new Integer(el.getAttributeValue("sid")), el.getAttributeValue("uid"), new Float(el.getAttributeValue("asg1")).floatValue(), new Float(el.getAttributeValue("asg2")).floatValue(), new Float(el.getAttributeValue("exam")).floatValue());
     * Not all in one line.
     *
     * Correct form:-
     *
     * private IStudentUnitRecord createStudentUnitRecord(Integer uid, String sid){
     *
     * ir = new StudentUnitRecord(new Integer(el.getAttributeValue("sid")),
     * el.getAttributeValue("uid"),
     * new Float(el.getAttributeValue("asg1")).floatValue(),
     * new Float(el.getAttributeValue("asg2")).floatValue(),
     * new Float(el.getAttributeValue("exam")).floatValue());
     *
     * More simplified manner :-
     *
     * ir = new StudentUnitRecord( Integer.parseInteger(e1.getAttributeValue("sid")),
     * Integer.parseInteger(e1.getAttributeValue(uid)),
     * Float.praseFloat(el.getAttributeValue("asg1")),
     * Float.praseFloat(el.getAttributeValue("asg2")),
     * Float.praseFloat(el.getAttributeValue("exam"));
     *
     *
     * */

    private IStudentUnitRecord createStudentUnitRecord(Integer uid, String sid) {
        IStudentUnitRecord ir;
        for (Element el : (List<Element>) XMLManager.getXML().getDocument().getRootElement().getChild("studentUnitRecordTable").getChildren("record")) {
            if (uid.toString().equals(el.getAttributeValue("sid")) && sid.equals(el.getAttributeValue("uid"))) {
                ir = new StudentUnitRecord(new Integer(el.getAttributeValue("sid")), el.getAttributeValue("uid"), new Float(el.getAttributeValue("asg1")).floatValue(), new Float(el.getAttributeValue("asg2")).floatValue(), new Float(el.getAttributeValue("exam")).floatValue());
                rm.put(ir.getStudentID().toString() + ir.getUnitCode(), ir);
                return ir;
            }
        }
        throw new RuntimeException("DBMD: createStudent : student unit record not in file");
    }

    /**
     * Need to make this method  public IStudentUnitRecord getRecordsByUnit(String unitCode) {
     * as private, due to This inspection reports all fields, methods or classes,-
     * found in the specified inspection scope, that may have their access modifier narrowed down.
     *
     *  Correct form would be :-
     *  StudentUnitRecordList getRecordsByUnit(String unitCode) {
     *
     *  Also the Line 112 :-
     * DUE TO LONG LINE OF CODE WILL NOT BE ACCEPTED .
     *  Wrong praCtice :-
     *
     *  for (Element el : (List<Element>) XMLManager.getXML().getDocument().getRootElement().getChild("studentUnitRecordTable").getChildren("record"))
     * if (studentID.toString().equals(el.getAttributeValue("sid")))
     * recs.add(new StudentUnitRecordProxy(new Integer(el.getAttributeValue("sid")), el.getAttributeValue("uid")));
     *
     *
     *  Correct form would be :-
     *
     *  for (Element el : (List<Element>) XMLManager.getXML().getDocument()
     *      .getRootElement().getChild("studentUnitRecordTable")
     *      .getChildren("record")){
     *           if (unitCode.equals(el.getAttributeValue("uid")))
     *             recs.add(
     *                  new StudentUnitRecordProxy(new Integer(el.getAttributeValue("sid")),
     *                  el.getAttributeValue("uid")));
     *      }
     * */
    public StudentUnitRecordList getRecordsByUnit(String unitCode) {
        StudentUnitRecordList recs = ur.get(unitCode);
        if (recs != null) return recs;
        recs = new StudentUnitRecordList();
        for (Element el : (List<Element>) XMLManager.getXML().getDocument().getRootElement().getChild("studentUnitRecordTable").getChildren("record")) {
            if (unitCode.equals(el.getAttributeValue("uid")))
                recs.add(new StudentUnitRecordProxy(new Integer(el.getAttributeValue("sid")), el.getAttributeValue("uid")));
        }
        if (recs.size() > 0)
            ur.put(unitCode, recs); // be careful - this could be empty
        // Unclear Comment... Please provide more information
        return recs;
    }

    /**
     * Need to make this method  public StudentUnitRecordList getRecordsByStudent(Integer studentID) {
     * as private, due to This inspection reports all fields, methods or classes,-
     * found in the specified inspection scope, that may have their access modifier narrowed down.
     *
     *  Correct form would be :-
     *  StudentUnitRecordList getRecordsByStudent(Integer studentID) {
     *
     *  Also the Line 112 :-
     * DUE TO LONG, IN ONE LINE OF CODE WILL NOT BE ACCEPTED .
     *  Wrong praCtice :-
     *
     *  for (Element el : (List<Element>) XMLManager.getXML().getDocument().getRootElement().getChild("studentUnitRecordTable").getChildren("record"))
     * if (studentID.toString().equals(el.getAttributeValue("sid")))
     * recs.add(new StudentUnitRecordProxy(new Integer(el.getAttributeValue("sid")), el.getAttributeValue("uid")));
     *
     *
     *  Correct form would be :-
     *
     *  for (Element el : (List<Element>) XMLManager.getXML().getDocument()
     *      .getRootElement().getChild("studentUnitRecordTable")
     *      .getChildren("record")){
     *           if (unitCode.equals(el.getAttributeValue("uid")))
     *             recs.add(
     *                  new StudentUnitRecordProxy(new Integer(el.getAttributeValue("sid")),
     *                  el.getAttributeValue("uid")));
     *      }
     *      Developer have pointed out Line 165 :- be careful - this could be empty ...
     *
     *      Unclear comment. Please explain in a proper form.
     *
     * */

    public StudentUnitRecordList getRecordsByStudent(Integer studentID) {
        StudentUnitRecordList recs = sr.get(studentID);
        if (recs != null) return recs;
        recs = new StudentUnitRecordList();
        for (Element el : (List<Element>) XMLManager.getXML().getDocument().getRootElement().getChild("studentUnitRecordTable").getChildren("record"))
            if (studentID.toString().equals(el.getAttributeValue("sid")))
                recs.add(new StudentUnitRecordProxy(new Integer(el.getAttributeValue("sid")), el.getAttributeValue("uid")));
        if (recs.size() > 0)
            sr.put(studentID, recs); // be careful - this could be empty // Un clear comment what does that mean
        return recs;
    }

    /**
     *One Long line of code :
     *
     * Wrong practice :- Line 221 and Line 222
     * 
     * Correct practice :-
     * for (Element el : (List<Element>) XMLManager.getXML().getDocument()
     *      .getRootElement().getChild("studentUnitRecordTable")
     *      .getChildren("record")) {
     *          if (irec.getStudentID().toString().equals(el.getAttributeValue("sid"))
     *                      && irec.getUnitCode().equals(el.getAttributeValue("uid"))) {
     *              el.setAttribute("asg1", new Float(irec.getAsg1()).toString());

     *
     *
     * Reports unnecessary creation of temporary objects when converting from primitive types to Strings.
     * For example:
     * new Integer(3).toString()
     *
     * will be reported, and can be automatically converted to:
     * Integer.toString(3)
     *
     * Wrong Practice :-
     *
     * el.setAttribute("asg2", new Float(irec.getAsg2()).toString());
     * el.setAttribute("exam", new Float(irec.getExam()).toString());
     * el.setAttribute("asg1", new Float(irec.getAsg1()).toString());
     *
     * Correct Practice:-
     *
     * Float.toString(irec.getExam());
     * Float.toString(irec.getAsg1());
     * Float.toString(irec.getAsg2());
     *
     *
     * */

    public void saveRecord(IStudentUnitRecord irec) {
        for (Element el : (List<Element>) XMLManager.getXML().getDocument().getRootElement().getChild("studentUnitRecordTable").getChildren("record")) {
            if (irec.getStudentID().toString().equals(el.getAttributeValue("sid")) && irec.getUnitCode().equals(el.getAttributeValue("uid"))) {
                el.setAttribute("asg1", new Float(irec.getAsg1()).toString());


                el.setAttribute("asg2", new Float(irec.getAsg2()).toString());
                el.setAttribute("exam", new Float(irec.getExam()).toString());
                XMLManager.getXML().saveDocument(); //write out the XML file for continuous save
                return;
            }
        }
        throw new RuntimeException("DBMD: saveRecord : no such student record in data");
        // Best practice to use try catch throw expection would be fine.
    }
}
