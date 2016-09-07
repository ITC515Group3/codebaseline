package datamanagement;

import java.util.List;
import org.jdom.*;

public class UnitManager {
	private static UnitManager self = null;
    /* The variable name should meaningful */
	private UnitMap UM;

	public static UnitManager UM() {
		if (self == null)
			self = new UnitManager();
		return self;
	}

	private UnitManager() {
		UM = new UnitMap();
	}

	public IUnit getUnit(String uc) {
		IUnit iu = UM.get(uc);
		return iu != null ? iu : createUnit(uc);
	}

	private IUnit createUnit(String unitCode) {
        /* The variable name should be meaningful */
		IUnit iu;

        /* suggest init a list variable before use. */
		for (Element el : (List<Element>) XMLManager.getXML().getDocument()
				.getRootElement().getChild("unitTable").getChildren("unit"))
			if (unitCode.equals(el.getAttributeValue("uid"))) {
				StudentUnitRecordList slist;
                /* slist is never used*/
				slist = null;
                /* unboxing can be safely removed
                * Suggestion:
                * iu = new Unit(el.getAttributeValue("uid"),
				*		el.getAttributeValue("name"), Float.valueOf(
                *        el.getAttributeValue("ps")), Float
                *        .valueOf(el.getAttributeValue("cr")), Float.valueOf(
                *        el.getAttributeValue("di")), Float
                *        .valueOf(el.getAttributeValue("hd")), Float.valueOf(
                *        el.getAttributeValue("ae")),
                *        Integer.valueOf(el.getAttributeValue("asg1wgt")), Integer.valueOf(
                *        el.getAttributeValue("asg2wgt")),
                *        Integer.valueOf(el.getAttributeValue("examwgt")), StudentUnitRecordManager
				*				.instance().getRecordsByUnit(unitCode));
				* UM.put(iu.getUnitCode(), iu);
				*/
				iu = new Unit(el.getAttributeValue("uid"),
						el.getAttributeValue("name"), Float.valueOf(
								el.getAttributeValue("ps")).floatValue(), Float
								.valueOf(el.getAttributeValue("cr"))
								.floatValue(), Float.valueOf(
								el.getAttributeValue("di")).floatValue(), Float
								.valueOf(el.getAttributeValue("hd"))
								.floatValue(), Float.valueOf(
								el.getAttributeValue("ae")).floatValue(),
						Integer.valueOf(el.getAttributeValue("asg1wgt"))
								.intValue(), Integer.valueOf(
								el.getAttributeValue("asg2wgt")).intValue(),
						Integer.valueOf(el.getAttributeValue("examwgt"))
								.intValue(), StudentUnitRecordManager
								.instance().getRecordsByUnit(unitCode));
				UM.put(iu.getUnitCode(), iu);
				return iu;
			}
		throw new RuntimeException("DBMD: createUnit : unit not in file");
	}

	public UnitMap getUnits() {
        /* The variable name should meaningful */
        UnitMap uM;
		IUnit iu;

		uM = new UnitMap();
        /* suggest init a list variable before use. */
		for (Element el : (List<Element>) XMLManager.getXML().getDocument()
				.getRootElement().getChild("unitTable").getChildren("unit")) {
			iu = new UnitProxy(el.getAttributeValue("uid"),
					el.getAttributeValue("name"));
			uM.put(iu.getUnitCode(), iu);
		} // unit maps are filled with PROXY units
		return uM;
	}
}
