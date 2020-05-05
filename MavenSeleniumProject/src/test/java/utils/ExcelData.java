package utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ExcelData {
	
	Map<String, ArrayList<String>> resultMap = new HashMap<String, ArrayList<String>>();

    private String ParaName;

    private String ParaValue;

	public String getParaName() {
		return ParaName;
	}

	public void setParaName(String paraName) {
		ParaName = paraName;
	}

	public String getParaValue() {
		return ParaValue;
	}

	public void setParaValue(String paraValue) {
		ParaValue = paraValue;
	}

	@Override
	public String toString() {
		return "ExcelData [ParaName=" + ParaName + ", ParaValue=" + ParaValue + "]";
	}
	
	

    
}