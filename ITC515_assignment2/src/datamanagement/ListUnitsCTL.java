package datamanagement;
public class ListUnitsCTL {
    private UnitManager um;
public ListUnitsCTL() { um = UnitManager.UM(); } //Error: opening and closing braces should not be in one line  and indentation. method is not validated
            public void listUnits( IUnitLister lister ) {
lister.clearUnits();UnitMap units = um.getUnits(); //indentation
        for (String s : units.keySet() ) //semicolon missing in empty for statement and indentation
            lister.addUnit(units.get(s));}} //closing braces should be on different line and indentation
